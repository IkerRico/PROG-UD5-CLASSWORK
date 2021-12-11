package es.rico;

import java.util.Scanner;

public class Activitat12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] listado = new int[10];

        for (int i = 0; i < listado.length; i++) {
            System.out.print("Introdueix element numeric: ");
            listado[i] = teclado.nextInt();
        }
        for (int i = 0; i < listado.length; i++) {
            System.out.print(listado[i]);
            if (i != 9){
                System.out.print(",");
            }
        }
    }
}
