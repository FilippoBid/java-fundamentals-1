package org.learning.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di numeri (da 1 a 999): ");
        int InNumber = scanner.nextInt();


        while (InNumber <= 0 || InNumber > 999) {

            System.out.println("Il numero inserito non rispetta i requisiti.");
            System.out.print("Inserisci il numero di numeri (da 1 a 999): ");
            InNumber = scanner.nextInt();

        }

        for (int i = 1; i <= InNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

