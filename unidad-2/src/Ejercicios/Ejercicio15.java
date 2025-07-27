package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingresar el primer numero: ");
        int num1 = ent.nextInt();
        System.out.print("Ingresar el segundo numero: ");
        int num2= ent.nextInt();
        if (num2 == 0){
            System.out.println("No se puede dividir por 0");
        } else if (num1 % num2 == 0){
            System.out.println("el numero es multiplo de " + num2);
        } else {
            System.out.println("el numero NO es multiplo de " + num2);
        }
    }
}
