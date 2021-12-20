package es.rico;

import java.util.Arrays;

public class Activitat26 {
    public static final int CAMPO_MODULO = 3;
    public static final int CAMPO_CURSO = 4;
    public static void main(String[] args) {
        String[][] students = {{"Joan", "Perez Aura", "24", "ASIX", "1"},
                {"Maria", "Sanchez García", "18", "DAW", "1"},
                {"Pepa", "Egea Juan", "21", "DAM", "1"},
                {"Ana", "Hernandez Julian", "20", "DAW", "2"},
                {"Fransec", "Juan Juan", "28", "DAW", "1"}};

        mostraMatriuCompleta(students);

        System.out.println();

        obtindreAlumnes(students);
        System.out.println();

        mostrarMitjanaEdad(students);
        System.out.println();

        obtindrePromocio(students);
        mostraMatriuCompleta(students);

        System.out.println();
        String[][] taula = crearTaulaModuls(students);
        mostraMatriuCompleta(taula);
    }

    public static void mostraMatriuCompleta(String[][] matriu) {
        for (String[] filas: matriu) {
            for (String elementos: filas) {
                System.out.printf("%-20s\t",elementos);
            }
            System.out.println();
        }
    }

    public static void obtindreAlumnes(String[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
                if (matriu[i][CAMPO_MODULO].equals("DAW")) {
                    System.out.println(Arrays.toString(matriu[i]));
                }else if (matriu[i][CAMPO_MODULO].equals("ASIX")) {
                    System.out.println(Arrays.toString(matriu[i]));
                }
            }

        }

    public static void mostrarMitjanaEdad(String[][] matriu) {
        int sumatoriEdad = 0;

        for (int i = 0; i < matriu.length; i++) {
            sumatoriEdad += Integer.parseInt(matriu[i][2]);
            }
        System.out.println("Mitjana Edad : " + sumatoriEdad / matriu.length);
        }

    public static void obtindrePromocio(String[][] matriu) {

        for (int i = 0; i < matriu.length; i++) {
            if (matriu[i][CAMPO_CURSO].equals("1")){
                matriu[i][CAMPO_CURSO] = "2";
            }
        }
    }
    public static String [][] crearTaulaModuls(String[][] matriu) {
        int contadorDaw = 0;
        int contadorAsix = 0;
        int contadorDam = 0;
        for (int i = 0; i < matriu.length; i++) {
            if (matriu[i][CAMPO_MODULO].equals("DAW")) {
                contadorDaw++;
            }else if (matriu[i][CAMPO_MODULO].equals("ASIX")) {
                contadorAsix++;
            }else {
                contadorDam++;
            }
        }
         return new String[][]{{"DAW",String.valueOf(contadorDaw)},
                {"ASIX",String.valueOf(contadorAsix)},
                {"DAM",String.valueOf(contadorDam)}};

        }

    }

