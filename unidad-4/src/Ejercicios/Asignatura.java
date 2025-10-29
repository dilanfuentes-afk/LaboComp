package Ejercicios;

public class Asignatura {
    public String nombre;
    public int calificaciones;

    public boolean estaAprobada(){
        if (calificaciones >= 7) return true;
        else return false;
    }
}
