public class Tp {
    public static int [] intercambio(int [] vector, int indice1, int indice2){
        int a = vector[indice1];
        vector[indice1] = vector [indice2];
        vector[indice2] = a;

        return vector;
    }

    public static int [] fila(int [][] matriz, int fila){

            return matriz [fila];
    }

    public static int [] columna (int [][] matriz, int columna){
        int [] array = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++){
            array[i] = matriz[i][columna];
        }
        return array;
    }

}
