package Ejercicios;

public class Asignatura {
    public String nombre;
    public double calificacion;

    Asignatura(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    // 🔹 Constructor vacío
    public Asignatura() {
    }


    @Override
    public String toString(){
        return String.format("Nombre: %s\nCalificacion: %d",nombre,calificacion);
    }

    public boolean estaAprobada(){
        if (calificacion>=7) return true;
        else return false;
    }
}
