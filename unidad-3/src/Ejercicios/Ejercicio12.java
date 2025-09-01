package Ejercicios;

import java.util.Scanner;

import static Ejercicios.Funciones.ocurrencia;

public class Ejercicio12 {
    public static void main(String[] args) {
        int [] vec = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < vec.length; i++){
            System.out.print("Ingrese el valor del vector: ");
            vec[i] = ent.nextInt();
        }
        int num = ocurrencia(vec,5);
        System.out.print("El indice del vector en el que esta el numero es " + num);
    }
}
