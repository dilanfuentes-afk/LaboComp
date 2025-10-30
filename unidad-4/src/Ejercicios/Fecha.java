package Ejercicios;

public class Fecha {
    public int dia;
    public int mes;
    public int año;

    @Override
    public String toString(){
        return String.format(String.format("%02d/%02d/%04d", dia, mes, año));
    }

    public int diasHasta(Fecha f){
        return  -1;
    }
}
