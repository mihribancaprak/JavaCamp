package homework2;

public class Instructor extends User{
	
	private String educations;

	public Instructor(int id, String firstName, String lastName, String email, String password, String educations) {
		super(id, firstName, lastName, email, password);
		
		this.educations = educations;
	}

	public String getEducations() {
		return educations;
	}

	public void setEducations(String educations) {
		this.educations = educations;
	}
}
