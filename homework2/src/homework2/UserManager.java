package homework2;

public class UserManager {
	
   public void add(User[] users) {
		
		for(User user : users) {
			   
			System.out.println("Kullan�c� eklendi : " + user.getFirstName() +" "+ user.getLastName() );	
	   }
	}
	
	public void list(User[] users) {
		for (User user : users) {
			System.out.println("Kullan�c�lar listelendi :" + user.getFirstName()+" "+ user.getLastName());
		}		
	}
}
