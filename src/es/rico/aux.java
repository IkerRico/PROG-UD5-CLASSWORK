package es.rico;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class aux {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introduce apuestas: ");
        int numeroApuestas = teclat.nextInt();

        System.out.println("---- Total a Pagar ----");
        System.out.println("+----+----+----+----+----+");
        System.out.printf("%-3s %-3s %-3s %-3d %-3s\n", "|", "Apuestas: ", "|", numeroApuestas, "|");
        System.out.println("+----+----+----+----+----+");
        switch (numeroApuestas) {
            case (1):
                System.out.printf("%-3s %-3s %-3s %-3f€ %-3s\n","|" , "A Pagar: ", "|", numeroApuestas + 0.25, "|");
                break;
            case (2):
            case (3):
                System.out.printf("%-3s %-3s %-3s %-3f€ %-3s\n","|" , "A Pagar: ", "|", (numeroApuestas * 1.5), "|");
                break;
            case (4):
            case (5):
                System.out.printf("%-3s %-3s %-3s %-3d€ %-3s\n","|" , "A Pagar: ", "|", (numeroApuestas * 2), "|");
                break;
            case (6):
            case (7):
                System.out.printf("%-3s %-3s %-3s %-3d€ %-3s\n","|" , "A Pagar: ", "|", (12), "|");
                break;
            case (8):
                System.out.printf("%-3s %-3s %-3s %-3d€ %-3s\n","|" , "A Pagar: ", "|", (18), "|");
                break;
        }
        System.out.println("+----+----+----+----+----+");
    }

}

