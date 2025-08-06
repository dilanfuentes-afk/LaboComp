package Ejercicios;

import static Ejercicios.Funciones.raizCuadrada;

public class Ejercicio31 {
    public static void main(String[] args) {
        double num = 4;
        double raiz = raizCuadrada(num,0.00001);
        System.out.println("La raiz del numero " + num + " es " + raiz );
    }
}

