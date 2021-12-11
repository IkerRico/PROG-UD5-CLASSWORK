package es.rico.Activitat11;

import java.util.Scanner;

public class Activitat4 {
    /* @author por Iker Vicente Rico Triguero */

    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String frase = obternerCadena();
        obtenerCadenaSinEspacios(frase);
    }
    public static String obternerCadena(){
        System.out.print("Introduzca una frase: ");
        return teclado.nextLine();
    }
    public static void obtenerCadenaSinEspacios(String cadena){
        System.out.println("Resultado: " + cadena.replace(" ",""));
    }
}
