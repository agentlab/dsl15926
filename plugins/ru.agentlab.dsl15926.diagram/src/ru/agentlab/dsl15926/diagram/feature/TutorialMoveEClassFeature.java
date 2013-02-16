package ru.agentlab.dsl15926.diagram.feature;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class TutorialMoveEClassFeature extends DefaultMoveShapeFeature {
	 
    public TutorialMoveEClassFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    @Override
    public boolean canMoveShape(IMoveShapeContext context) {
        boolean canMove = super.canMoveShape(context);
 
        if (canMove) {
            Shape shape = context.getShape();
            Object bo = getBusinessObjectForPictogramElement(shape);
            if (bo instanceof EClass) {
                EClass c = (EClass) bo;
                if (c.getName() != null && c.getName().length() == 1) {
                    canMove = false;
                }
            }
        }
        return canMove;
    }
    
    
}