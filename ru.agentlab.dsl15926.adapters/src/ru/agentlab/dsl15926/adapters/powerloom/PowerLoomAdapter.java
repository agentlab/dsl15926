package ru.agentlab.dsl15926.adapters.powerloom;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.Dsl15926Package;
import edu.isi.powerloom.PLI;

public class PowerLoomAdapter extends EContentAdapter{

	public PowerLoomAdapter() {
		super();
		start();
	}
	
	public void start(){
		PLI.initialize();
		PLI.sCreateModule("PL-USER-TEST", "PL-KERNEL", Boolean.FALSE, null);
		PLI.sChangeModule("PL-USER-TEST", null);
	}
	
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		
		if (notification.getNotifier() instanceof ru.agentlab.dsl15926.Class){
			ru.agentlab.dsl15926.Class clazz = (ru.agentlab.dsl15926.Class) notification.getNotifier();
			switch (notification.getFeatureID(ru.agentlab.dsl15926.Class.class)) {
			case Dsl15926Package.CLASS__LABEL: {
				switch (notification.getEventType()) {
				case Notification.SET: {
					String oldName = notification.getOldStringValue();
					String newName = notification.getNewStringValue();
					if (oldName != null && oldName.length() > 0){
						PLI.sDestroyObject(oldName, null, null);
						System.out.println("(destroy " + oldName + ")");
					}
					if (newName != null && newName.length() > 0){
						PLI.sCreateConcept(newName, null, null, null);
						System.out.println("(defconcept " + newName + ")");
					}
					break;
				}
				}
				break;
			}
			case Dsl15926Package.CLASS__SUB_CLASS_OF: {
				StringBuilder sb = new StringBuilder();
				for (AbstractObject obj : clazz.getSubClassOf()) {
					sb.append(" ");
					sb.append(obj.getLabel());
				}
				String command = "(defconcept " + clazz.getLabel() + " (?x" + sb.toString() + "))";

				if (command.length() > 0) {
					PLI.sEvaluate(command, null, null);
					System.out.println(command);
				}
				break;
			}
			case Dsl15926Package.CLASS__EQUIVALENT_CLASSES: {
				switch (notification.getEventType()) {
				case Notification.ADD: {
					String command = "(assert (synonym " + clazz.getLabel() + " " + ((ru.agentlab.dsl15926.Class)notification.getNewValue()).getLabel() + "))";
					if (command.length() > 0) {
						PLI.sEvaluate(command, null, null);
						System.out.println(command);
					}
					break;
				}
				}
				break;
			}
			}
			
		}
	}

	
}
