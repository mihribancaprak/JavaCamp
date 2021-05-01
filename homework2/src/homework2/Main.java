package homework2;

public class Main {

	public static void main(String[] args) {
       
		User user = new User(1,"Mihriban","Şahin","ms@gmail.com","12345");
		User user2= new User(2,"Emrah","Şahin","es@gmail.com","3456");
		User user3= new User(3,"Engin","Demirog","eg@gmail.com","95487");
		User user4= new User(4,"Kerem","Varış","kv@gmail.com","78452");
		
		User[] users = {user,user2,user3,user4};
		
		UserManager userManager=new UserManager();
		userManager.add(users);
		userManager.list(users);
			
		System.out.println("----------------------------");
		
		Student student = new Student(5,"Mihriban","Şahin","ms@gmail.com","45613","Java","C#");
		Student student2= new Student (6,"Emrah","Şahin","es@gmail.com","85454","C","React");
		
		Student[] students = {student,student2};
		
	    StudentManager studentManager=new StudentManager();
	    studentManager.add(students);
	    studentManager.listRegisteredCourse(students);
	    studentManager.listFinishedCourse(students);
		
		System.out.println("----------------------------");

	    Instructor instructor=new Instructor(7,"Engin","Demirog","eg@gmail.com","789","Java-React");
	    Instructor instructor2 = new Instructor(8, "Kerem","Varış","kv@gmail.com","8954","C#");
	    
	    Instructor[] instructors = {instructor,instructor2};
	    
	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.add(instructors);
	    instructorManager.listEducations(instructors);
	    
	}

}
