package com.mycompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello. What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            throw new Exception("You must enter your name.");
        }
        else {
            System.out.println("Hi, " + name + ".");
        }

        System.out.println("What would you like to do? Enter a number:");
        System.out.println("1. Check balance 2. Withdraw funds 3. Cancel");
        String number = scanner.nextLine();

        if (number.equals("1")) {
            System.out.println("Your balance is $100");
        }
        else if (number.equals("2")) {
            System.out.println("How much would you like to withdraw?");
            String amount = scanner.nextLine();
            int amountInt = Integer.valueOf(amount);
            if (amountInt <= 100) {
                System.out.println("Please take your cash.");
            } else {
                throw new Exception("That amount exceeds your balance.");
            }
        }
        else {
            System.out.println("Thank you. Please come again.");
        }
        //new stuff ??
    }
}