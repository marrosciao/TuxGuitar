/*
 * Created on 17-dic-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.herac.tuxguitar.app.actions.file;

import org.herac.tuxguitar.app.TuxGuitar;
import org.herac.tuxguitar.app.actions.Action;
import org.herac.tuxguitar.app.actions.ActionData;
import org.herac.tuxguitar.app.actions.ActionLock;

/**
 * @author julian
 * 
 * TODO To change the template for this generated type comment go to Window - Preferences - Java - Code Style - Code Templates
 */
public class ExitAction extends Action {
	
	public static final String NAME = "action.file.exit";
	
	public ExitAction() {
		super(NAME, AUTO_LOCK | KEY_BINDING_AVAILABLE );
	}
	
	protected int execute(ActionData actionData){
		ActionLock.unlock();
		TuxGuitar.instance().getShell().close();
		return 0;
	}
}
