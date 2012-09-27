package ru.agentlab.dsl15926.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.diagram.edit.parts.ClassLabelEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.IndividualLabelEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateLabelEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleLabelEditPart;
import ru.agentlab.dsl15926.diagram.parsers.MessageFormatParser;
import ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry;

/**
 * @generated
 */
public class Dsl15926ParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser classLabel_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClassLabel_5001Parser() {
		if (classLabel_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Dsl15926Package.eINSTANCE
					.getNamedElement_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classLabel_5001Parser = parser;
		}
		return classLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateLabel_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateLabel_5002Parser() {
		if (templateLabel_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Dsl15926Package.eINSTANCE
					.getNamedElement_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			templateLabel_5002Parser = parser;
		}
		return templateLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser individualLabel_5003Parser;

	/**
	 * @generated
	 */
	private IParser getIndividualLabel_5003Parser() {
		if (individualLabel_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Dsl15926Package.eINSTANCE
					.getNamedElement_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			individualLabel_5003Parser = parser;
		}
		return individualLabel_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser templateRoleLabel_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTemplateRoleLabel_6001Parser() {
		if (templateRoleLabel_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { Dsl15926Package.eINSTANCE
					.getNamedElement_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			templateRoleLabel_6001Parser = parser;
		}
		return templateRoleLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClassLabelEditPart.VISUAL_ID:
			return getClassLabel_5001Parser();
		case TemplateLabelEditPart.VISUAL_ID:
			return getTemplateLabel_5002Parser();
		case IndividualLabelEditPart.VISUAL_ID:
			return getIndividualLabel_5003Parser();
		case TemplateRoleLabelEditPart.VISUAL_ID:
			return getTemplateRoleLabel_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Dsl15926VisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Dsl15926VisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Dsl15926ElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
