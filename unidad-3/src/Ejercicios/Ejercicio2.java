package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String [] nombreCompleto = new String [2];
        System.out.print("Ingresar el nombre: ");
        nombreCompleto[0] = ent.nextLine();

        System.out.print("Ingresar el apellido: ");
        nombreCompleto[1] = ent.nextLine();

        for(String i : nombreCompleto){
            System.out.println(i);
        }
    }
}
