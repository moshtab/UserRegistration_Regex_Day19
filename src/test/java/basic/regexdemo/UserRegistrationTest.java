package basic.regexdemo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration myobj;

	@Before
	public void initialize() {
		myobj = new UserRegistration();
	}

	@Test
	public void shouldReturnTrueIfFirstNameStartsWithCapAndHasMinimumThreeCharacters() {
		assertTrue(myobj.validateFirstName("Mohammad"));
	}
	
	@Test
	public void shouldReturnTrueIfLastNameStartsWithCapAndHasMinimumThreeCharacters() {
		assertTrue(myobj.validateLastName("Mohammad"));
	}
	
	@Test
	public void shouldReturnTrueIfEmailIsValid() {
		assertTrue(myobj.validateEmailId("mdmohsin41439@gmail.com"));
	}
	
	@Test
	public void shouldReturnTrueIfMobileNumberIsValid() {
		assertTrue(myobj.validateMobileNumberId("91 9908514276"));
	}
	
	@Test
	public void shouldReturnTrueIfPasswordIsValid() {
		assertTrue(myobj.validatePasswordId("Md7867#"));
	}
	
	
	
	
}
