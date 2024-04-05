package logbook.task6;
import java.util.Scanner;
public class Calculator {
    static void arthmeticalCalculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division(/)");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1: // Addition
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                result = num1 + num2;
                break;
            case 2: // Subtraction
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                break;
            case 3: // Multiplication
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                break;
            case 4: // Division
                System.out.print("Enter dividend: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter divisor: ");
                num2 = scanner.nextDouble();
                if (num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("Error! Division by zero.");
                break;
            case 5: // Power
                System.out.print("Enter base: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                num2 = scanner.nextDouble();
                result = Math.pow(num1, num2);
                break;
            case 6: // Square Root
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                if (num1 >= 0)
                    result = Math.sqrt(num1);
                else
                    System.out.println("Error! Cannot calculate square root of a negative number.");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        arthmeticalCalculator();
    }
}
