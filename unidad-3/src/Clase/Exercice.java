package Clase;

import static Ejercicios.Funciones.imprimirMatriz;
import static Ejercicios.Funciones.matrizAleatoria;

public class Exercice {
    public static void main(String[] args) {
        int [][] matriz = new int [5][5];

        int n = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (n % 2 == 0){
                    matriz[i][j]= 0;
                } else
                {matriz[i][j]= n;}
                n++;

            }
        }
        imprimirMatriz(matriz);

    }
}
