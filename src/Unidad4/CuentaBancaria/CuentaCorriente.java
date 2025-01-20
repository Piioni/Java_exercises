package Unidad4.CuentaBancaria;

public class CuentaCorriente extends Cuenta {
    protected double saldoNegativo = 0;


    public CuentaCorriente(double saldo, double tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo){
            saldoNegativo += cantidad - saldo;
            saldo = 0;
            System.out.println("Saldo insuficiente, quedas debiendo: " + saldoNegativo);
        } else {
            saldo -= cantidad;
            System.out.println("Retiraste: " + cantidad+ ", Tu saldo actual es: " + saldo);
        }
    }

    public void extractoMensual(){
        super.extactoMensual();
    }

    public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Saldo negativo: " + saldoNegativo);
        System.out.println("Numero de transacciones: " + (numeroIngresos+numeroRetiros));
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Saldo negativo: " + saldoNegativo);
    }

}
