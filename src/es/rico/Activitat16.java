package es.rico;

import java.util.Random;

public class Activitat16 {
    public static void main(String[] args) {
        int [] listado = new int[200];
        Random generadorAleatori = new Random();
        for (int i = 0; i < listado.length; i++) {
            int numero = generadorAleatori.nextInt(200);
            listado[i] = numero;
        }
        int suma = 0;
        for ( int item: listado) {
            if (item % 3 == 0){
                suma += listado[item];
            }
        }
        System.out.println("Sumatori = " + suma);
    }

}
