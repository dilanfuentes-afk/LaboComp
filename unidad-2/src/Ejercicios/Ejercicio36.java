package Ejercicios;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingrese el texto que desea saber las palabras: ");
        String texto = ent.nextLine();

        if (!texto.isEmpty()) {
            String[] palabras = texto.split("\\s+");
            System.out.println("Cantidad de palabras: " + palabras.length);
        } else {
            System.out.println("No escribiste ninguna palabra.");
        }
    }
}