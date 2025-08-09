package Ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingresa la palabra para verificar si es un palíndromodo: ");
        String palabra = ent.nextLine();
        String invertido = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertido += palabra.charAt(i);
        }
        if (invertido.equals(palabra)){
            System.out.println("Es un políndrono");
        } else {
            System.out.println("No es un políndrono");
        }
    }
}
