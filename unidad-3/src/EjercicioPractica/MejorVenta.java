package EjercicioPractica;

public class MejorVenta {
        public static int numeroDeVentas(int [][] ventas){

            int n = 0;
            int maxVenta = 0;
            int mejorVendedor = 0;


            for(int i = 0; i < ventas.length; i++){
                for(int j = 0; j < ventas[i].length; i++){
                    n = n + ventas[i][j];
                }
                if(n > maxVenta){
                    maxVenta = n;
                    mejorVendedor = i;
                }
                n = 0;
            }

            return mejorVendedor;

























        }
}
