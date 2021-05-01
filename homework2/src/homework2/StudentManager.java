package homework2;

public class StudentManager extends UserManager {
    
	@Override
	public void add(User[] users) {
	   
	   for(User user : users) {
		   
			System.out.println("�grenci eklendi : " + user.getFirstName() +" "+ user.getLastName() );

	   }
	}

    public void listRegisteredCourse(Student[] students) {
    	
    	for(Student student : students ) {
			System.out.println(student.getFirstName() +" "+ student.getLastName() + "'in "+ "Kay�tl� Kurslar� listelendi :" + student.getRegisteredCourses());
		}
		
	}
	
	public void listFinishedCourse(Student[] students) {
		
		for(Student student : students ) {
			System.out.println(student.getFirstName() +" "+ student.getLastName()+"'in "+ "Biten Kurslar� listelendi :" + student.getFinishedCourses());
		}
	}
}
