package homework2;

public class InstructorManager extends UserManager {
	
	 @Override
		public void add(User[] users) {
			 
			 for(User user : users) {
				   
			   System.out.println("E�itmen eklendi : " + user.getFirstName() +" "+ user.getLastName());

			}
		}

		public void listEducations(Instructor[] instructors) {
			
			for(Instructor instructor : instructors) {
				
				System.out.println(instructor.getFirstName() +" "+ instructor.getLastName() +"'in " +"E�itimleri listelendi :" + instructor.getEducations());
			}
			
		}		
}
