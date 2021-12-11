package es.rico;

public class Activitat1 {

    public static void main(String[] args) {

    }

    public boolean esUnSaludo(String cadena) {
        if (cadena.equalsIgnoreCase("Hola")) {
            return true;
        } else if (cadena.equalsIgnoreCase("Hello")) {
            return true;
        } else if (cadena.equalsIgnoreCase("Què tal")) {
            return true;
        } else {
            return false;
        }
    }
}

