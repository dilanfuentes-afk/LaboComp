package Ejercicios;

public class Funciones {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static boolean sonIguales(double num1, double num2, double tolerancia) {
        double diferencia = num1 - num2;
        if (diferencia < 0){
            diferencia = 0 - diferencia;
        }
        if (diferencia <= tolerancia){
            return true;
        }   else {
            return false;
        }
    }

    public static double potencia(int base, int exponente) {
        int resultado;
        if(exponente == 0){
            return 1;
        }
        if (exponente < 0) {
            return 1.0 / potencia(base, -exponente);
        }
        return base * potencia(base, exponente - 1);
    }

    public static int enteroAleatorio(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
