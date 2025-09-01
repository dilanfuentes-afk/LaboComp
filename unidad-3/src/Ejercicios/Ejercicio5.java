package Ejercicios;

import java.util.Scanner;

import static Ejercicios.Funciones.imprimirVector;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [] tabla = new int[10];
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese de que numero quiere la tabla: ");
        int n = ent.nextInt();

        for(int i = 0; i < tabla.length;i++){
            tabla [i] = n * (i + 1);
        }
        int a = 1;
        for(int i : tabla){
            System.out.println("2x"+a+"= "+i);
            a++;
        }
    }
}
