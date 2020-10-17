/* Purpose: Validate email of user */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
	
	/* method to validate first name */
	private void validateFirstName() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter first name: ");
		String firstName = scan.next();					      //take first name from user
		String regexFirstName = "^[A-Z]{1}[a-z]{2,}$" ; 		      //regex definition
 		Pattern pattern = Pattern.compile(regexFirstName);    
		Matcher first_nameMatcher = pattern.matcher(firstName);
		System.out.println(first_nameMatcher.matches());
		
	}
	
	/* method to validate last name */
	private void validateLastName() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter last name: ");
		String lastName = scan.next();				       	       //take first name from user
		String regexLastName = "^[A-Z]{1}[a-z]{2,}$";		   	       //regex definition
		Pattern pattern = Pattern.compile(regexLastName);
		Matcher last_nameMatcher = pattern.matcher(lastName);
		System.out.println(last_nameMatcher.matches());
		
	}
	
	/* method to validate email */
	private void validateEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = scan.next();
		String regexEmail = "^[A-Za-z0-9]+([-\\.\\+\\_]{1}[0-9A-Za-z]+)*@[A-Za-z0-9]+.[a-zA-Z]{2,4}([\\.\\,]{1}[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regexEmail);
		Matcher emailMatcher = pattern.matcher(email);
		System.out.println(emailMatcher.matches());
	
	}

	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		registration.validateFirstName();
		registration.validateLastName();
		registration.validateEmail();
	}

}

