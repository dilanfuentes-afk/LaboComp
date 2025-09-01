package Ejercicios;

import java.util.Scanner;

import static Ejercicios.Funciones.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        int [] vec1 = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < vec1.length; i++){
            System.out.print("Ingrese el valor del vector 1: ");
            vec1[i] = ent.nextInt();
        }
        int [] vec2 = new int[5];
        for (int i = 0; i < vec2.length; i++){
            System.out.print("Ingrese el valor del vector 2: ");
            vec2[i] = ent.nextInt();
        }

        imprimirVector(sumaVectores(vec1,vec2));
    }
}
