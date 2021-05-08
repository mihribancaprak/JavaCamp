package loginRegisterSimulation;

import loginRegisterSimulation.business.abstracts.UserServices;
import loginRegisterSimulation.business.concretes.UserManager;
import loginRegisterSimulation.core.concretes.EmailVerficationManager;
import loginRegisterSimulation.core.concretes.LoginControllerManager;
import loginRegisterSimulation.core.concretes.jGoogleAdapter;
import loginRegisterSimulation.dataAccess.concretes.HibernateUserDao;
import loginRegisterSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
      
		User user1 = new User(1,"Mihriban","Þahin","mihriban@gmail.com","19051905");
		User user2 = new User(2,"Emrah","Þahin","emrah@gmail","123456");
		User user3 = new User(3,"Alin","Þ","alin@gmail.com","5879463");
		User user4 = new User(4,"Miem","Þahin","miem@gmail.com","12");
		User user5 = new User(5,"Mih","þah","mihriban@gmail.com","123457");
		
		UserServices userServices = new UserManager(new LoginControllerManager(),new HibernateUserDao(),new EmailVerficationManager(),new jGoogleAdapter());
		userServices.register(user1);
		
		System.out.println("----------------");
		userServices.register(user2);
		
		System.out.println("----------------");
		userServices.register(user3);

		System.out.println("----------------");
		userServices.register(user4);
			
		System.out.println("----------------");
		userServices.login("mihriban@gmail.com", "19051905");
		
		System.out.println("----------------");
		userServices.login("abc@", "12");
		
		System.out.println("----------------");
		userServices.register(user5);
	}

}
