package es.rico.Activitat11;

import java.util.Scanner;

public class Activitat6 {
    public static Scanner teclado;

    /* @author Adrià Jordà Martínez */

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String dni = obtindreDni();
        String nif = calcularNIF(dni);
        System.out.println(nif);
    }
    public static String obtindreDni(){
        System.out.print("Introduzca su DNI: ");
        return teclado.next();
    }
    public static String calcularNIF(String dni){
        int dniIntiger = Integer.parseInt(dni);
        int nifSinLetra = dniIntiger%23;
        String letra="";
        switch (nifSinLetra){
            case 0:
                letra = "-T";
                break;
            case 1:
                letra = "-R";
                break;
            case 2:
                letra = "-W";
                break;
            case 3:
                letra = "-A";
                break;
            case 4:
                letra = "-G";
                break;
            case 5:
                letra = "-M";
                break;
            case 6:
                letra = "-Y";
                break;
            case 7:
                letra = "-F";
                break;
            case 8:
                letra = "-P";
                break;
            case 9:
                letra = "-D";
                break;
            case 10:
                letra = "-X";
                break;
            case 11:
                letra = "-B";
                break;
            case 12:
                letra = "-N";
                break;
            case 13:
                letra = "-J";
                break;
            case 14:
                letra = "-Z";
                break;
            case 15:
                letra = "-S";
                break;
            case 16:
                letra = "-Q";
                break;
            case 17:
                letra = "-V";
                break;
            case 18:
                letra = "-H";
                break;
            case 19:
                letra = "-L";
                break;
            case 20:
                letra = "-C";
                break;
            case 21:
                letra = "-K";
                break;
            case 22:
                letra = "-E";
                break;
        }
        return (dni+letra);
    }
}

