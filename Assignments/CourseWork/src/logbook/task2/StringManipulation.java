package logbook.task2;

import java.util.Scanner;
public class StringManipulation {

    static void manipulation(){
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter input for strings p, q, and r
        System.out.print("Enter string p: ");
        String p = scanner.nextLine();
        System.out.print("Enter string q: ");
        String q = scanner.nextLine();
        System.out.print("Enter string r: ");
        String r = scanner.nextLine();

        // Concatenation of (p+q+r) in capital letters
        String concatenatedCapital = (p + q + r).toUpperCase();

        // Concatenation of (r + p) in lowercase
        String concatenatedLowercase = (r + p).toLowerCase();

        // Total number of characters within (p+q+r)
        int totalCharacters = p.length() + q.length() + r.length();

        // Display results
        System.out.println("Concatenation (p+q+r) in capital letters: " + concatenatedCapital);
        System.out.println("Concatenation of (r + p) in lowercase: " + concatenatedLowercase);
        System.out.println("Total number of characters: " + totalCharacters);

    }
    public static void main(String[] args) {
        manipulation();

    }

}
