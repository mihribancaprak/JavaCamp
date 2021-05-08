package loginRegisterSimulation.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import loginRegisterSimulation.core.abstracts.LoginControllerServices;


public class LoginControllerManager implements LoginControllerServices {

	@Override
	public boolean isValidEmail(String email) {
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                  			"[a-zA-Z0-9_+&*-]+)*@" +
                  			"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                  			"A-Z]{2,7}$";
		
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		
		if(!email.isEmpty() && matchFound) {
			return true;
		}
		else {
			System.out.println("Geçerli bir email adresi girmediniz!");
			return false;
		}
        		
	}

	@Override
	public boolean isValidPassword(String password) {
		
		if(!password.isEmpty() && password.length() >=6 ) {
			return true;
		}
		else {
			System.out.println("Parola en az 6 karakterden oluşmalıdır!");
	 		return false;
		}
	}

	@Override
	public boolean isValidFirstName(String firstName) {
		if(!firstName.isEmpty() && firstName.length() >= 2) {
			return true;
		}
		else {
			System.out.println("Adınız en az 2 karakterden oluşmalıdır!");
			return false;
		}
 		
	}

	@Override
	public boolean isValidLastName(String lastName) {
		if(!lastName.isEmpty() && lastName.length() >= 2) {
			return true;
		}
		else {
			System.out.println("Soyadınız en az 2 karakterden oluşmalıdır!");
			return false;
		}	
	}


}
