package es1;

import java.util.Scanner;

public class Main {

//    static boolean stringaPariDispari(String stringa) {
//        return stringa.length() % 2 == 0;
//    }

    static boolean annoBisestile(int anno) {
        if (anno % 4 != 0) {
            return false;
        } else return anno % 100 != 0 || anno % 400 == 0;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Inserisci una stringa: ");
//        String stringa = scanner.nextLine();
//        System.out.println(stringaPariDispari(stringa));

        System.out.println("inserisci un anno: ");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println(annoBisestile(anno));
    }
}
