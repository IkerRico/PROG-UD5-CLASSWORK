package es.rico;

import java.util.Scanner;

public class Activitat5 {
    public static Scanner teclat;
    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String num1 = demanarNum();
        String num2 = demanarNum();

        System.out.println(num1 + " + " + num2 + " = " + obtrindreSuma(num1,num2));
        System.out.println(num1 + " * " + num2 + " = " + obtrindreMultiplicacio(num1,num2));



    }
    public static String demanarNum() {
        teclat = new Scanner(System.in);
        System.out.print("Introdueix un numero: ");
        return teclat.next();

    }

    public static double obtrindreSuma ( String num1, String num2){
        double numero1 = Double.valueOf(num1);
        double numero2 = Double.valueOf(num2);
        return numero1 + numero2;
    }
    public static double obtrindreMultiplicacio ( String num1, String num2){
        double numero1 = Double.valueOf(num1);
        double numero2 = Double.valueOf(num2);
        return numero1 * numero2;
    }
}
