public class Promedio {
    public static double promedio(int [] vector) {

        if (vector == null || vector.length == 0) {
            return 0.0; // no hay elementos, promedio = 0
        }

        double total  = 0;
        for (int i = 0; i < vector.length; i++) {
            total = total + vector[i];
        }
        return total/vector.length;
    }
}