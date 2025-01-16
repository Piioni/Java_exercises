package Unidad5.CuentaAhorros;

import java.io.Serial;
import java.io.Serializable;

public class Transaccion implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private TipoTransaccion tipo; // "Consignación" o "Retiro"
    private double monto;

    public Transaccion(TipoTransaccion tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo.getTipo();
    }

    public double getMonto() {
        return monto;
    }

    public void imprimirTransaccion() {
        System.out.println(tipo.getTipo() + " -Monto: " + monto);
    }
}
