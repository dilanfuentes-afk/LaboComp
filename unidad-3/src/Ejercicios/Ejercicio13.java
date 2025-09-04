package Ejercicios;

import static Ejercicios.Funciones.imprimirVector;
import static Ejercicios.Funciones.vectorAleatorio;

public class Ejercicio13 {
    public static void main(String[] args) {
        int [] vector = new int[10];
        int i = 0;

        while(i < vector.length){
            boolean repetido = false;
            int num = (int)(Math.random() * 10); // rango 0-99;

            for (int j = 0; j < i; j++) {
                if (vector[j] == num) {
                    repetido = true;
                    break;
                }
            }

            if(!repetido){
                vector[i] = num;
                i++;
            }
        }
        imprimirVector(vector);
    }
}
