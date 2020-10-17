/* Purpose: Validate password with at least 1 number */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
	
	/* method to validate first name */
	private void validateFirstName() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter first name: ");
		String firstName = scan.next();				//take first name from user
		String regexFirstName = "^[A-Z]{1}[a-z]{2,}$" ;         //regex definition
 		Pattern pattern = Pattern.compile(regexFirstName);    
		Matcher first_nameMatcher = pattern.matcher(firstName);
		System.out.println(first_nameMatcher.matches());
		
	}
	
	/* method to validate last name */
	private void validateLastName() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter last name: ");
		String lastName = scan.next();				 //take last name from user
		String regexLastName = "^[A-Z]{1}[a-z]{2,}$";		 //regex definition
		Pattern pattern = Pattern.compile(regexLastName);
		Matcher last_nameMatcher = pattern.matcher(lastName);
		System.out.println(last_nameMatcher.matches());
		
	}
	
	/* method to validate email */
	private void validateEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter email: ");			//take email from user
		String email = scan.next();
		String regexEmail = "^[A-Za-z0-9]+([-\\.\\+\\_]{1}[0-9A-Za-z]+)*@[A-Za-z0-9]+.[a-zA-Z]{2,4}([\\.\\,]{1}[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regexEmail);
		Matcher emailMatcher = pattern.matcher(email);
		System.out.println(emailMatcher.matches());
	
	}
	
	/* method to validate password */
	private void validatePassword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password with min 8 characters,at least 1 uppercase letter and digit: ");
		String password = scan.next();
		String regexPassword1 = "^.{8,}";			//regex pattern for min 8 characters
		Pattern pattern1 = Pattern.compile(regexPassword1);
		Matcher passwordMatcher1 = pattern1.matcher(password);
		String regexPassword2 = ".*[A-Z]{1,}.*";	        //regex pattern for min 1 uppercase
		Pattern pattern2 = Pattern.compile(regexPassword2);
		Matcher passwordMatcher2 = pattern2.matcher(password);
		String regexPassword3 = ".*[0-9]{1,}.*";                //regex pattern for min 1 digit
                Pattern pattern3 = Pattern.compile(regexPassword3);
                Matcher passwordMatcher3 = pattern3.matcher(password);

		if (passwordMatcher1.matches() && passwordMatcher2.matches() && passwordMatcher3.matches() == true) 
			System.out.println("true");	
		else 
			System.out.println("false");
		

	}
	public static void main( String[] args ) {
		UserRegistration registration = new UserRegistration();
		registration.validateFirstName();
		registration.validateLastName();
		registration.validateEmail();
		registration.validatePassword();

	}

}

