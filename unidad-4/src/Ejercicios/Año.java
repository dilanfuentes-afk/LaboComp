package Ejercicios;

public class Año {
    public int año;

    @Override
    public String toString(){
        if (año<0) {
            return Math.abs(año) + " a.C.";
        } else {
            return año + " d.C.";
        }
    }

    public boolean esBisiesto(){
        if (año % 4 == 0) return true;
        else return false;
        }
    }
