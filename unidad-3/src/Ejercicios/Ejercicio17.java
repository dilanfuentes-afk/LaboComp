package Ejercicios;

public class Ejercicio17 {
    public static void main(String[] args) {
        String [][] matrix = new String[2][2];


        matrix[0][0] ="Nombre";
        matrix[0][1] ="Apellido";
        matrix[1][0] = "Dilan";
        matrix[1][1] = "Fuentes";


        printMatrix(matrix);
    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-10s ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
