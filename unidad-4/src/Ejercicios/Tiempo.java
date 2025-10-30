package Ejercicios;

public class Tiempo {
    public int dias;
    public int horas;
    public int minutos;
    public int segundos;

    public void sumarSegundos() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            sumarMinutos();
        }
    }

    public void sumarMinutos() {
        minutos++;
        if (minutos >= 60) {
            minutos = 0;
            sumarHoras();
        }
    }

    public void sumarHoras() {
        horas++;
        if (horas >= 24) {
            horas = 0;
            sumarDias();
        }
    }

    public void sumarDias() {
        dias++;
    }
}