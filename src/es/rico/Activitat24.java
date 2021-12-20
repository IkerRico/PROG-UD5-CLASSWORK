package es.rico;

public class Activitat24 {
    public static void main(String[] args) {
        int [][] arrayDeEnters = new int[3][6];
        arrayDeEnters[0][0] = 0;
        arrayDeEnters[0][1] = 30;
        arrayDeEnters[0][2] = 2;
        
        arrayDeEnters[1][0] = 75;
        arrayDeEnters[1][5] = 0;
        
        arrayDeEnters[2][2] = -2;
        arrayDeEnters[2][3] = 9;
        arrayDeEnters[2][5] = 11;

        for (int i = 0; i < arrayDeEnters.length; i++) {
            for (int j = 0; j < arrayDeEnters[i].length; j++) {
                System.out.print(arrayDeEnters[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
