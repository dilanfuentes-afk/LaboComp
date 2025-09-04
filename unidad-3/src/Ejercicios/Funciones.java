package Ejercicios;

import java.util.Arrays;

public class Funciones {
    public static void imprimirVector(int[] vector) {
        for (int i : vector) {
            System.out.println(i);
        }
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

    public static int[] vectoresMenorAMayor(int [] vector1, int [] vector2){
        //Vector 1 (1,3,5,7,9)
        //Vector 2 (2,4,6,8,10)

        int [] vec = new int[vector1.length+vector2.length];
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

    public static int [][] matrizAleatoria(int filas,int columnas,int min,int max){
        int [][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }
        return matriz;
    }

}
