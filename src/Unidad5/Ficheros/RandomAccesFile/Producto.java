package Unidad5.Ficheros.RandomAccesFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class Producto implements Serializable {
    private int id;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = ajustarNombre(nombre);
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String ajustarNombre(String nombre){
        if (nombre.length() > 20){
            return nombre.substring(0, 20);
        }else{
            return String.format("%-20s", nombre);
        }
    }

    public void escribir(RandomAccessFile raf) throws IOException {
        raf.writeInt(id);
        raf.writeChars(nombre); // Escribe 20 caracteres (40 bytes)
        raf.writeInt(cantidad);
        raf.writeDouble(precio);
    }

    public static void leer(RandomAccessFile raf) throws IOException {
        int id = raf.readInt();
        StringBuilder nombreBuilder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            nombreBuilder.append(raf.readChar());
        }
//        String nombre = raf.readChar()
        int cantidad = raf.readInt();
        double precio = raf.readDouble();
        Producto p = new Producto(id, nombreBuilder.toString(), cantidad, precio);
        p.imprimir();
    }


    public void imprimir(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
