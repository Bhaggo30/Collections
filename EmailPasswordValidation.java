import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailPasswordValidation {
    public static void main(String[] args) {

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        // Minimum 8 characters, at least one uppercase letter, one lowercase letter, one number, and one special character
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";


        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern passwordPattern = Pattern.compile(passwordRegex);


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter an email address: ");
        String email = scanner.nextLine();
        Matcher emailMatcher = emailPattern.matcher(email);

        if (emailMatcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }


        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        Matcher passwordMatcher = passwordPattern.matcher(password);

        if (passwordMatcher.matches()) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }

        // Close the scanner
        scanner.close();
    }
}
