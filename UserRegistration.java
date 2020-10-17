/* Purpose: Validate last name of user */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
	
	/* method to validate first name */
	private void validateFirstName() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter first name: ");
		String firstName = scan.next();			       //take first name from user
		String regexFirstName = "^[A-Z]{1}[a-z]{2,}$" ;        //regex definition
 		Pattern pattern = Pattern.compile(regexFirstName);    
		Matcher first_nameMatcher = pattern.matcher(firstName);
		System.out.println(first_nameMatcher.matches());
		
	}
	
	/* method to validate last name */
	private void validateLastName() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter last name: ");
		String lastName = scan.next();			        //take first name from user
		String regexLastName = "^[A-Z]{1}[a-z]{2,}$";		//regex definition
		Pattern pattern = Pattern.compile(regexLastName);
		Matcher last_nameMatcher = pattern.matcher(lastName);
		System.out.println(last_nameMatcher.matches());
		
	}

	public static void main( String[] args ) {
		UserRegistration registration = new UserRegistration();
		registration.validateFirstName();
		registration.validateLastName();
	}

}

