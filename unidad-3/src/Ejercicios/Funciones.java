package Ejercicios;

import java.util.Arrays;

public class Funciones {
    public static void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int e : vector) {
            System.out.printf("%d ", e);
        }
        System.out.println("]");
    }


    public static int[] vectorAleatorio(int min, int max, int n) {
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return vector;
    }

    public static double promedioVector(int[] vector) {
        int total = 0;
        for (int i : vector) {
            total = total + i;
        }
        return total / vector.length;
    }

    public static int paresVector(int[] vector) {
        int numPares = 0;
        for (int i : vector) {
            if (i % 2 == 0) {
                numPares++;
            }
        }
        return numPares;
    }

    public static int ocurrencia(int[] vector, int numero) {
        int n;
        int num = 0;
        for (int i : vector) {
            num++;
            if (i == numero) {
                return num;
            }
        }
        return -1;
    }

    public static int[] sumaVectores(int[] vector1, int[] vector2) {
        int[] suma = new int[vector1.length];

        for (int i = 0; i < vector1.length; i++) {
            suma[i] = vector1[i] + vector2[i];
        }
        return suma;
    }

    public static int[] vectorInverso(int[] vector) {
        int contador = vector.length - 1;
        int[] inverso = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            inverso[contador - i] = vector[i];
        }
        return inverso;
    }

    public static int[] vectoresMenorAMayor(int[] vector1, int[] vector2) {
        //Vector 1 (1,3,5,7,9)
        //Vector 2 (2,4,6,8,10)

        int[] vec = new int[vector1.length + vector2.length];
        int i = 0, j = 0, k = 0;
        while (i < vector1.length && j < vector2.length) {
            if (vector1[i] == vector2[j]) {
                vec[k] = vector1[i]; // guardo coincidencia
                k++;
                i++;
                j++;
            } else if (vector1[i] < vector2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(vec, k);

    }

    public static void imprimirMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-10s ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] matrizAleatoria(int filas, int columnas, int min, int max) {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
        return matriz;
    }

    public static int[][] escalar(int[][] matriz, int valor) {

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] * valor;
            }
        }
        return resultado;

    }


        public static int[][] identidad(int n) {
            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = 0;
                    }
                }
            }

            return matriz;
        }

    public static int [][] sumarMatrices(int[][] matriz1,int[][] matriz2){
        int [][] resultado = new int[matriz2.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int [] obtenerFila(int [][] matriz,int fila){

        int[] vector = new int[matriz[fila].length];

        for (int j = 0; j < matriz[fila].length; j++) {
            vector[j] = matriz[fila][j];
        }
        return vector;
    }

    public static int [] obtenerColumna(int [][] matriz, int columna){

        int[] vector = new int[matriz.length];


        for (int i = 0; i < matriz.length; i++) {
            vector[i] = matriz[i][columna]; // copiamos cada elemento de la columna
        }

        return vector;

    }

    public static int [] sumarColumnas(int [][] matriz){
        int [] vector = new int[matriz[0].length];

        vector[0] = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vector[i] = vector[i] + matriz[j][i];
            }
        }
        return vector;
    }

    public static int [] sumarFilas(int [][] matriz){
        int [] vector = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vector[j] = vector[j] + matriz[j][i];
            }
        }
        return vector;
    }

    public static int [][] transponer(int [][] matriz){

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int [][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        return transpuesta;
    }

    public static void vectorOrdenado(int [] height){

        int temp;
        for (int f = 0; f < height.length; f++) {
            for (int i = f; i < height.length; i++) {
                if(height[f] > height[i]){
                    temp = height[f];
                    height[f] = height[i];
                    height[i] = temp;
                    f = f - 1;
                    break;
                }
            }
        }
    }

}
