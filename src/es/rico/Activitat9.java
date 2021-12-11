package es.rico;

import java.util.Scanner;

public class Activitat9 {
    public static Scanner teclat;

    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String cadena = getCadena();
        System.out.println("Total Caracters Especials: " + contadorCaractersEspecials(cadena));


    }
    public static String getCadena(){
        System.out.print("Introduce Cadena: ");
        return teclat.next();
    }
    public static int contadorCaractersEspecials(String cadena){
        int contadorCaracteres = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if ((actual >= 32 && actual <= 47) ||
                    (actual >= 58 && actual <= 64 ) ||
                    (actual >= 91 && actual <= 96 ) ||
                    (actual >= 123 && actual <= 126 ))
            contadorCaracteres++;
        }
        return contadorCaracteres;
    }
}
