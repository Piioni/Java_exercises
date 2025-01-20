package Unidad4.CuentaBancaria;

public class Cuenta {
    protected double saldo;
    protected  int numeroIngresos = 0;
    protected  int numeroRetiros = 0;
    protected double tasaAnual;
    protected double comisionMensual = 0;

    // Constructor sin parametros
    public Cuenta() {
        saldo = 0;
        tasaAnual = 0;
    }

    // Constructor con parametros
    public Cuenta(double saldo, double tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    // Ingresar dinero y sumar numero de ingresos
    public void ingresar(double cantidad) {
        saldo += cantidad;
        numeroIngresos++;
    }

    // Retirar dinero y sumar numero de retiros
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente, tu saldo actual es: " + saldo);
            return;
        } else {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }

    // Calcylar intereses mensual y sumar al saldo
    public void calcularInteres() {
        double interes = saldo * tasaAnual / 12;
        saldo += interes;
    }

    // Calcular comision mensual y restar al saldo
    public void extactoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }
}
