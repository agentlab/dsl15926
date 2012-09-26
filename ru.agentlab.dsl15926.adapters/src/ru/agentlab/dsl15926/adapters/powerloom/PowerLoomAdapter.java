package ru.agentlab.dsl15926.adapters.powerloom;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.Dsl15926Package;
import edu.isi.powerloom.PLI;
import edu.isi.powerloom.PlIterator;

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
				switch (notification.getEventType()) {
				case Notification.SET: {
					break;
				}
				case Notification.ADD: {
					break;
				}
				case Notification.ADD_MANY: {
					break;
				}
				}
				break;
			}
			}
			
		}
	}

	
}
