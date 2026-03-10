package es4;

import java.util.Scanner;

public class Main {

    static String countdown(int secondi) {
        StringBuilder risultato = new StringBuilder();

        for (int i = secondi; i > 0; i--) {

            if (i % 2 == 0) {
                risultato.append("[OK]" + " ").append(i).append("\n");
            } else {
                risultato.append("[CHECK]" + " ").append(i).append("\n");
            }

            if (i == 10) {
                risultato.append("--- SEPARAZIONE STADIO ---\n");
            }
        }
        risultato.append("--- IGNITION ---\n");

        return risultato.toString();
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci secondi:");
        int secondi = Integer.parseInt(scanner.nextLine());

        System.out.println(countdown(secondi));
    }
}