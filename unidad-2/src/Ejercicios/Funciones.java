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

        int a = (int) Math.floor(Math.random() * (max - min + 1));
        return a + min;
    }

    public static double areaCirculo(double radio) {
        double exp = radio * radio;
        double area = Math.PI * exp;
        return area;
    }

    public static boolean esPar(int num) {
        if (num % 2 == 0){
            return true;
        } else{
            return false;
        }
    }

    public static int max(int num1, int num2) {
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        int i = 2;
        while (i < n) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static int deBinarioADecimal(int bin){
        return 1; }

    public static double raizCuadrada(double argumento, double tolerancia) {
        double base = 7;    // Elegido arbitrariamente
        double altura = argumento / base;

        while (!sonIguales(base, altura, tolerancia)) {
            base = (base + altura) / 2;
            altura = argumento / base;
        }
        return base;
    }

    public static int factorial(int num) {
        if (num == 0){
            return 1;
        } else
            return num * factorial(num - 1);
    }
    public static int sumaNatural(int num){
        if (num == 0){
            return 0;
        } else {
            return num + sumaNatural(num - 1);
        }
    }
    public static int fibonacci(int num){
        if (num == 0){
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static int sumaDigitos(int n){
        n = Math.abs(n); // Asegura que el número sea positivo

        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }
    }

