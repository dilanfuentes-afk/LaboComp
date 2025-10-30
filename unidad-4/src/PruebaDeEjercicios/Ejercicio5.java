package PruebaDeEjercicios;

import Ejercicios.Año;

public class Ejercicio5 {
    public static void main(String[] args) {

        Año anio = new Año();

        anio.año = -1800;

        System.out.println(anio.esBisiesto());
        System.out.println(anio.toString());
    }
}
