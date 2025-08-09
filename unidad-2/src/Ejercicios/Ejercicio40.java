package Ejercicios;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main (String []args){
        Scanner ent = new Scanner(System.in);
        System.out.print("Colocar palabra a invertir: ");
        String palabra = ent.nextLine();
        String invertido = "";

        for (int i = palabra.length() - 1; i >= 0; i--){
            invertido += palabra.charAt(i);
        }

        System.out.println("La palabra invertida es " + invertido);
    }
}
