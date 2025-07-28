package Ejercicios;

import static Ejercicios.Funciones.deBinarioADecimal;

public class Ejercicio30 {
    public static void main(String[] args) {
        int numbi = 101010;
        int deci = deBinarioADecimal(numbi);
        if (deci == -1){
            System.out.println("El numero introducido es incorrecto");
            return;
        }
        System.out.println("El numero binario transformado es " + deci);
    }
}
