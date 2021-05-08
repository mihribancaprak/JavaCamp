package loginRegisterSimulation.core.concretes;

import loginRegisterSimulation.core.abstracts.EmailVerificationServices;
import loginRegisterSimulation.entities.concretes.User;

public class EmailVerficationManager implements EmailVerificationServices {

	@Override
	public void sendVerificationEmail(User user) {
        System.out.println(user.getEmail() + " adresinize doğrulama emaili gönderildi");	
                
        System.out.println(user.getEmail() + " adresinize gönderilen doğrulama emailine tıklayınız");
	
	}
	

}
