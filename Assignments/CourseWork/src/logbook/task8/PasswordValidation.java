package logbook.task8;
import java.util.Scanner;

public class PasswordValidation {
    static void validateThePassword(){
        Scanner scanner = new Scanner(System.in);
        final String PASSWORD = "changeme";
        final int MAX_ATTEMPTS = 5;
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter the password: ");
            String inputPassword = scanner.nextLine();
            attempts++;

            if (inputPassword.equals(PASSWORD)) {
                System.out.println("Password Accepted");
                return;
            } else {
                System.out.println("Access denied. Please try again.");
            }
        }

        System.out.println("Access denied. Please contact  customer support to reset your password.");

    }

    public static void main(String[] args) {
        validateThePassword();
    }
}
