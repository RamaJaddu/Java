package logbook.task4;
import java.util.Scanner;

public class AgeClassifier {

    static void classifyAgeCategory() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Classify age
        if (age <= 2) {
            System.out.println("You are an infant.");
        } else if (age <= 12) {
            System.out.println("You are a child.");
        } else if (age <= 19) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
    }

    public static void main(String[] args) {
        classifyAgeCategory();
    }
}
