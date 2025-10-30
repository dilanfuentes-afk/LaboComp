package Ejercicios;

public class Resistor {
    private double resistencia;

    public Resistor(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getResistencia() {
        return resistencia;
    }

    public static double calcularEquivalenteSerie(Resistor[] resistores) {
        double equivalente = 0;
        for (int i = 0; i < resistores.length; i++) {
            equivalente = equivalente + resistores[i].getResistencia();
        }
        return equivalente;
    }

    public static double calcularEquivalenteParalelo(Resistor[] resistores) {
        double suma = 0;
        double temp;
        for (int i = 0; i < resistores.length; i++) {
            temp = 1/(resistores[i].resistencia);
            suma = suma + temp;
        }
        return 1/suma;
    }
}
