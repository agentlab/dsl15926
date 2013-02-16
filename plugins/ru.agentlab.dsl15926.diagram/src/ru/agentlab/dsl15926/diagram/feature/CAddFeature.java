package ru.agentlab.dsl15926.diagram.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import ru.agentlab.dsl15926.Template;

public class CAddFeature extends AbstractAddShapeFeature {

	private static final IColorConstant E_CLASS_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant E_CLASS_FOREGROUND = new ColorConstant(0, 0, 0);
	private static final IColorConstant E_CLASS_BACKGROUND = new ColorConstant(255, 255, 255);
	
	public CAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof Template) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	public PictogramElement add(IAddContext context) {
		Template addedClass = (Template) context.getNewObject();
		if (addedClass.eResource() == null) {
			getDiagram().eResource().getContents().add(addedClass);
		}
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		
		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape mainContainerShape = peCreateService.createContainerShape(
				targetDiagram, true);
//		ContainerShape containerShape = peCreateService.createContainerShape(
//				mainContainerShape, true);
//		ContainerShape containerShape1 = peCreateService.createContainerShape(
//				mainContainerShape, true);
		// define a default size for the shape
		int width = 100;
		int height = 40;
		IGaService gaService = Graphiti.getGaService();

		{
			RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(mainContainerShape,
					2, 2);
			roundedRectangle.setForeground(manageColor(E_CLASS_FOREGROUND));
			roundedRectangle.setBackground(manageColor(E_CLASS_BACKGROUND));
			roundedRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roundedRectangle, context.getX(),
					context.getY(), width, height);

			link(mainContainerShape, addedClass);
		}

		// SHAPE WITH LINE
//		{
//			RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(containerShape1,
//					2, 2);
//			roundedRectangle.setForeground(manageColor(E_CLASS_FOREGROUND));
//			roundedRectangle.setBackground(manageColor(E_CLASS_BACKGROUND));
//			roundedRectangle.setLineWidth(2);
//			gaService.setLocationAndSize(roundedRectangle, context.getX()-200,
//					context.getY(), width, height);
//
//			link(containerShape, addedClass);
//		}

		// SHAPE WITH TEXT
//		{
//			Shape shape = peCreateService.createShape(containerShape, false);
//
//			Text text = gaService.createText(shape, addedClass.getLabel());
//			text.setForeground(manageColor(E_CLASS_TEXT_FOREGROUND));
//			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
//			text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
//			gaService.setLocationAndSize(text, 0, height/4 - 10, width, 20);
//			
//			Shape shape2 = peCreateService.createShape(containerShape, false);
//
//			Text text2 = gaService.createText(shape2, "Class");
//			text2.setForeground(manageColor(E_CLASS_TEXT_FOREGROUND));
//			text2.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
//			text2.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
//			gaService.setLocationAndSize(text2, 0, height/4*3 - 10, width, 20);
//
//			link(shape2, addedClass);
//		}
		
        peCreateService.createChopboxAnchor(mainContainerShape);
 
        layoutPictogramElement(mainContainerShape);

		return mainContainerShape;
	}
}
