package Ejercicios;

import static Ejercicios.Funciones.*;

public class Ejercicio28 {
    public static void main(String[] args) {
        int [][] matriz = matrizAleatoria(2,4,1,10);
        imprimirMatriz(matriz);
        System.out.println();
        imprimirMatriz(transponer(matriz));
    }
}
