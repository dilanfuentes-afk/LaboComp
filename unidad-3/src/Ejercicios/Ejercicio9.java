package Ejercicios;

import java.util.Scanner;

import static Ejercicios.Funciones.promedioVector;

public class Ejercicio9 {
    public static void main(String[] args) {
        int [] vec = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < vec.length; i++){
            System.out.print("Ingrese el valor del vector: ");
            vec[i] = ent.nextInt();
        }
        double promedio = promedioVector(vec);
        System.out.println("El promedio es " + promedio);

    }
}
