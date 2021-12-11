package es.rico;

import java.util.Random;

public class Activitat15 {
    public static void main(String[] args) {
        int [] listado = new int[20];
        Random generadorAleatori = new Random();
        for (int i = 0; i < listado.length; i++) {
            int numero = generadorAleatori.nextInt(10);
            listado[i] = numero;
        }
        int contador4 = 0;
        for (int dades : listado) {
            if (contador4 == 4){
                System.out.print(" ");
                contador4 = 0;
            }
            System.out.print(dades);
            contador4++;
            }

    }
}
