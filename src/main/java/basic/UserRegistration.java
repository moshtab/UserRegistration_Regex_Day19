package basic.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String string) {
		String firstName = string;
		String regex = "^([A-Z][a-z]{2,})$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		return m.matches();
	}

	public boolean validateLastName(String string) {
		String lastName = string;
		String regex = "^([A-Z][a-z]{2,})$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		return m.matches();

	}

	public boolean validateEmailId(String string) {
		String emailId = string;
		String regex = "^([a-zA-Z0-90_.+-]+)@([a-z0-9]+).([a-z]{2,4})(.[a-z]{2,4})?$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		return m.matches();
	}

	public boolean validateMobileNumberId(String string) {
		String mobileNumber = string;
		String regex = "^(91 )[897][0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNumber);
		return m.matches();
	}

	public boolean validatePasswordId(String string) {
		String password = string;
		String regex = "[a-zA-Z0-9]{7,}#"; 
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return m.matches();
	}
}
