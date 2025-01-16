package Unidad5.CuentaAhorros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class CuentaAhorro implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private double saldo;
    private ArrayList<Transaccion> transacciones;
    private static final Path PATH = Path.of("C:/Java/Directorio_Padre/CuentaBancaria/cuenta.txt");

    public CuentaAhorro() {
        this.cargarCuenta();
    }

    public CuentaAhorro cargarCuenta() {
        try {
            if (Files.exists(PATH) && Files.size(PATH) > 0) {
                ObjectInputStream ois = new ObjectInputStream((Files.newInputStream(PATH)));
                CuentaAhorro cuentaCargada = (CuentaAhorro) ois.readObject();
                this.saldo = cuentaCargada.saldo;
                this.transacciones = cuentaCargada.transacciones;
                ois.close();
                return this;
            } else {
                System.out.println("No se encontró la cuenta. Creando una nueva...");
                return new CuentaAhorro();
            }
        } catch (IOException e) {
            System.out.println("Error al cargar la cuenta: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la cuenta: " + e.getMessage());
        }
        return null;
    }

    public void guardarCuenta() {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(PATH))) {
            oos.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error al guardar la cuenta: " + e.getMessage());
        }
    }

    public void mostrarExtracto() {
        System.out.println("Saldo actual: " + saldo);
        transacciones.forEach(Transaccion::imprimirTransaccion);
    }

    public void consignar(double monto) {
        saldo += monto;
        System.out.println("Consignación de " + monto + " realizada con éxito.");
        Transaccion transaccion = new Transaccion(TipoTransaccion.CONSIGNACION, monto);
        transacciones.add(transaccion);
        guardarCuenta();
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado con éxito");
            Transaccion transaccion = new Transaccion(TipoTransaccion.RETIRO, monto);
            transacciones.add(transaccion);
            guardarCuenta();

        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

}
