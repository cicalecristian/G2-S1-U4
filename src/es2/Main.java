package es2;

import java.util.Scanner;

public class Main {

    static String stringa(int number) {
        return switch (number) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "numero non valido";
        };
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero da 0 a 3: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(stringa(number));
    }
}
