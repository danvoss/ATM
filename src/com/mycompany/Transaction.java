package com.mycompany;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Dan on 5/20/16.
 */

public class Transaction {

    String name;
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Double> customerBalances = new HashMap<>();

    public void enterName() {

        customerBalances.put("Alice", 100.00);
        customerBalances.put("Bob", 50.25);
        customerBalances.put("Charlie", 220.20);

        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("You must enter your name.");
        } else {
            System.out.println("Hi, " + name + ".");
        }
    }

    public void makeSelection() {

        if (!(customerBalances.containsKey(name))) {
            System.out.println("Would you like to create an account? [Y/N]");
            String accountAnswer = scanner.nextLine();
            if (accountAnswer.equalsIgnoreCase("N")) {
                System.out.println("Fine, then. Goodbye.");
            } else {
                System.out.println("How much money do you have?");
                String balanceAnswer = scanner.nextLine();
                double balanceDouble = Double.valueOf(balanceAnswer);
                customerBalances.put(name, balanceDouble);
            }
        } else {
            System.out.println("What would you like to do? Enter a number.");
            System.out.println("1. Check balance 2. Withdraw funds 3. Remove account 4. Cancel");
            String number = scanner.nextLine();

            while (!(number.equals("4"))) {
                switch (number) {
                    case ("1"):
                        Double currentBalance = customerBalances.get(name);
                        System.out.println(currentBalance);
                        break;
                    case ("2"):
                        System.out.println("How much would you like to withdraw?");
                        String amount = scanner.nextLine();
                        double amountDouble = Double.valueOf(amount);
                        if (amountDouble <= customerBalances.get(name)) {
                            System.out.println("Please take your cash.");
                        } else {
                            System.out.println("That amount exceeds your balance.");
                        }
                        break;
                    case ("3"):
                        customerBalances.remove(name);
                        System.out.println("Your account has been removed.");
                        break;
                    default:
                        System.out.println("Please enter 1, 2, 3, or 4.");
                        break;
                }
                number = scanner.nextLine();
            }
            System.out.println("Thank you. Goodbye.");
        }

    }
}
