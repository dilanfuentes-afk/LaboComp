package Ejercicios;

//(*) Realice una función productoMatricial() que reciba como parámetros dos matrices de enteros.
//La función debe retornar una nueva matriz que sea el resultado de multiplicar las dos matrices
//recibidas.

public class Ejercicio29 {
    public static int [][] productoMatricial(int [][] m1, int [][] m2){


        int filas = m1.length;
        int columnas = m2[0].length;
        int n = m1[0].length; // o m2.length, da igual

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int suma = 0;
                for (int k = 0; k < n; k++) {
                    suma += m1[i][k] * m2[k][j];
                }
                resultado[i][j] = suma;
            }
        }

        return resultado;
    }
}