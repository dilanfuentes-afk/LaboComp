package Ejercicios;

import static Ejercicios.Funciones.sonIguales;

public class Ejercicio23 {
    public static void main(String[] args) {
        double a = 2.3;
        double b = 2.0;
        double tol = 0.2;
        boolean sonIguales = sonIguales(a,b,tol);
        System.out.println("¿La diferencia de los dos numeros supera la tolerancia? " + sonIguales);
    }
}
