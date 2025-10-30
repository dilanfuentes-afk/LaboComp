package PruebaDeEjercicios;

import Ejercicios.Persona;

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona Persona1 = new Persona();

        Persona1.setNombre("Dilan");
        Persona1.setEdad(19);
        Persona1.setAltura(1.75);

        System.out.println(Persona1.toString());

        System.out.println("Nombre: "+ Persona1.getNombre());

    }
}
