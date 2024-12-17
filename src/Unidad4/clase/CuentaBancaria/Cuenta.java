package Unidad4.clase.CuentaBancaria;

public class Cuenta {
    protected double saldo;
    protected  int numeroIngresos = 0;
    protected  int numeroRetiros = 0;
    protected double tasaAnual;
    protected double comisionMensual;

    public Cuenta(double saldo, double tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
        numeroIngresos++;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
        numeroRetiros++;
    }

    public void calcularInteres() {
        double interes = saldo * tasaAnual / 12;
        saldo += interes;
    }

    public void extactoMensual(){

    }
}
