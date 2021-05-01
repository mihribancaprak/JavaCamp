package homework1;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor(1, "Engin Demiroð");
		System.out.println(instructor.name);
            
	    Course course1=new Course(1, "C# KURSU","Engin Demiroð", "Yazýlým Geliþtirme");
	    Course course2=new Course(2, "JAVA-REACT KURSU","Engin Demiroð","Yazýlým Geliþtirme");
	    Course course3=new Course(3, "PROGRAMLAMAYA GÝRÝÞ","Engin Demiroð","Python,Java");
	    
	    Course[] courses = {course1,course2,course3};
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		
		CourseManager cManager = new CourseManager();
		cManager.addCourse(course1);
		cManager.deleteCourse(course3);
	}
	

}
