package es.rico;

import java.util.Arrays;
import java.util.Scanner;

public class Activitat19 {
    /** Les probes dels metodes estan fetes totes amb el ArrayA */
    public static void main(String[] args) {
        int[] arrayA = {10,20,30,40,50,0};
        int[] arrayB = {60,70,80,90,100};

        int suma = arrayA[3] + arrayB[4];
        if (arrayA.length == 6) {
            arrayA[5] = 15;
        }


        int[] arrayC = new int[5];

        arrayC[1] = suma + arrayA[0];
        int multiplicacion = 1;
        for (int i = 0; i < arrayC.length ; i++) {
            multiplicacion *= arrayA[i];
            arrayC[0] = multiplicacion;
        }
        int sumarElementos = 0;
        for (int i = 0; i < arrayC.length ; i++) {
            sumarElementos += arrayA[i];
            arrayC[2] = sumarElementos;
        }

        arrayC[3] = arrayC[0] / arrayB[0];

        arrayC[4] = Math.max(arrayA[4],arrayB[0]);

        visualizarArrayFor(arrayA);
        System.out.print("\n");
        visualizarArrayForEach(arrayB);
        System.out.print("\n");
        visualizarArrayFor(arrayC);
        System.out.print("\n");
        visualizarExtremos(arrayA);

        System.out.println("La copia es: " + Arrays.toString(copiaArray(arrayA)));
        visualizarMultiplos(arrayA);


    }
    public static void visualizarArrayFor(int [] myArray){
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != 5){
                System.out.print(" / ");
            }
        }
    }
    public static void visualizarArrayForEach(int [] myArray){
        for (int items:myArray) {
            System.out.print(items + " / ");
        }
    }
    public static void visualizarExtremos(int[] myArray){
        int ultimElement = myArray[myArray.length - 1];
        System.out.println("Primer elemento del array: " + myArray[0]);
        System.out.println("Último elemento del array: " + ultimElement);

    }
    public static int[] copiaArray(int[] myArray){

        int[] arrayNuevo = new int[myArray.length];

        for (int i = 0; i < arrayNuevo.length; i++) {
            arrayNuevo[i] = myArray[i];
        }
        return arrayNuevo;
    }
    public static void visualizarMultiplos(int[] myArray){
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix un multiplo: ");
        int multiplo = teclat.nextInt();

        for (int items: myArray) {
            if (items % multiplo == 0){
                System.out.println(items);
            }
        }
    }
}
