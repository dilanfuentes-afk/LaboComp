package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int bucle = 10;
        double promedio = 0;
        while (bucle > 0) {
            System.out.print("Ingresar un numero: ");
            int numero = ent.nextInt();
            if  (numero % 2 == 0){
                promedio = promedio + numero;
            }
            bucle--;
        }
        System.out.println("El promedio de numeros SOLO pares es " + promedio);
    }
}
