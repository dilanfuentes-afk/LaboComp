package Clase;

public class Ejercicio1clase {
    public static void main(String[] args) {
        double num = -242.5;
        double ValorAbs = valorabsoluto(num);
        System.out.println("El valor absoluto del numero es " + ValorAbs);
    }

    public static double valorabsoluto(double num) {
        if (num > 0){
            return num;
        }
        else{
            double negativo = 0 - num;
            return negativo;
        }
    }
}
