package es.rico.Activitat11;

import java.util.Scanner;

public class Activitat1 {
    /* @author Iker Vicente Rico Triguero*/

    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String palabraSecreta = obtenerPalabraSecreta();
        hacerIntendos(palabraSecreta);

    }
    public static String obtenerPalabraSecreta(){
        System.out.print("Introduzca palabra secreta: ");
        return teclado.next();
    } 
    public static void hacerIntendos(String palabraSecreta){
        palabraSecreta = palabraSecreta.toLowerCase();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Intenta averiguar la palabra, intento " + i + ": ");
            String palabra = teclado.next();
            if (palabraSecreta.equalsIgnoreCase(palabra)){
                System.out.println("Enhorabuena!!");
                return;
            }

        }
        System.out.println("Has perdut");
    }
}
