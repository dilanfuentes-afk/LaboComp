package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);

        int [] vector = new int[10];

        for(int i = 0; i <vector.length;i++){
            System.out.print("Ingrese valor en el espacio " + (i+1) + " del vector: ");
            vector[i] = ent.nextInt();
        }

        for(int i : vector){
            System.out.println(i);
        }
    }
}
