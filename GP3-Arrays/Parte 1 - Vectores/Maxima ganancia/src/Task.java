public class Task {
    public static int maximaGanancia(int [] precios) {

        int ganancia;
        int diaCompra = 0;
        int gananciaMax = 0;

        for (int i = 0; i < precios.length; i++) {
            ganancia = precios[i] - precios[diaCompra];

            if (ganancia > gananciaMax) {
                gananciaMax = ganancia;
            }

            if (ganancia < 0) {
                diaCompra = i;
            }
        }
        return gananciaMax;
    }
}
