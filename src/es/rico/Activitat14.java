package es.rico;

import java.util.Scanner;

public class Activitat14 {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            int [] listado = new int[10];

            for (int i = 0; i < listado.length; i++) {
                System.out.print("Introdueix element numeric: ");
                listado[i] = teclado.nextInt();
            }
            for (int dades : listado) {
                System.out.print(dades);
                if (dades != 9){
                    System.out.print(",");
                }
            }
        }
    }

