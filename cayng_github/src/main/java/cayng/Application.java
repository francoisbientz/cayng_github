package cayng;

import ng.appserver.NGApplication;
import ng.plugins.Routes;
import cayng.components.Main;

public class Application extends NGApplication {

	public static void main(String[] args) {
		NGApplication.run(args, Application.class);
	}

	@Override
	public Routes routes() {
		return super
				.routes()
				.map( "/", Main.class );
	}
}
