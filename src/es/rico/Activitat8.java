package es.rico;

import java.util.Scanner;

public class Activitat8 {
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        StringBuilder cadena = obtindreCadena();
        System.out.println(cadena);
        System.out.println(cadena.reverse());
    }
    public static StringBuilder obtindreCadena() {
        System.out.print("Introdueix una cadena: ");
        String str1 =  teclat.next();
        String str2 =  teclat.next();
        String str3 =  teclat.next();
        return new StringBuilder(str1).append(" ").append(str2).append(" ").append(str3);
    }

    public static Scanner getTeclat() {
        return teclat;
    }
}
