package Ejercicios;

import static Ejercicios.Funciones.imprimirMatriz;

public class Ejercicio30 {

    public static int[][] matrizCuadrada(int n) {
        int[][] matriz = new int[n][n];
        int inicio = n; // primer número de la primera fila

        for (int i = 0; i < n; i++) {
            int valor = inicio; // el valor que irá decreciendo en la fila
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valor;
                valor--; // baja uno cada columna
            }
            inicio++; // aumenta el número inicial para la próxima fila
        }

        return matriz;
    }

    public static void main(String[] args) {
        int[][] m = matrizCuadrada(3);
        imprimirMatriz(m); // ✅ ahora sí podés llamarlo
    }
}