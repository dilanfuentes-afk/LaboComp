package Ejercicios;

import static Ejercicios.Funciones.*;

public class Ejercicio23 {
    public static void main(String[] args) {
        int [][] matriz = matrizAleatoria(4,4,1,10);
        int [][] matriz2 = matrizAleatoria(4,4,1,10);
        imprimirMatriz(matriz);
        System.out.println();
        imprimirMatriz(matriz2);
        System.out.println();
        imprimirMatriz(sumarMatrices(matriz,matriz2));
    }
}
