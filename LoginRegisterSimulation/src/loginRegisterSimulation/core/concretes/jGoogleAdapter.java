package loginRegisterSimulation.core.concretes;

import loginRegisterSimulation.core.abstracts.jOutSideServices;
import loginRegisterSimulation.jGoogle.jGoogleManager;

public class jGoogleAdapter implements jOutSideServices {

	@Override
	public void registerWith() {
        jGoogleManager jGoogleManager = new jGoogleManager();
        jGoogleManager.register();
	}

	@Override
	public void loginWith() {
		jGoogleManager jGoogleManager = new jGoogleManager();
        jGoogleManager.login();	
	}
   
}
