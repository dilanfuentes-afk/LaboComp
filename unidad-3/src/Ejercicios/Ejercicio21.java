package Ejercicios;

import static Ejercicios.Funciones.*;

public class Ejercicio21 {
    public static void main(String[] args) {
        int [][] matriz = matrizAleatoria(4,4,1,10);
        imprimirMatriz(matriz);
        imprimirMatriz(escalar(matriz,2));
    }
}
