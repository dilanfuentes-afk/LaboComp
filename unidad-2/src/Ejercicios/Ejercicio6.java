package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
                int num1;
                int num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = ent.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = ent.nextInt();

        if (num2 != 0){
            num2 /= num1;
            System.out.println("El cociente guardado en num2 es " + num2);
        } else {
                System.out.println("No se puede dividir entre 0");
            }
    }
}
