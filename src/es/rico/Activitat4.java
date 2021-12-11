package es.rico;

public class Activitat4 {
    public static void main(String[] args) {
    String prova1 = new String("Hola que tal");
    String prova2 = new String("Programacio");
        System.out.println(canviarMinusculesA(prova1));
        System.out.println(canviarMinusculesA(prova2));
    }

    public static String canviarMinusculesA (String cadena){

        String cadenaCanviada = cadena.replace('e','a');
        cadenaCanviada = cadenaCanviada.replace('i','a');
        cadenaCanviada = cadenaCanviada.replace('o','a');
        cadenaCanviada = cadenaCanviada.replace('u','a');
        return cadenaCanviada;
    }
}
