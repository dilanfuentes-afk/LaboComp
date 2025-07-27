package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int bucle = 10;
        int mayor1 = 0;
        int mayor2 = 0;
        while (bucle > 0){
            System.out.print("Ingresar numero seleccionado: ");
            int numero = ent.nextInt();
            if (mayor1 < numero){
                mayor2 = mayor1;
                mayor1 = numero;

            } else if (numero > mayor2){
                mayor2 = numero;
            }
            bucle--;
        }
        System.out.println("El primer numero mas grande es " + mayor1);
        System.out.println("El segundo numero mas grande es " + mayor2);
    }
}