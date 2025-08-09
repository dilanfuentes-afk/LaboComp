package Ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main (String[]args){
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingresa la palabra que despues quiera cambiar: ");
        String parrafo = ent.nextLine();
        System.out.print("Ingresa el caracter que quieras cambiar: ");
        char caracter1 = ent.nextLine().charAt(0);
        System.out.print("Ingresa el caracter que va a remplazar al otro: ");
        char caracter2 = ent.nextLine().charAt(0);

        String resultado = parrafo.replace(caracter1, caracter2);
        System.out.print("El texto cambiado es: " + resultado);
    }
}
