package ru.agentlab.dsl15926.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import ru.agentlab.dsl15926.Classification;
import ru.agentlab.dsl15926.Specialization;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateInstance;
import ru.agentlab.dsl15926.TemplateRole;
import ru.agentlab.dsl15926.diagram.feature.ClassAddFeature;
import ru.agentlab.dsl15926.diagram.feature.ClassCreateFeature;
import ru.agentlab.dsl15926.diagram.feature.ClassDirectEditEClassFeature;
import ru.agentlab.dsl15926.diagram.feature.ClassRenameFeature;
import ru.agentlab.dsl15926.diagram.feature.ClassUpdateFeature;
import ru.agentlab.dsl15926.diagram.feature.ClassificationAddFeature;
import ru.agentlab.dsl15926.diagram.feature.ClassificationCreateFeature;
import ru.agentlab.dsl15926.diagram.feature.SpecializationAddFeature;
import ru.agentlab.dsl15926.diagram.feature.SpecializationCreateFeature;
import ru.agentlab.dsl15926.diagram.feature.TemplateAddFeature;
import ru.agentlab.dsl15926.diagram.feature.TemplateCreateFeature;
import ru.agentlab.dsl15926.diagram.feature.TemplateInstanceAddFeature;
import ru.agentlab.dsl15926.diagram.feature.TemplateInstanceCreateFeature;
import ru.agentlab.dsl15926.diagram.feature.TemplateRoleAddFeature;
import ru.agentlab.dsl15926.diagram.feature.TemplateRoleCreateFeature;

public class Dsl15926FeatureProvider extends DefaultFeatureProvider {

	public Dsl15926FeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}
	
	@Override
	public IDirectEditingFeature getDirectEditingFeature(
	    IDirectEditingContext context) {
	    PictogramElement pe = context.getPictogramElement();
	    Object bo = getBusinessObjectForPictogramElement(pe);
	    if (bo instanceof ru.agentlab.dsl15926.Class) {
	        return new ClassDirectEditEClassFeature(this);
	    }
	    return super.getDirectEditingFeature(context);
	} 
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context.getNewObject() instanceof ru.agentlab.dsl15926.Class) {
	        return new ClassAddFeature(this);
	    } else if (context.getNewObject() instanceof Classification) {
	        return new ClassificationAddFeature(this);
	    } else if (context.getNewObject() instanceof Template) {
	        return new TemplateAddFeature(this);
	    } else if (context.getNewObject() instanceof TemplateRole) {
	        return new TemplateRoleAddFeature(this);
	    } else if (context.getNewObject() instanceof Specialization) {
	        return new SpecializationAddFeature(this);
	    } else if (context.getNewObject() instanceof TemplateInstance) {
	        return new TemplateInstanceAddFeature(this);
	    }
	    return super.getAddFeature(context);
	}
	
	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { 
				new TemplateCreateFeature(this),
				new TemplateInstanceCreateFeature(this),
				new ClassCreateFeature(this) 
			};
	}
	
	@Override
	 public ICreateConnectionFeature[] getCreateConnectionFeatures() {
	    return new ICreateConnectionFeature[] {
	    		new TemplateRoleCreateFeature(this),
	    		new ClassificationCreateFeature (this),
	    		new SpecializationCreateFeature(this)};
	 } 
	
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
	    return new ICustomFeature[] { new ClassRenameFeature(this) };
	}
	
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
	   PictogramElement pictogramElement = context.getPictogramElement();
	   if (pictogramElement instanceof ContainerShape) {
	       Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	       if (bo instanceof ru.agentlab.dsl15926.Class) {
	           return new ClassUpdateFeature(this);
	       }
	   }
	   return super.getUpdateFeature(context);
	} 
}
