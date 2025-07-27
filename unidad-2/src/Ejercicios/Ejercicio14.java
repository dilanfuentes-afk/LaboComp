package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = ent.nextInt();
        if (numero == 10) {
            System.out.println("El numero ingresado es 10");
        }   else if (numero > 10){
            System.out.println("El numero ingresado es mayor que 10");
        }   else {
            System.out.println("El numero no es mayor que 10");
        }
    }
}
