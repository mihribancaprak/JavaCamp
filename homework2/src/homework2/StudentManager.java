package homework2;

public class StudentManager extends UserManager {
    
	@Override
	public void add(User[] users) {
	   
	   for(User user : users) {
		   
			System.out.println("Ögrenci eklendi : " + user.getFirstName() +" "+ user.getLastName() );

	   }
	}

    public void listRegisteredCourse(Student[] students) {
    	
    	for(Student student : students ) {
			System.out.println(student.getFirstName() +" "+ student.getLastName() + "'in "+ "Kayıtlı Kursları listelendi :" + student.getRegisteredCourses());
		}
		
	}
	
	public void listFinishedCourse(Student[] students) {
		
		for(Student student : students ) {
			System.out.println(student.getFirstName() +" "+ student.getLastName()+"'in "+ "Biten Kursları listelendi :" + student.getFinishedCourses());
		}
	}
}
