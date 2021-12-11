package es.rico;

public class Activitat2 {
    public static void main(String[] args) {
        dividirPalabra("Hola Victor es un Crak");
    }

    public static void dividirPalabra(String palabra) {

        for (int i = 0; i < palabra.length(); i++) {
            char actual = palabra.charAt(i);

            if (actual != ' ' && i != actual - 1) {
                System.out.print(palabra.charAt(i));
            if ( i < palabra.length() - 1 ){
                System.out.print("-");
            }
            }
        }
    }
}
