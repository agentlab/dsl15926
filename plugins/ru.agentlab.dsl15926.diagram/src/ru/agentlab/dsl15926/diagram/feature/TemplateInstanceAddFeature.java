package ru.agentlab.dsl15926.diagram.feature;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import ru.agentlab.dsl15926.TemplateInstance;

public class TemplateInstanceAddFeature extends AbstractAddShapeFeature {

	private static final IColorConstant E_CLASS_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant E_CLASS_BACKGROUND = IColorConstant.WHITE;
	private static final IColorConstant E_CLASS_TEXT_FOREGROUND = IColorConstant.BLACK;

	public TemplateInstanceAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof TemplateInstance) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	public PictogramElement add(IAddContext context) {
		TemplateInstance addedClass = (TemplateInstance) context.getNewObject();
		if (addedClass.eResource() == null) {
			getDiagram().eResource().getContents().add(addedClass);
		}
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);

		IGaService gaService = Graphiti.getGaService();

		int size = 30;
		{
			Point p1 = gaService.createPoint(0, size / 2);
			Point p2 = gaService.createPoint(size / 2, 0);
			Point p3 = gaService.createPoint(size, size / 2);
			Point p4 = gaService.createPoint(size / 2, size);

			Collection<Point> points = new ArrayList<Point>();
			points.add(p1);
			points.add(p2);
			points.add(p3);
			points.add(p4);
			points.add(p1);

			Polygon polygone = gaService.createPolygon(containerShape, points);
			polygone.setBackground(manageColor(E_CLASS_BACKGROUND));
			polygone.setForeground(manageColor(E_CLASS_FOREGROUND));
			polygone.setLineWidth(3);

			gaService.setLocationAndSize(polygone, context.getX(),
					context.getY(), size, size);

			link(containerShape, addedClass);
		}
		int size2 = 22;
//		{
//			Point p1 = gaService.createPoint(0, size2 / 2);
//			Point p2 = gaService.createPoint(size2 / 2, 0);
//			Point p3 = gaService.createPoint(size2, size2 / 2);
//			Point p4 = gaService.createPoint(size2 / 2, size2);
//
//			Collection<Point> points = new ArrayList<Point>();
//			points.add(p1);
//			points.add(p2);
//			points.add(p3);
//			points.add(p4);
//			points.add(p1);
//
//			Shape shape = peCreateService.createShape(containerShape, false);
//			
//			Polygon polygone2 = gaService.createPolygon(shape, points);
//			polygone2.setBackground(manageColor(E_CLASS_BACKGROUND));
//			polygone2.setForeground(manageColor(E_CLASS_FOREGROUND));
//			polygone2.setLineWidth(2);
//
//			gaService.setLocationAndSize(polygone2, (size-size2)/2,
//					(size-size2)/2, size2, size2);
//
////			link(containerShape, addedClass);
//		}
		ContainerShape containerShape2;
		{
			// create and set graphics algorithm
			containerShape2 = peCreateService.createContainerShape(
					targetDiagram, true);
			
			RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(containerShape2,
					2, 2);
			roundedRectangle.setForeground(manageColor(E_CLASS_FOREGROUND));
			roundedRectangle.setBackground(manageColor(E_CLASS_BACKGROUND));
			roundedRectangle.setLineWidth(2);
			gaService.setLocationAndSize(roundedRectangle, context.getX()-30,
					context.getY()-30, 100, 20);

			
			// if added Class has no resource we add it to the resource
			// of the diagram
			// in a real scenario the business model would have its own resource
			// create link and wire it
		}

		{
			Shape shape2 = peCreateService.createShape(containerShape2, false);
			Text text2 = gaService.createText(shape2, "Relationship");
			text2.setForeground(manageColor(E_CLASS_TEXT_FOREGROUND));
			text2.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text2.setFont(gaService
					.manageDefaultFont(getDiagram(), false, true));

			gaService.setLocationAndSize(text2, 0,
					0, 100, 20);

			link(shape2, addedClass);
		}

		ChopboxAnchor anchor = peCreateService.createChopboxAnchor(containerShape);
		layoutPictogramElement(containerShape);
		ChopboxAnchor anchor2 = peCreateService.createChopboxAnchor(containerShape2);
        layoutPictogramElement(containerShape2);
		
        Connection connection = peCreateService
                .createFreeFormConnection(getDiagram());
            connection.setStart(anchor);
            connection.setEnd(anchor2);
     
            Polyline polyline = gaService.createPolyline(connection);
            polyline.setLineWidth(2);
            polyline.setForeground(manageColor(E_CLASS_FOREGROUND));
            
		return containerShape;
	}
}
