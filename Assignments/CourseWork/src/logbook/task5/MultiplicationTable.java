package logbook.task5;
import java.util.Scanner;

public class MultiplicationTable {
    static void displayMultiplicationTable(){
     Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number for multiplication table
        System.out.print("Enter the number you wish to see the multiplication table of: ");
        int number = scanner.nextInt();

        // Prompt user to enter the length of multiplication table
        System.out.print("Enter the length of multiplication table (counter): ");
        int counter = scanner.nextInt();

        // Display multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= counter; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
      displayMultiplicationTable();
    }
}
