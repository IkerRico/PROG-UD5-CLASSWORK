package es.rico;

public class Activitat3 {
    public static void main(String[] args) {
        System.out.println(obtindreMitadCadena("Hola que tal"));
        System.out.println(obtindreMitadCadena("Adeu"));
    }
    public static String obtindreMitadCadena(String cadena){

        return cadena.substring(0,(cadena.length() / 2));
    }
}
