package es4;

import java.util.Scanner;

public class Main {

    static String countdown(int secondi) {
        String risultato = "";

        for (int i = secondi; i > 0; i--) {

            if (i % 2 == 0) {
                risultato += "[OK]" + " " + i + "\n";
            } else {
                risultato += "[CHECK]" + " " + i + "\n";
            }

            if (i == 10) {
                risultato += "--- SEPARAZIONE STADIO ---\n";
            }
        }
        risultato += "--- IGNITION ---\n";

        return risultato;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci secondi:");
        int secondi = Integer.parseInt(scanner.nextLine());

        System.out.println(countdown(secondi));
    }
}