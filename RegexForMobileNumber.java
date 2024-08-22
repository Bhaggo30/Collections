
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexForMobileNumber {
        public static void main(String[] args) {
            String regex = "^[6-9]\\d{9}$";

            Pattern pattern = Pattern.compile(regex);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a mobile number: ");
            String mobileNumber = scanner.nextLine();

            Matcher matcher = pattern.matcher(mobileNumber);

            if (matcher.matches()) {
                System.out.println("Valid mobile number.");
            } else {
                System.out.println("Invalid mobile number.");
            }
            scanner.close();
        }
    }


