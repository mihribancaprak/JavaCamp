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
		System.out.println("Email Kontrolü Baþarýlý");

		if(!loginControllerServices.isValidPassword(user.getPassword())){
			return;
		}
		System.out.println("Parola Kontrolü Baþarýlý");
		if(!loginControllerServices.isValidFirstName(user.getFirstName())) {
			return;
		}
		System.out.println("Ýsim Kontrolü Baþarýlý");

		if(!loginControllerServices.isValidLastName(user.getLastName())) {
			return;
		}
		System.out.println("Soyadý Kontrolü Baþarýlý");
	
		userDao.add(user);
		emailVerificationServices.sendVerificationEmail(user);
		System.out.println("Sayýn " + user.getFirstName() +" " + user.getLastName() + " Kayýt iþleminiz baþarýlý ile gerçekleþti.");
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
				System.out.println("Sisteme Giriþ Baþarýlý");
				return;
			}
			else {
				System.out.println("Hatalý email ya da parola girdiniz.Giriþ Baþarýsýz! ");
			}
		}
	}
   
}
