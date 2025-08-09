package Ejercicios;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        System.out.print("Elegir la frase a la cual vamos a contar las vocales: ");
        String texto = ent.nextLine();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                contador++;
        }
        }
        System.out.println("La cantidad de letra son " + contador);
    }
}
