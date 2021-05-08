package loginRegisterSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import loginRegisterSimulation.dataAccess.abstracts.UserDao;
import loginRegisterSimulation.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	public List<User> users;
	
    public HibernateUserDao() {
    	this.users = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
	
	  this.users.add(user);
      System.out.println("Hibernate ile kullanýcý sisteme eklendi : " + user.getFirstName());		
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}
	
}
