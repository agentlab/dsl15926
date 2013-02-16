package ru.agentlab.dsl15926.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class Dsl15926DiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;
	
	public Dsl15926DiagramTypeProvider() {
		super();
		setFeatureProvider(new Dsl15926FeatureProvider(this));
	}

	@Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new Dsl15926ToolBehaviorProvider(
                    this) };
        }
        return toolBehaviorProviders;
    }

	@Override
	public String getDiagramTitle() {
		return "DSL 15926 Diagram";
	}
	
}
