/* Purpose: Validate first name of user */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

        /* method to validate first name */
        private void validateFirstName() {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter first name: ");
                String firstName = scan.next();                   //take input from user
                String regexfName = "^[A-Z]{1}[a-z]{2,}$";        //regex definition
                Pattern pattern = Pattern.compile(regexfName);
                Matcher first_nameMatcher = pattern.matcher(firstName);
                System.out.println(first_nameMatcher.matches());
        }

        public static void main( String[] args ) {
                UserRegistration registration = new UserRegistration();
                registration.validateFirstName();

        }

}


