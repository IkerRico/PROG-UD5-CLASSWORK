package es.rico;

import java.util.Scanner;

public class Activitat6 {
    public static Scanner teclat;
    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        String nomComplet = obtenirNom();
        System.out.println(nomComplet);
        System.out.println("Minúscula: " + obtindreMinuscules(nomComplet));
        System.out.println("Majúscula: " + obtindreMajuscules(nomComplet));
        System.out.println("Longitud: " + obtindreLogintud(nomComplet));
        System.out.println("Els dos primers caracters: " + obtindreDosPrimeresLletres(nomComplet));
        obtindreOcurrenciesPrimerCaracter(nomComplet);
        System.out.println("Asterisc: " + afegirasterisc(nomComplet));
        System.out.println("Inversa: " + obtindreReversa(nomComplet));
    }
    public static String obtenirNom(){
        System.out.print("Introdueix el teu nom: ");
        String nom = teclat.next();
        System.out.print("Introdueix el teu primer cognom: ");
        String cognom1 = teclat.next();
        System.out.print("Introdueix el teu segon cognom: ");
        String cognom2 = teclat.next();

        return String.format("%s %s %s", nom, cognom1,cognom2);
    }
    public static String obtindreMinuscules (String nomComplet){
        return nomComplet.toLowerCase();
    }
    public static String obtindreMajuscules(String nomComplet){
        return nomComplet.toUpperCase();
    }
    public static int obtindreLogintud(String nomComplet){
        return nomComplet.length();
    }
    public static String obtindreDosPrimeresLletres (String nomComplet){
        if (nomComplet.length() < 2 ){
            return "";
        }else{
            return nomComplet.substring(0,2);
        }
    }
    public static void obtindreOcurrenciesPrimerCaracter(String nomComplet){
        String cadenaCheck = nomComplet.substring(0,1);
        String nomCompletSubstrutir = nomComplet.replaceAll( cadenaCheck.toLowerCase(), cadenaCheck.toUpperCase());
        System.out.println(nomCompletSubstrutir);

    }
    public static StringBuilder afegirasterisc(String nomComplet){
        return new StringBuilder("***").append(nomComplet).append("***");
    }
    public static String obtindreReversa (String nomComplet){
        String cadenaInvertida = "";
        for (int i = nomComplet.length() - 1; i >= 0; i--) {
            cadenaInvertida += nomComplet.charAt(i);
        }
        return cadenaInvertida;
    }
}

