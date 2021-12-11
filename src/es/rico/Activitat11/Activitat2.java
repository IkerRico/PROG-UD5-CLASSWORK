package es.rico.Activitat11;

import java.util.Scanner;

public class Activitat2 {

    /* @author  Víctor Pérez Domenech*/

    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String cadena = obtenerCandena();
        int numeroVocales = obtenerNumeroVocales(cadena);
        System.out.print("La palabra o frase contiene " + numeroVocales + " vocales.");

    }

    public static int obtenerNumeroVocales (String cadena){
        int numeroVocales = 0;
        int x = 0;
        do {
            if (cadena.charAt(x) == 'a' || cadena.charAt(x) == 'e' || cadena.charAt(x) == 'i' || cadena.charAt(x) == 'o' || cadena.charAt(x) == 'u'){
                numeroVocales ++;
            }
            x ++;

        }while (x <= cadena.length()-1);
        return numeroVocales;
    }

    public static String obtenerCandena(){
        System.out.print("Introduzca una palabra o frase: ");
        return teclado.nextLine();
    }
}