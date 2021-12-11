package es.rico.Activitat11;

import java.util.Scanner;

public class Activitat5 {

    /* @author Victor Pérez Domenech */

    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String cadena = obtenerCandena();
        System.out.println("Resultado: " + invertirPrimeraYUltima(cadena));

    }


    public static String invertirPrimeraYUltima(String cadena){
        int primerEspacio = cadena.indexOf(" ");
        int ultimoEspacio = cadena.lastIndexOf(" ");
        int longitud = cadena.length();
        String primeraPalabra = cadena.substring(0,primerEspacio);
        String ultimaPalbra = cadena.substring(ultimoEspacio,longitud);
        String palabraEnMedio = cadena.substring(primerEspacio,ultimoEspacio + 1);
        return ultimaPalbra + palabraEnMedio + primeraPalabra;
    }

    public static String obtenerCandena(){
        System.out.print("Introduzca una palabra o frase: ");
        return teclado.nextLine();
    }
}