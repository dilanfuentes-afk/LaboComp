public class ProductoMatricial {
    public static int[][] productoMatricial(int[][] A,int [][] B) {
        // Verificar si el producto es posible
        if (A[0].length != B.length) {
            return null; // no se puede multiplicar
        }

        int filasA = A.length;         // número de filas de A (n)
        int columnasA = A[0].length;   // número de columnas de A (m)
        int columnasB = B[0].length;   // número de columnas de B (q)

        int[][] resultado = new int[filasA][columnasB]; // matriz n x q

        // Recorremos cada fila i de A
        for (int i = 0; i < filasA; i++) {
            // Recorremos cada columna j de B
            for (int j = 0; j < columnasB; j++) {
                int suma = 0;
                // sumamos los productos A[i][k] * B[k][j] para k = 0..m-1
                for (int k = 0; k < columnasA; k++) {
                    suma += A[i][k] * B[k][j];
                }
                resultado[i][j] = suma; // asignamos el valor calculado
            }
        }

        return resultado;
    }
}
