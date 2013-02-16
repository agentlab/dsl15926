package ru.agentlab.dsl15926.diagram.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import ru.agentlab.dsl15926.Classification;

public class ClassificationAddFeature extends AbstractAddFeature {

    private static final IColorConstant E_REFERENCE_FOREGROUND = IColorConstant.BLACK;
 
    public ClassificationAddFeature (IFeatureProvider fp) {
        super(fp);
    }
 
    public PictogramElement add(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        Classification addedEReference = (Classification) context.getNewObject();
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
       
        // CONNECTION WITH POLYLINE
        Connection connection = peCreateService
            .createFreeFormConnection(getDiagram());
        connection.setStart(addConContext.getSourceAnchor());
        connection.setEnd(addConContext.getTargetAnchor());
 
        IGaService gaService = Graphiti.getGaService();
        Polyline polyline = gaService.createPolyline(connection);
        polyline.setLineWidth(2);
        polyline.setForeground(manageColor(E_REFERENCE_FOREGROUND));
 
        if (addedEReference.eResource() == null) {
			getDiagram().eResource().getContents().add(addedEReference);
		}
        
        // create link and wire it
        link(connection, addedEReference);
 
    	// add static graphical decorator (composition and navigable)
        ConnectionDecorator cd = peCreateService.
        		createConnectionDecorator(connection, false, 1.0, true);
        createArrow(cd);
        return connection;
    }
    
    private Polygon createArrow(GraphicsAlgorithmContainer gaContainer) {
        IGaService gaService = Graphiti.getGaService();
        
        Polygon polyline =
            gaService.createPlainPolygon(gaContainer, new int[] { -15, 6, 0, 0, -15,
                    -6 });
        polyline.setForeground(manageColor(E_REFERENCE_FOREGROUND));
        polyline.setBackground(manageColor(E_REFERENCE_FOREGROUND));
        return polyline;
    } 
 
    public boolean canAdd(IAddContext context) {
        // return true if given business object is an EReference
        // note, that the context must be an instance of IAddConnectionContext
        if (context instanceof IAddConnectionContext
            && context.getNewObject() instanceof Classification) {
            return true;
        }
        return false;
    }
}