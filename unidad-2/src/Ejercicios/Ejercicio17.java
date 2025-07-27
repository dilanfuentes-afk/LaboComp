package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int bucle = 10;
        int mayor = 0;
        while (bucle > 0){
            System.out.print("Ingresar numero seleccionado: ");
            int numero = ent.nextInt();
            if (mayor < numero){
                mayor = numero;
            }
            bucle--;
        }
        System.out.println("El numero mas grande es " + mayor);
    }
}
