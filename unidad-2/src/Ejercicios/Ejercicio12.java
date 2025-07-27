package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = ent.nextInt();
        if (numero > 10){
            System.out.println("El numero ingresado es mayor que 10");
            return;
        }
    }
}
