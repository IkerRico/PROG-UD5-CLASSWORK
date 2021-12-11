package es.rico;

import java.util.Scanner;

public class Activitat13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [] elementos = new String[10];

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Introdueix element alfanumeric: ");
            elementos[i] = teclado.next();
        }
        for (int i = 0; i < elementos.length; i++) {
            if (i % 2 == 0){
                System.out.println(elementos[i]);
            }

        }
    }
}
