package es.rico.Activitat11;

import java.util.Scanner;

public class Activitat3 {

    /* @author Adrià Jordà Martínez */

        public static Scanner teclado;
        public static void main(String[] args) {
            teclado = new Scanner(System.in);
            String palabra = introducePalabras();
            System.out.println("Resultado: "+obtindreNomInvertit(palabra));
        }

        public static String introducePalabras(){
            System.out.print("Introduzca una cadena: ");
            return teclado.next();
        }
        public static String obtindreNomInvertit (String mns){

            String actual = "";
            for (int i = (mns.length()-2); i>=0;i--){
                actual += mns.charAt(i);

            }
            return mns+actual;
        }
    }

