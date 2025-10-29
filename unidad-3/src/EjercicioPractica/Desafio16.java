package EjercicioPractica;

public class Desafio16 {
    public static int ganancia(int [] precios){

        int gananciaMax = 0;
        int gananciaCurrent;
        int acumulador = 0;
        int n = 0;
        for (int i = 0; i < precios.length - 1; i++) {
            if (precios[n] < precios[i + 1]){

                if (precios[i] > precios [i + 1]){
                    gananciaCurrent = Math.abs(precios[i + 1] - precios[i]);
                } else {
                    gananciaCurrent = precios[i + 1] - precios[i];
                }
                acumulador = acumulador + gananciaCurrent;

                if (acumulador > gananciaMax){
                    gananciaMax = acumulador;
                }

            } else{
                n++;
            }
        }
        return gananciaMax;
    }
}
