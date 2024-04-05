package logbook.task9;
import java.util.Scanner;
public class LeapYearChecker {

    static void checkLeapYear(){
        Scanner scanner = new Scanner(System.in);
        boolean isLeapYear = false;

        // Prompt the user to input a year
        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        // Check if the entered year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        System.out.println(year + " is a leap year:  "+ isLeapYear);
    }

    public static void main(String[] args) {

        checkLeapYear();
    }

}
