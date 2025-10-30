package PruebaDeEjercicios;

import Ejercicios.SensorTemperatura;

public class Ejercicio13 {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        SensorTemperatura.enGradosCelcius = true;
        sensor.setTemperatura(25);
        System.out.println("Temperatura en Celsius: " + sensor.getTemperatura() + " °C");

        SensorTemperatura.enGradosCelcius = false;
        sensor.setTemperatura(77);
        System.out.println("Temperatura en Fahrenheit: " + sensor.getTemperatura() + " °F");
    }
}
