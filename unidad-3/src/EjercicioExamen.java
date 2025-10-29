public class EjercicioExamen {
    public static int colectivo(int [] distancia, int origen, int destino){
        int n = distancia.length;

        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total + distancia[i];
        }

        int paraAdelante = 0;
        for (int i = origen; i != destino; i = (i + 1) % n) {
            paraAdelante = paraAdelante + distancia[i];
        }

        int paraAtras = total - paraAdelante;

        if (paraAdelante < paraAtras) {
            return paraAdelante;
        } else {
            return paraAtras;
        }
    }

}
