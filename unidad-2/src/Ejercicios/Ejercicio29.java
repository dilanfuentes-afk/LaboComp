package Ejercicios;

import static Ejercicios.Funciones.esPrimo;

public class Ejercicio29 {
    public static void main(String[] args) {
        int num = 7;
        boolean primo = esPrimo(num);
        System.out.println("Si el numero es primo es true si no es false: " + primo);
    }
}
