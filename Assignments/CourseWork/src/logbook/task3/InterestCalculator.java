package logbook.task3;

import java.util.Scanner;

public class InterestCalculator {

    static void calculateBalanceForFourthYear(){

        Scanner scanner = new Scanner(System.in);

        // Prompt user to input starting balance and interest rate
        System.out.print("Enter starting balance (£): ");
        double balance = scanner.nextDouble();

        // Calculate balances for the next four years
        for (int year = 1; year <= 4; year++) {
            balance += balance * interestRate;
            System.out.println("Balance after year " + year + ": £" + balance);
        }

    }

    public static void main(String[] args) {

        calculateBalanceForFourthYear();

    }

    // Interest rate on starting balance
    private static double interestRate = 0.05;

}
