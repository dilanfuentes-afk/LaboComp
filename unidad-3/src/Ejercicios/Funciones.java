package Ejercicios;

public class Funciones {
    public static void imprimirVector(int [] vector ){
        for(int i : vector){
            System.out.println(i);
        }
    }

    public static int[] vector(int min, int max, int n){
        int [] vector = new int[n];
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * (max - min + 1)) + min;
        }
        return vector;
    }

    public static double promedioVector(int [] vector){
        int total = 0;
        for(int i : vector){
            total = total + i;
        }
        return total / vector.length;
    }

    public static int paresVector(int [] vector){
        int numPares = 0;
        for (int i : vector){
            if(i % 2 == 0){
                numPares++;
            }
        }
        return numPares;
    }

    public static int ocurrencia(int [] vector, int numero) {
        int n;
        int num = 0;
        for (int i : vector) {
            num++;
            if (i == numero) {
                return num;
            }
        }
        return -1;
    }

    public static int [] sumaVectores(int [] vector1, int [] vector2){
        int [] suma = new int[vector1.length];

        for(int i = 0; i < vector1.length;i++){
            suma[i] = vector1[i]+vector2[i];
        }
        return suma;
    }
}
