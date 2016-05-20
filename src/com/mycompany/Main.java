package com.mycompany;

public class Main {

    static Transaction transaction = new Transaction();

    public static void main(String[] args) {

        while (true) {

            transaction.enterName();

            transaction.makeSelection();

        }
    }
}