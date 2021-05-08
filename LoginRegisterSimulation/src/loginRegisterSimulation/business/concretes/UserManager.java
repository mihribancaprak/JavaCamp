package loginRegisterSimulation.business.concretes;

import loginRegisterSimulation.business.abstracts.UserServices;
import loginRegisterSimulation.core.abstracts.EmailVerificationServices;
import loginRegisterSimulation.core.abstracts.LoginControllerServices;
import loginRegisterSimulation.core.abstracts.jOutSideServices;
import loginRegisterSimulation.dataAccess.abstracts.UserDao;
import loginRegisterSimulation.entities.concretes.User;

public class UserManager implements UserServices{
    
	private LoginControllerServices loginControllerServices;
	private UserDao userDao;
	private EmailVerificationServices emailVerificationServices;
	private jOutSideServices jOutSideServices;
	
	public UserManager(LoginControllerServices loginControllerServices,UserDao userDao,EmailVerificationServices emailVerificationServices,jOutSideServices jOutSideServices) {
		this.loginControllerServices = loginControllerServices;
		this.userDao=userDao;
		this.emailVerificationServices=emailVerificationServices;
		this.jOutSideServices=jOutSideServices;
	}
	
    @Override
	public void checkEmail(String email) {
      for(User user : userDao.getAll()) {
    	  if(user.getEmail() == email) {
             throw new ArithmeticException("E-Posta adresi zaten mevcut");  		  
    	  }
      }		
	}
	@Override
	public void register(User user) {
		
		this.checkEmail(user.getEmail());
		
        if(!loginControllerServices.isValidEmail(user.getEmail())) {
			return;
 		}
		System.out.println("Email Kontrol� Ba�ar�l�");

		if(!loginControllerServices.isValidPassword(user.getPassword())){
			return;
		}
		System.out.println("Parola Kontrol� Ba�ar�l�");
		if(!loginControllerServices.isValidFirstName(user.getFirstName())) {
			return;
		}
		System.out.println("�sim Kontrol� Ba�ar�l�");

		if(!loginControllerServices.isValidLastName(user.getLastName())) {
			return;
		}
		System.out.println("Soyad� Kontrol� Ba�ar�l�");
	
		userDao.add(user);
		emailVerificationServices.sendVerificationEmail(user);
		System.out.println("Say�n " + user.getFirstName() +" " + user.getLastName() + " Kay�t i�leminiz ba�ar�l� ile ger�ekle�ti.");
		jOutSideServices.registerWith();
	}

	@Override
	public void login(String email, String password) {
		
		if(!loginControllerServices.isValidEmail(email)) {
			return;
		}
		if(!loginControllerServices.isValidPassword(password)) {
			return;
		}
		for(User user : userDao.getAll()) {
			if( user.getEmail() == email && user.getPassword() == password) {
				System.out.println("Sisteme Giri� Ba�ar�l�");
				return;
			}
			else {
				System.out.println("Hatal� email ya da parola girdiniz.Giri� Ba�ar�s�z! ");
			}
		}
	}
   
}
