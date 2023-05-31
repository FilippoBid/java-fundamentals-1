package org.learning.java;

import java.util.Scanner;

public class TrainTikets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PriceKm = 0.21;
        double Sale18 = 0.2;
        double Sale65 = 0.4;

        System.out.print("Km da percorrere: ");

        int Km = scanner.nextInt();

        System.out.print("età del passeggero: ");

        int eta = scanner.nextInt();

        double price = Km * PriceKm;

        if (eta < 18) {
            price = price - (price * Sale18);
        } else if (eta >= 65) {
            price = price - (price * Sale65);
        }

        System.out.println("Il prezzo del biglietto è: " + price + " €");
    }
}
