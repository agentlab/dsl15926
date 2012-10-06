package ru.agentlab.dsl15926.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ru.agentlab.dsl15926.diagram.providers.Dsl15926ElementTypes;

/**
 * @generated
 */
public class Dsl15926PaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createISO15926Concepts1Group());
		paletteRoot.add(createISO15926Relations2Group());
	}

	/**
	 * Creates "ISO 15926 Concepts" palette tool group
	 * @generated
	 */
	private PaletteContainer createISO15926Concepts1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ISO15926Concepts1Group_title);
		paletteContainer.setId("createISO15926Concepts1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.ISO15926Concepts1Group_desc);
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createIndividual2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createTemplate4CreationTool());
		paletteContainer.add(createTemplateInstance5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "ISO 15926 Relations" palette tool group
	 * @generated
	 */
	private PaletteContainer createISO15926Relations2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ISO15926Relations2Group_title);
		paletteContainer.setId("createISO15926Relations2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.ISO15926Relations2Group_desc);
		paletteContainer.add(createTemplateRole1CreationTool());
		paletteContainer.add(createTemplateRoleInstance2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Class1CreationTool_title,
				Messages.Class1CreationTool_desc,
				Collections.singletonList(Dsl15926ElementTypes.Class_2002));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Dsl15926ElementTypes
				.getImageDescriptor(Dsl15926ElementTypes.Class_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndividual2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Individual2CreationTool_title,
				Messages.Individual2CreationTool_desc,
				Collections.singletonList(Dsl15926ElementTypes.Individual_2004));
		entry.setId("createIndividual2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Dsl15926ElementTypes
				.getImageDescriptor(Dsl15926ElementTypes.Individual_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplate4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Template4CreationTool_title,
				Messages.Template4CreationTool_desc,
				Collections.singletonList(Dsl15926ElementTypes.Template_2003));
		entry.setId("createTemplate4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Dsl15926ElementTypes
				.getImageDescriptor(Dsl15926ElementTypes.Template_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateInstance5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateInstance5CreationTool_title,
				Messages.TemplateInstance5CreationTool_desc,
				Collections
						.singletonList(Dsl15926ElementTypes.TemplateInstance_2001));
		entry.setId("createTemplateInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Dsl15926ElementTypes
				.getImageDescriptor(Dsl15926ElementTypes.TemplateInstance_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateRole1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TemplateRole1CreationTool_title,
				Messages.TemplateRole1CreationTool_desc,
				Collections
						.singletonList(Dsl15926ElementTypes.TemplateRole_4002));
		entry.setId("createTemplateRole1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Dsl15926ElementTypes
				.getImageDescriptor(Dsl15926ElementTypes.TemplateRole_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateRoleInstance2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TemplateRoleInstance2CreationTool_title,
				Messages.TemplateRoleInstance2CreationTool_desc,
				Collections
						.singletonList(Dsl15926ElementTypes.TemplateRoleInstance_4001));
		entry.setId("createTemplateRoleInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Dsl15926ElementTypes
				.getImageDescriptor(Dsl15926ElementTypes.TemplateRoleInstance_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
