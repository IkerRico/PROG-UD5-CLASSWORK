package es.rico;

import java.sql.Array;
import java.util.Arrays;

public class Activitat18 {
    public static void main(String[] args) {
        String[] diesSetmana = {"Dilluns","Dimarts","Dimecres","Dijous","Divendres","Dissapte","Diumenge"};

        String[] diesSetmana2 = diesSetmana;
        diesSetmana2[0] = "Monday";

        String[] diesSetmana3 = copiaArray(diesSetmana2);
        diesSetmana3[0] = "Lunes";

    }
    public static String[] copiaArray(String[] myArray){

        String[] arrayNuevo = new String[myArray.length];

        for (int i = 0; i < arrayNuevo.length; i++) {
            arrayNuevo[i] = myArray[i];
        }
        return arrayNuevo;
    }
}
