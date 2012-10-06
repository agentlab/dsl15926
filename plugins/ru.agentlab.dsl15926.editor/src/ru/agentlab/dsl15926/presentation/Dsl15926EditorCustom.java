package ru.agentlab.dsl15926.presentation;

import ru.agentlab.dsl15926.adapters.powerloom.PowerLoomAdapter;

public class Dsl15926EditorCustom extends Dsl15926Editor {

	@Override
	public void createModel() {
		super.createModel();
		editingDomain
				.getResourceSet()
				.getResources()
				.get(0)
				.getContents()
				.get(0)
				.eAdapters()
				.add(new PowerLoomAdapter(editingDomain.getResourceSet()
						.getResources().get(0).getContents().get(0)));
	}
}