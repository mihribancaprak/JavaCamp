package loginRegisterSimulation.core.concretes;

import loginRegisterSimulation.core.abstracts.EmailVerificationServices;
import loginRegisterSimulation.entities.concretes.User;

public class EmailVerficationManager implements EmailVerificationServices {

	@Override
	public void sendVerificationEmail(User user) {
        System.out.println(user.getEmail() + " adresinize do�rulama emaili g�nderildi");	
                
        System.out.println(user.getEmail() + " adresinize g�nderilen do�rulama emailine t�klay�n�z");
	
	}
	

}
