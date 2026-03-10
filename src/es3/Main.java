package es3;

import java.util.Scanner;

public class Main {

    static String[] stringa(String parola) {
        return parola.split("");
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa (:q per terminare)");
        String parola = scanner.nextLine();

        while (!parola.equals(":q")) {

            String[] array = stringa(parola);
            String risultato = String.join(",", array);

            System.out.println(risultato);

            parola = scanner.nextLine();
        }

        System.out.println("programma terminato");
    }
}
