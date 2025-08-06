package Ejercicios;

import static Ejercicios.Funciones.fibonacci;

public class Ejercicio34 {
    public static void main(String[] args){
        int num = 100;
        int fibo = fibonacci(num);
        System.out.println("El valor de la serie de fibonacci en la posicion " + num + " es " + fibo);
    }
}
