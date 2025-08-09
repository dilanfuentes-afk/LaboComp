package Ejercicios;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String texto = sc.nextLine();  // Leer línea completa

        String[] palabras = texto.split("\\s+");  // Separar por espacios

        String palabraMasLarga = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }

        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}