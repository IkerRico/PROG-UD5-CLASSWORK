package es.rico;

import java.util.Arrays;

public class Activitat21 {
    public static void main(String[] args) {
    String [] listado = { "Pau", "Iker", "Victor", "Jorge", "Alexis"};
        System.out.println(Arrays.toString(listado));
        ordenarPerSeleccio(listado);
        System.out.println(Arrays.toString(listado));
    }
    public static void ordenarPerSeleccio(String [] vector){
        for (int i = 0; i < vector.length - 1; i++) {
            int indiceElementMenor = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j].compareTo(vector[i]) <  0){
                    indiceElementMenor = j;
                }
            }
            if (indiceElementMenor != i){
                String aux = vector[indiceElementMenor];
                vector[indiceElementMenor] = vector[i];
                vector[i] = aux;
            }
        }

    }
}

