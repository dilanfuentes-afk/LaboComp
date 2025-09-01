package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] enteros = new int[3];
        enteros[0] = 47467620;
        enteros[1] = 47467621;
        enteros[2] = 47467622;

        imprimirArray(enteros);
    }

    public static void imprimirArray(int [] array){

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
