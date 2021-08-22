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

}
