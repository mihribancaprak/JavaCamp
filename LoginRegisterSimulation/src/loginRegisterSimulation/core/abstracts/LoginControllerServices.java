package loginRegisterSimulation.core.abstracts;

public interface LoginControllerServices {
    
	boolean isValidEmail(String email);
	boolean isValidPassword(String password);
	boolean isValidFirstName(String firstName);
	boolean isValidLastName(String lastName);

}
