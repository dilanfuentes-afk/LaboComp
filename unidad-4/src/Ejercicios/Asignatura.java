package Ejercicios;

public class Asignatura {
    private String nombre;
    private int calificaciones;

    public Asignatura(String nombre, int calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public Asignatura(String nombre) {
        calificaciones = 7;
    }

    public Asignatura() {
    }

    public boolean estaAprobada(){
        if (calificaciones >= 7) return true;
        else return false;
    }

    @Override
    public String toString(){
        return String.format("Nombre: %s\nCalificaciones: %d",nombre,calificaciones);
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    //Setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificaciones(int calificaciones) {
        if (calificaciones >= 1 && calificaciones <= 10){
            this.calificaciones = calificaciones;
        }
    }
}
