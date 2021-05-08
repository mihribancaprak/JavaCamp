package loginRegisterSimulation.core.abstracts;

import loginRegisterSimulation.entities.concretes.User;

public interface EmailVerificationServices {
	
	void sendVerificationEmail(User user);	
	
}
