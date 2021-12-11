package es.rico;

import java.util.Arrays;
import java.util.Random;

public class Activitat20 {
    public static void main(String[] args) {

        int [] arrayA = crearArray(10);
        int [] arrayB = crearArray(10);
        System.out.println("Avans de ser ordenat : " + Arrays.toString(arrayA));
        System.out.println("Avans de ser ordenat : " + Arrays.toString(arrayB));
        ordenarPerIntercanvi(arrayA);
        ordenarPerIntercanvi(arrayB);

        System.out.println("Després de ser ordenat : " + Arrays.toString(arrayA));
        System.out.println("Després de ser ordenat : " + Arrays.toString(arrayB));

    }
    public static void ordenarPerIntercanvi(int [] myArray){
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
    public static int[] crearArray(int numelements){
        int [] listado = new int[numelements];
        Random generadorAleatori = new Random();

        for (int i = 0; i < listado.length; i++) {
            listado[i] = generadorAleatori.nextInt(51);
        }
        return listado;
    }
}

