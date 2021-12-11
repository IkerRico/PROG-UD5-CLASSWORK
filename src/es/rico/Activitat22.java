package es.rico;

import java.util.Arrays;
import java.util.Random;

public class Activitat22 {
    public static void main(String[] args) {
      int[] arrayA = crearArray(10);
      System.out.println(Arrays.toString(arrayA));
      int elementABuscar = 50;
      int idexElement = cercarEnVectorNoOrdenat(arrayA,elementABuscar);
      System.out.printf("El element %d esta en el index %d\n\n",elementABuscar,idexElement);

      int[] arrayB = crearArray(10);
      ordenarPerIntercanvi(arrayB);
      System.out.println(Arrays.toString(arrayB));
      idexElement = cercarEnVectorNoOrdenat(arrayB,elementABuscar);
      System.out.printf("El element %d esta en el index %d",elementABuscar,idexElement);

    }
    public static int cercarEnVectorNoOrdenat(int[] myArray, int numBuscar){
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == numBuscar){
                return i;
            }
        }
        return -1;
    }
    public static int cercarEnVectorOrdenat(int [] myArray, int numBuscar){
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == numBuscar){
                return i;
            }else if (myArray [i] > numBuscar){
                break;
            }
        }
        return -1;
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
