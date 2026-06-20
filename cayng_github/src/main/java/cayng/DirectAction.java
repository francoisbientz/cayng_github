package cayng;

import ng.appserver.NGActionResults;
import ng.appserver.directactions.NGDirectAction;
import ng.appserver.NGRequest;

public class DirectAction extends NGDirectAction {

	public DirectAction(NGRequest request) {
		super(request);
	}

	public NGActionResults defaultAction() {
		return pageWithName(cayng.components.Main.class);
	}
}
