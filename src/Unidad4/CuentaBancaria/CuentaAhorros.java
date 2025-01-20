package Unidad4.CuentaBancaria;

public class CuentaAhorros extends Cuenta {
    protected boolean cuenta_activa ;

    public CuentaAhorros(double saldo, double tasaAnual) {
        super(saldo, tasaAnual);
        cuenta_activa = saldo > 10000;
    }

    public void ingresar(double cantidad) {
        if (cuenta_activa) {
            super.ingresar(cantidad);
        }
    }

    public void retirar(double cantidad) {
        if (cuenta_activa) {
            super.retirar(cantidad);
        }
    }

    public void extactoMensual() {
        if (cuenta_activa) {
            if (numeroRetiros > 4) {
                comisionMensual = 1000;
            }
            super.extactoMensual();
            cuenta_activa = saldo > 10000;
        }
    }

    public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de transacciones: " + (numeroIngresos+numeroRetiros));
        System.out.println("Comision mensual: " + comisionMensual);
    }

}
