package loginRegisterSimulation.dataAccess.abstracts;

import java.util.List;

import loginRegisterSimulation.entities.concretes.User;

public interface UserDao {
	
   void add(User user);
   List<User> getAll();
   
}
