package Ejercicios;

import static Ejercicios.Funciones.imprimirVector;
import static Ejercicios.Funciones.vector;

public class Ejercicio8 {
    public static void main(String[] args) {
        int [] vec = vector(7,21,10);
        int max = 0;
        for (int i : vec){
            if (i >= max){
                max = i;
            }
        }
        imprimirVector(vec);
        System.out.println("El numero maximo es " + max);

    }
}
