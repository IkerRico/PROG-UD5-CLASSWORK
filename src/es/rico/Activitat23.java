package es.rico;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Activitat23 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        mostrarInicio();
        int [] apuesta = generarApuesta();
    }

    /**
     * Mostrar cabecera
     */
    public static void mostrarInicio(){
        System.out.println("----- GENERADOR DE APUESTAS LOTERIA 2020 -----");
    }

    /**
     * Genera una apuesta, lo llamaremos tantas veces como apuestas
     * quiera jugar el usuario
     **/
    public static int[] generarApuesta(){
        int numApuesta = pedirApuesta();
        Random generadorAleatori = new Random();
        int [] listado = new int[6];
        for (int i = 0; i <= numApuesta; i++) {
            listado[i] = generadorAleatori.nextInt(50);
        }
        return listado;
    }
    /**
     * Muestra la @apuesta en el formato de salida específico
     **/
    public static void mostrarApuesta(int[] apuesta){

        for (int i = 0; i <= 4; i++) {

        }
    }
    /**
     * Muestra el total a pagar por @numeroApuestas
     **/
    public static void mostrarTotalPago(int numeroApuestas) {
        System.out.println("---- Total a Pagar ----");
        System.out.println("+----+----+----+----+----+");
        System.out.printf("%-3s %-3s %-3s %-3d %-3s\n", "|", "Apuestas: ", "|", numeroApuestas, "|");
        System.out.println("+----+----+----+----+----+");
        switch (numeroApuestas) {
            case (1):
                System.out.printf("%-3s %-3s %-3s %-3f€ %-3s\n", "|", "A Pagar: ", "|", numeroApuestas + 0.25, "|");
                break;
            case (2):
            case (3):
                System.out.printf("%-3s %-3s %-3s %-3f€ %-3s\n", "|", "A Pagar: ", "|", (numeroApuestas * 1.5), "|");
                break;
            case (4):
            case (5):
                System.out.printf("%-3s %-3s %-3s %-3d€ %-3s\n", "|", "A Pagar: ", "|", (numeroApuestas * 2), "|");
                break;
            case (6):
            case (7):
                System.out.printf("%-3s %-3s %-3s %-3d€ %-3s\n", "|", "A Pagar: ", "|", (12), "|");
                break;
            case (8):
                System.out.printf("%-3s %-3s %-3s %-3d€ %-3s\n", "|", "A Pagar: ", "|", (18), "|");
                break;
        }
        System.out.println("+----+----+----+----+----+");
    }


    /**
     *
     * @return la apuesta
     */
    public static int pedirApuesta(){
        System.out.print("\nCuantas apuestas quieres realizar: ");
        return scanner.nextInt();
    }
}
