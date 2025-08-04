package Clase;

public class Ejercicio2clase {
    public static void main(String[] args) {
        double num1 = 2.5;
        double num2 = 7.6;
        double tolerancia = 5;

        boolean iguales = sonIguales(num1,num2,tolerancia);
        System.out.println("La tolerancia de los numeros es " + iguales);
    }

    public static boolean sonIguales(double num1,double num2, double tolerancia) {
        double diferencia = num1 - num2;
        if (diferencia < 0){
            diferencia = 0 - diferencia;
        }
        if (diferencia <= tolerancia){
            return true;
        } else
            return false;
    }
}
