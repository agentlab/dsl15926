package ru.agentlab.dsl15926.diagram.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class ClassDirectEditEClassFeature extends
		AbstractDirectEditingFeature {

	public ClassDirectEditEClassFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean isAutoCompletionEnabled() {
		return true;
	}

	public int getEditingType() {
		return TYPE_DROPDOWN_READ_ONLY;
	}

	@Override
	public boolean stretchFieldToFitText() {
		return true;
	}

	@Override
	public String[] getPossibleValues(IDirectEditingContext context) {
		// TODO Auto-generated method stub
		return new String[] { "sdfff", "ssdffds", "ggdf", "f32", "44tt",
				"ssdffds", "ggdf", "f32", "44tt", "ssdffds", "ggdf", "f32",
				"44tt", "ssdffds", "ggdf", "f32", "44tt", "ssdffds", "ggdf",
				"f32", "44tt", "ssdffds", "ggdf", "f32", "44tt", "ssdffds",
				"ggdf", "f32", "44tt", "ssdffds", "ggdf", "f32", "44tt",
				"ssdffds", "ggdf", "f32", "44tt", "ssdffds", "ggdf", "f32",
				"44tt" };
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		// support direct editing, if it is a EClass, and the user clicked
		// directly on the text and not somewhere else in the rectangle
		if (bo instanceof ru.agentlab.dsl15926.Class && ga instanceof Text) {
			return true;
		}
		// direct editing not supported in all other cases
		return false;
	}

	public String getInitialValue(IDirectEditingContext context) {
		// return the current name of the EClass
		PictogramElement pe = context.getPictogramElement();
		ru.agentlab.dsl15926.Class eClass = (ru.agentlab.dsl15926.Class) getBusinessObjectForPictogramElement(pe);
		return eClass.getLabel();
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if (value.length() < 1)
			return "Please enter any text as class name.";
		if (value.contains(" "))
			return "Spaces are not allowed in class names.";
		if (value.contains("\n"))
			return "Line breakes are not allowed in class names.";

		// null means, that the value is valid
		return null;
	}

	public void setValue(String value, IDirectEditingContext context) {
		// set the new name for the EClass
		PictogramElement pe = context.getPictogramElement();
		ru.agentlab.dsl15926.Class eClass = (ru.agentlab.dsl15926.Class) getBusinessObjectForPictogramElement(pe);
		eClass.setLabel(value);

		// Explicitly update the shape to display the new value in the diagram
		// Note, that this might not be necessary in future versions of Graphiti
		// (currently in discussion)

		// we know, that pe is the Shape of the Text, so its container is the
		// main shape of the EClass
		updatePictogramElement(((Shape) pe).getContainer());
	}
}
