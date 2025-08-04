package Clase;

public class ConFor {
    public static void main(String[] args) {
        System.out.println(potencia(2,3));
    }

    public static double potencia(double base, double exponente) {
      //Recursivo
        if (exponente == 1) {
            return 1;
        }else {
            return (potencia( base,exponente - 1))
        }
        //normal
        double resultado = 1;
        for(int 1 = 0; 1 < exponente; i++) {
            resultado *-base
        }
        return resultado;
    }
}
