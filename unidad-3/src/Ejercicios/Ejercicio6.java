package Ejercicios;

import static Ejercicios.Funciones.imprimirVector;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vector = new int [10];
        for (int i = vector.length - 1; i >= 0;i--){
            System.out.print("Ingrese el valor (decendiente): ");
            vector[i] = teclado.nextInt();
        }
        imprimirVector(vector);
    }
}
