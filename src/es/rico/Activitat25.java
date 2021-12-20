package es.rico;

public class Activitat25 {
    public static void main(String[] args) {
        int [][] arrayDeEnters = {{0,1,2,3,4,5,6},{7,8,9,10,11,12,13},{14,15,16,17,18,19,20},
                {21,22,23,24,25,26,27},{28,29,30,31,32,33,34}};
        mostraMatriuCompleta(arrayDeEnters);
        System.out.println("");
        mostrarQuintaFila(arrayDeEnters,5);
        intercanviElements(arrayDeEnters);
        System.out.println("");
        mostraMatriuCompleta(arrayDeEnters);
        System.out.println("");
        intercanviFiles(arrayDeEnters);
        mostraMatriuCompleta(arrayDeEnters);
    }
    public static void mostraMatriuCompleta(int [][] matriu){
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void mostrarQuintaFila(int [][] matriu, int fila){
        for (int i = fila - 1; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void intercanviElements(int [][] matriu){
        int aux = matriu[3][2];
        matriu[3][2] = matriu[4][2];
        matriu[4][2] = aux;
    }
    public static void intercanviFiles(int[][] matriu){
        for (int i = 0; i <= matriu.length + 1; i++) {
                int aux = matriu[0][i];
                matriu[0][i] = matriu[3][i];
                matriu[3][i] = aux;
            }
        }
    }

