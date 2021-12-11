package es.rico;

import java.util.Scanner;

public class Activitat7 {
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String cadena = obtindreCadena();
        System.out.printf("%s %b\n",cadena, obtindreCoincidencia(cadena));
        System.out.printf("%s %b","iker",obtindreCoincidencia("iker"));
    }

    public static String obtindreCadena() {
        System.out.print("Introdueix una cadena: ");
        return teclat.next();
    }

    public static boolean obtindreCoincidencia(String cadena) {
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == cadena.charAt(cadena.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }
}
