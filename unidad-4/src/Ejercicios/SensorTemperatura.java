package Ejercicios;

public class SensorTemperatura {
    private double temperatura;
    public  static boolean enGradosCelcius;

    public double getTemperatura() {
        if (enGradosCelcius) {
            return temperatura;
        } else {
            return temperatura * 9 / 5 + 32;
        }
    }

    public void setTemperatura(double temp) {
        if (enGradosCelcius) {
            this.temperatura = temp;
        } else {
            this.temperatura = (temp - 32) * 5 / 9;
        }
    }
    public static boolean isEnGradosCelcius() {
        return enGradosCelcius;
    }

    public static void setEnGradosCelcius(boolean enGradosCelcius) {
        SensorTemperatura.enGradosCelcius = enGradosCelcius;
    }
}
