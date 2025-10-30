package PruebaDeEjercicios;

import Ejercicios.Tiempo;

public class Ejercicio6 {
    public static void main(String[] args) {
        Tiempo t = new Tiempo();

        t.dias = 0;
        t.horas = 23;
        t.minutos = 59;
        t.segundos = 58;


        System.out.println("Tiempo inicial: " + t.dias + "d " + t.horas + "h " + t.minutos + "m " + t.segundos + "s");

        t.sumarSegundos();
        System.out.println("Después de sumar 1 segundo: " + t.dias + "d " + t.horas + "h " + t.minutos + "m " + t.segundos + "s");

        t.sumarMinutos();
        System.out.println("Después de sumar un minuto: " + t.dias + "d " + t.horas + "h " + t.minutos + "m " + t.segundos + "s");

        t.sumarHoras();
        System.out.println("Después de sumar una hora: " + t.dias + "d " + t.horas + "h " + t.minutos + "m " + t.segundos + "s");

        t.sumarDias();
        System.out.println("Después de sumar un dia: " + t.dias + "d " + t.horas + "h " + t.minutos + "m " + t.segundos + "s");
    }
}
