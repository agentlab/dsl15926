package ru.agentlab.dsl15926.adapters.powerloom;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

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
		//TODO: work in progress, it's need to
		// check Notifier
		// check feature
		// check eventType
		if (notification.getNotifier() instanceof ru.agentlab.dsl15926.Class){
			ru.agentlab.dsl15926.Class clazz = (ru.agentlab.dsl15926.Class) notification.getNotifier();
			if (clazz.getLabel() != null && clazz.getLabel().length() > 0){
				PLI.sCreateConcept(clazz.getLabel(), null, null, null);
				// further is for example and testing
				PLI.sAssertProposition("(" + clazz.getLabel() + " TEST1)", null, null);
				PLI.sAssertProposition("(" + clazz.getLabel() + " TEST2)", null, null);
				PlIterator iter = PLI.sRetrieve("all (?x " + clazz.getLabel() + ")", null, null);
				while (iter.nextP()) {
					System.out.println(PLI.getNthString(iter, 0, null, null) + " is "
							+ " " + clazz.getLabel());
				}
			}
			
			
		}
	}

	
}
