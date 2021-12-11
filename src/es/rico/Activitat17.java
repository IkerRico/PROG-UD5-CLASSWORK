package es.rico;

import java.util.Random;

public class Activitat17 {
    public static void main(String[] args) {
    int[] myArray = crearArray();
    visualiztarArray(myArray);
    System.out.println("\nEl primer 0 esta en la posicio = " + cercarZero(myArray));
    intercanvia(myArray);
    visualiztarArray(myArray);

    }
    public static int[] crearArray(){
        int [] listado = new int[10];
        Random generadorAleatori = new Random();

        for (int i = 0; i < listado.length; i++) {
            listado[i] = generadorAleatori.nextInt(51);
        }
        return listado;
    }
    public static void visualiztarArray(int[] vector){
        for (int item: vector) {
            System.out.print(item + " / ");
        }
    }
    public static int cercarZero(int[] vector){
        for (int i = 0; i < vector.length; i++) {
         if (vector[i] == 0){
             return i;
         }
        }
        return -1;
    }
    public static void intercanvia(int [] vector){
        if (vector.length >= 2){
            int primerElement = vector[0];
            int ultimElement = vector[vector.length - 1];
            vector[0] = ultimElement;
            vector[vector.length - 1] = primerElement;
        }
            }
            }

