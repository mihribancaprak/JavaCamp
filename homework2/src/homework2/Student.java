package homework2;

public class Student extends User {

	private String registeredCourses;
	private String finishedCourses;
	
	public Student(int id, String firstName, String lastName, String email, String password, String registeredCourses,
			String finishedCourses) {
		super(id, firstName, lastName, email, password);
		this.registeredCourses = registeredCourses;
		this.finishedCourses = finishedCourses;
	}

	public String getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

	public String getFinishedCourses() {
		return finishedCourses;
	}

	public void setFinishedCourses(String finishedCourses) {
		this.finishedCourses = finishedCourses;
	}
}
