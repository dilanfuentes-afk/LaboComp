package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] vector;
        int n;

        Scanner ent = new Scanner(System.in);

        System.out.print("Ingrese el valor para n: ");
        n = ent.nextInt();

        if(n > 0){
            vector = new int[n];
            System.out.println("La dimension del vector es " + n);
        } else {
            System.out.println("El numero ingresado es incorrecto");
        }

    }
}
