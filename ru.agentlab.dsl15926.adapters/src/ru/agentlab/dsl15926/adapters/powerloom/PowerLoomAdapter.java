package ru.agentlab.dsl15926.adapters.powerloom;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import ru.agentlab.dsl15926.Dsl15926Package;
import edu.isi.powerloom.PLI;

public class PowerLoomAdapter extends EContentAdapter{
	
	protected static String SEPARATOR = "@";
	protected static String LABEL_FUNCTION_NAME = "label";
	protected static String MODULE_NAME = "PL-USER-TEST";
	protected static String MODULE_PARENT_NAME = "PL-KERNEL";
	
	public PowerLoomAdapter(EObject root) {
		super();
		init();
		startup(root);
	}
	
	public void init(){
		PLI.initialize();
		PLI.sCreateModule(MODULE_NAME, MODULE_PARENT_NAME, Boolean.FALSE, null);
		PLI.sChangeModule(MODULE_NAME, null);
		PLI.sClearModule(MODULE_NAME, null);
		PLI.clearCaches();
		PLI.sEvaluate("(DEFFUNCTION " + LABEL_FUNCTION_NAME + " (?x) :-> (?s STRING))", null, null);
	}
	
	public void startup(EObject root){
		long beginTime = System.currentTimeMillis();
		if (root instanceof ru.agentlab.dsl15926.Repository){
			ru.agentlab.dsl15926.Repository repository = (ru.agentlab.dsl15926.Repository) root;
			for (TreeIterator<EObject> iterator = repository.eAllContents(); iterator.hasNext();){
				EObject current = iterator.next();
				if (current instanceof ru.agentlab.dsl15926.Class){
					ru.agentlab.dsl15926.Class clazz = (ru.agentlab.dsl15926.Class) current;
					handleConceptCreation(getInstanceID(clazz));
					if (clazz.getLabel() != null && clazz.getLabel().length() > 0){
						handleNameAttributeCreation(getInstanceID(clazz), clazz.getLabel());
					}
					if (clazz.getSubClassOf() != null && !clazz.getSubClassOf().isEmpty()){
						for (ru.agentlab.dsl15926.AbstractObject superClass :clazz.getSubClassOf()){
							handleSpecialisationCreation(getInstanceID(clazz), getInstanceID(superClass));
						}
					}
				} else if (current instanceof ru.agentlab.dsl15926.Template){
					ru.agentlab.dsl15926.Template template = (ru.agentlab.dsl15926.Template) current;
					handleConceptCreation(getInstanceID(template));
					if (template.getRoles() != null && !template.getRoles().isEmpty()){
						for (ru.agentlab.dsl15926.TemplateRole role : template.getRoles()){
							handleRelationCreation(getInstanceID(role), getInstanceID(template), getInstanceID(role.getEntityType()));
						}
					}
					
				} else if (current instanceof ru.agentlab.dsl15926.Individual){
					handleIndividualCreation(getInstanceID(current));
				} else if (current instanceof ru.agentlab.dsl15926.TemplateInstance){
					handleIndividualCreation(getInstanceID(current));
				}
			}
		}
		PLI.sEvaluate("(process-definitions)", null, null);
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time of loading model to Knowledge Base: " + (endTime - beginTime) + " ms");
		System.out.println();
		System.out.println();
	}
	
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (notification.getNotifier() instanceof ru.agentlab.dsl15926.Repository){
			repositorySwitch(notification);
		}  if (notification.getNotifier() instanceof ru.agentlab.dsl15926.NamedElement){
			namedSwitch(notification);
		}  if (notification.getNotifier() instanceof ru.agentlab.dsl15926.AbstractObject){
			abstractObjectSwitch(notification);
		}  if (notification.getNotifier() instanceof ru.agentlab.dsl15926.Template){
			templateSwitch(notification);
		}
	}

	/**
	 * Get Id of instance. First - name of class, then it's hashCode. Label independent method
	 * @param object - instance, which would like to get ID
	 */
	protected String getInstanceID (Object object){
		if (object != null){
			return object.getClass().getSimpleName() + SEPARATOR + Integer.toHexString(object.hashCode());
		} else { 
			return null;
		}
	}
	
	private void handleConceptCreation(String id) {
		String cmd = "(defconcept " + id + ")";
		PLI.sCreateConcept(id, null, MODULE_NAME, null);
		System.out.println(cmd);
	}

	private void handleRelationCreation(String id, String templateId, String entityType) {
		if (entityType != null && entityType.length() > 0){
			String cmd = "(defrelation " + id + "((?x " + templateId + ") (?y " + entityType + ")))";
			PLI.sCreateConcept(id, null, MODULE_NAME, null);
			System.out.println(cmd);
		} else {
			String cmd = "(defrelation " + id + "((?x " + templateId + ") ?y))";
			PLI.sCreateConcept(id, null, MODULE_NAME, null);
			System.out.println(cmd);
		}
	}

	private void handleIndividualCreation(String id) {
		String cmd = "(defobject " + id + ")";
		PLI.sCreateObject(id, null, MODULE_NAME, null);
		System.out.println(cmd);
	}
	
	private void handleNameAttributeCreation(String id, String label) {
		String cmd = "(assert (" + LABEL_FUNCTION_NAME + " " + id + " " + "\"" + label + "\"" + "))";
		PLI.sEvaluate(cmd, MODULE_NAME, null);
		System.out.println(cmd);
	}
	
	private void handleSpecialisationCreation(String id, String superId) {
		String cmd = "(assert (forall (?c) (=> (" + id + " ?c) (" + superId + " ?c))))";
		PLI.sEvaluate(cmd, MODULE_NAME, null);
		System.out.println(cmd);
	}
	
	private void handleSpecialisationDeletion(String id, String superId) {
		String cmd = "(retract (forall (?c) (=> (" + id + " ?c) (" + superId + " ?c))))";
		PLI.sEvaluate(cmd, MODULE_NAME, null);
		System.out.println(cmd);
	}
	
	private void handleNameAttributeDeletion(String id, String label) {
		String cmd = "(retract (" + LABEL_FUNCTION_NAME + " " + id + " " + "\"" + label + "\"" + "))";
		PLI.sEvaluate(cmd, MODULE_NAME, null);
		System.out.println(cmd);
	}

	private void handleObjectDeletion(String id) {
		String cmd = "(destroy " + id + ")";
		PLI.sDestroyObject(id, MODULE_NAME, null);
		System.out.println(cmd);
	}

	private void abstractObjectSwitch(Notification notification) {
		switch (notification.getFeatureID(ru.agentlab.dsl15926.AbstractObject.class)) {
			case Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF: {
				switch (notification.getEventType()) {
					case Notification.ADD: {
							handleSpecialisationCreation(getInstanceID(notification.getNotifier()), getInstanceID(notification.getNewValue()));
						break;
					}
					case Notification.REMOVE: {
							handleSpecialisationDeletion(getInstanceID(notification.getNotifier()), getInstanceID(notification.getOldValue()));
						break;
					}
				}
				break;
			}
		}
	}

	private void namedSwitch(Notification notification) {
		switch (notification.getFeatureID(ru.agentlab.dsl15926.NamedElement.class)) {
			case Dsl15926Package.NAMED_ELEMENT__LABEL: {
				String oldName = notification.getOldStringValue();
				String newName = notification.getNewStringValue();
				if (newName != null && newName.length() > 0){
					handleNameAttributeCreation(getInstanceID(notification.getNotifier()), notification.getNewStringValue());
				} else if (oldName != null && oldName.length() > 0){
					handleNameAttributeDeletion(getInstanceID(notification.getNotifier()), notification.getOldStringValue());
				}
				break;
			}
		}
	}

	private void repositorySwitch(Notification notification) {
		int featureId = notification.getFeatureID(ru.agentlab.dsl15926.Repository.class);
		if (featureId == Dsl15926Package.REPOSITORY__CLASSES || featureId == Dsl15926Package.REPOSITORY__TEMPLATES){
			switch (notification.getEventType()) {
				case Notification.ADD: {
					handleConceptCreation(getInstanceID(notification.getNewValue()));
					break;
				}
				case Notification.REMOVE: {
					handleObjectDeletion(getInstanceID(notification.getOldValue()));
					break;
				}
			}
		} else if (featureId == Dsl15926Package.REPOSITORY__INDIVIDUALS || featureId == Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES){
			switch (notification.getEventType()) {
				case Notification.ADD: {
					handleIndividualCreation(getInstanceID(notification.getNewValue()));
					break;
				}
				case Notification.REMOVE: {
					handleObjectDeletion(getInstanceID(notification.getOldValue()));
					break;
				}
			}
		}
	}

	private void templateSwitch(Notification notification) {
		switch (notification.getFeatureID(ru.agentlab.dsl15926.Template.class)) {
			case Dsl15926Package.TEMPLATE__ROLES: {
				ru.agentlab.dsl15926.TemplateRole role = (ru.agentlab.dsl15926.TemplateRole) notification.getNewValue();
				ru.agentlab.dsl15926.Template template = (ru.agentlab.dsl15926.Template) notification.getNotifier();
				ru.agentlab.dsl15926.AbstractObject type = role.getEntityType();
				switch (notification.getEventType()) {
					case Notification.ADD: {
							handleRelationCreation(getInstanceID(role), getInstanceID(template), getInstanceID(type));
						break;
					}
					case Notification.REMOVE: {
//							handleSpecialisationDeletion(getInstanceID(notification.getNotifier()), getInstanceID(notification.getOldValue()));
						break;
					}
				}
				break;
			}
		}
	}
}
