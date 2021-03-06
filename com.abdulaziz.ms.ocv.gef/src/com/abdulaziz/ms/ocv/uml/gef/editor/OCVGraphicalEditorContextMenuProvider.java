package com.abdulaziz.ms.ocv.uml.gef.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

import com.abdulaziz.ms.ocv.multiPageEditor.action.ExportAsImageAction;
import com.abdulaziz.ms.ocv.uml.gef.action.UMLClassEditSelectionAction;

public class OCVGraphicalEditorContextMenuProvider extends ContextMenuProvider{

	private ActionRegistry actionRegistry ;
	public OCVGraphicalEditorContextMenuProvider(EditPartViewer viewer, final ActionRegistry actionRegistry) {
		super(viewer);
		this.setActionRegistry(actionRegistry);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		
		IAction action;
		action = actionRegistry.getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = actionRegistry.getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
		action = actionRegistry.getAction(ActionFactory.DELETE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
		action = actionRegistry.getAction(UMLClassEditSelectionAction.EDIT_UML_CLASS);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
	
		menu.appendToGroup(GEFActionConstants.GROUP_VIEW,getActionRegistry().getAction(GEFActionConstants.ZOOM_IN));
		menu.appendToGroup(GEFActionConstants.GROUP_VIEW,getActionRegistry().getAction(GEFActionConstants.ZOOM_OUT));

		menu.appendToGroup(GEFActionConstants.GROUP_SAVE,getActionRegistry().getAction(ExportAsImageAction.ID));
	}

	public ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	public void setActionRegistry(final ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}

}
