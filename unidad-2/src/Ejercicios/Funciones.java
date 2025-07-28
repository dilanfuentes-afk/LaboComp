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
        int decimal = 0;
        int potencia = 1; // 2^0 = 1

        while (bin > 0) {
            int digito = bin % 10;  // tomo el último dígito

            if (digito != 0 && digito != 1) {
                System.out.println("Error: el número no es binario.");
                return -1; // código de error
            }

            int producto = digito * potencia;
            decimal = decimal + producto;

            potencia = potencia * 2; // aumento la potencia (2^0, 2^1, 2^2...)
            bin = bin / 10; // elimino el último dígito
        }
        return decimal;
    }

    static double raizCuadrada(double n) {
        if (n < 0) throw new IllegalArgumentException("n negativo");
        if (n == 0) return 0.0;

        double x = n;          // estimación inicial
        double tol = 1e-6;     // suficiente para 5 decimales
        double diff = Double.MAX_VALUE;

        while (diff > tol) {
            double nx = 0.5 * (x + n / x); // Newton-Raphson (babilónico)
            diff = x - nx;
            if (diff < 0) diff = -diff;    // |diff| sin Math.abs
            x = nx;
        }

        // redondeo manual a 5 decimales
        double factor = 100000.0;
        long tmp = (long) (x * factor + 0.5);
        return tmp / factor;
    }
}
