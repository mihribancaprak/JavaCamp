package loginRegisterSimulation.business.abstracts;

import loginRegisterSimulation.entities.concretes.User;

public interface UserServices {
   
	 void register(User user);
	 void login(String email,String password);	 
	 void checkEmail(String email);
}
