package Ejercicios;

public class CuentaBancaria {
    private double saldo;
    private static double tasaDeInteres = 0.05;

    @Override
    public String toString(){
        return String.format("El saldo es: %f",saldo);
    }

    public void calcularInteres(){
        double interes = saldo * tasaDeInteres;
        System.out.println("El interes generado es " + interes + " con una tasa de interes de 5%");
    }

    public void depositar(double monto){
        if (monto > 0){
            saldo = saldo + monto;
            System.out.println("Deposito exitoso. Tu saldo actual es: " + saldo);
        } else {
            System.out.println("El deposito ingresado no puede ser negativo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
            System.out.println("El retiro fue exitoso. Tu saldo actual es: " + saldo);
        } else{
            System.out.println("El monto ingresado fue incorrecto o va dar un saldo negativo");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public static double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public static void setTasaDeInteres(double tasa) {
        tasaDeInteres = tasa;
    }


}
