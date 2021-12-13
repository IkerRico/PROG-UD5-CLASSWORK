package es.rico;

import java.util.Random;
import java.util.Scanner;

public class Activitat23 {

    static Scanner scanner;
    static Random generadorAleatori = new Random();
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        empezarLoteria();

    }
    public static void empezarLoteria(){
        mostrarInicio();
        int numApuestas = pedirApuesta();
        generarBoleto(numApuestas);
        mostrarTotalPago(numApuestas);
    }

    /**
     * Mostrar cabecera
     */
    public static void mostrarInicio(){
        System.out.println("----- GENERADOR DE APUESTAS LOTERIA 2020 -----");
    }
    public static void generarBoleto(int apuestas){
        for (int i = 1; i <= apuestas ; i++) {
            System.out.println("----- Apuesta " + i + " ----");
            int [] apuesta = generarApuesta();
            ordenarApuesta(apuesta);
            mostrarApuesta(apuesta);
        }

    }

    /**
     * Genera una apuesta, lo llamaremos tantas veces como apuestas
     * quiera jugar el usuario
     **/
    public static int[] generarApuesta(){
        int [] apuesta = new int[6];

        for (int i = 0; i < apuesta.length; i++) {
            int numeroAleatorio = generadorAleatori.nextInt(50);
            if (esRepetit(apuesta, numeroAleatorio)) {
                i--;
            }else {
                apuesta[i] = numeroAleatorio;
            }
        }
        return apuesta;
    }
    /**
     * Muestra la @apuesta en el formato de salida específico
     **/
    public static void mostrarApuesta(int[] apuesta){
        System.out.println("+----+----+----+----+----+----+");
        System.out.printf("%-1s %02d %-1s %02d %-1s %02d %-1s %02d %-1s %02d %-1s %02d %-1s\n", "|", apuesta[0], "|", apuesta[1], "|", apuesta[2], "|", apuesta[3], "|", apuesta[4], "|", apuesta[5],"|");
        System.out.println("+----+----+----+----+----+----+\n");
    }
    /**
     * Muestra el total a pagar por @numeroApuestas
     **/
    public static void mostrarTotalPago(int numeroApuestas) {
        System.out.println("---- Total a Pagar ----");
        System.out.println("+----+----+----+----+----+");
        System.out.printf("%-4s %-4s %-4s %-3d %-4s\n", "|", "Apuestas: ", "|", numeroApuestas, "|");
        System.out.println("+----+----+----+----+----+");
        System.out.printf("%-4s %-4s %-3s %.2f€ %-4s\n", "|", "A Pagar: ", "|", calcularPago(numeroApuestas), "|");
        System.out.println("+----+----+----+----+----+");

        }

    public static float calcularPago(int numeroApuesta) {
        if (numeroApuesta == 8){
            return 18;
        }else if (numeroApuesta == 6 || numeroApuesta == 7){
            return 12;
        }else if (numeroApuesta == 4 || numeroApuesta == 5){
            return  numeroApuesta * 2;
        }else if (numeroApuesta == 2 || numeroApuesta == 3){
            return numeroApuesta * 2;
        }else {
            return 1.25F;
        }
    }


    /**
     *
     * @return la apuesta
     */
    public static int pedirApuesta(){
        System.out.print("\nCuantas apuestas quieres realizar: ");
        return scanner.nextInt();
    }
    public static boolean esRepetit(int [] apuesta  , int numeroAleatorio){
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] == numeroAleatorio){
                return true;
            }
        }
        return false;
    }

    public static void ordenarApuesta(int [] myArray){
        for (int i = 0; i < myArray.length - 1 ; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[i]){
                    int aux = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = aux;
                }
            }
        }
    }
}

