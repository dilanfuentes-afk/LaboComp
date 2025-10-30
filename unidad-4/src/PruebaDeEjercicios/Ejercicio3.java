package PruebaDeEjercicios;

import Ejercicios.Asignatura;

public class Ejercicio3 {
    public static void main(String[] args) {
        Asignatura materia1 = new Asignatura();

        materia1.setNombre("Dilan");
        materia1.setCalificaciones(7);

        System.out.println(materia1.toString());
    }
}
