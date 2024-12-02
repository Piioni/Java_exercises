package Unidad3.Clase.Superherores;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    // Constructor
    public Coleccion(String nombreColeccion, ArrayList<Figura> listaFiguras) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = listaFiguras;
    }

    // Metodo para añadir figuras a la coleccion
    public void añadirFigura(Figura figura) {
        listaFiguras.add(figura);
    }

    // Metodo para hallar la figurita más valiosa
    public Figura masValioso() {
        // Entramos al bucle si la lista de figuras no esta vaciá
        if (!listaFiguras.isEmpty()) {
            Figura figura_mas_valiosa = listaFiguras.getFirst();
            // Recorremos todas las figuras y buscamos la de mayor precio
            for (Figura figura : listaFiguras) {
                if (figura.getPrecio() > figura_mas_valiosa.getPrecio()) {
                    figura_mas_valiosa = figura;
                }
            }
            return figura_mas_valiosa;
        } else return null;
    }

    // Metodo para hallar el valor de la collection
    public double getValorColeccion() {
        if (!listaFiguras.isEmpty()) {
            double precio = 0;
            for (Figura figura : listaFiguras) {
                precio += figura.getPrecio();
            }
            return precio;
        } else {
            System.out.println("La lista de figuras esta vaciá");
            return 0;
        }
    }

    // Metodo para Hallar el volumen total de la coleccion
    public double getVolumenColeccion() {
        if (!listaFiguras.isEmpty()) {
            double volumen_total = 0;
            for (Figura figura : listaFiguras) {
                volumen_total += figura.getDimensiones().getVolumen();
            }
            return volumen_total;
        } else {
            System.out.println("La lista de figuras esta vacia");
            return 0;
        }
    }

    // Metodo para subir el precio
    public void subirPrecio(double cantidad, String codigo) {
        for (Figura figura : listaFiguras) {
            if (figura.getCodigo().equals(codigo)) {
                figura.subirPrecio(cantidad);
                System.out.println("Se ha subido el precio");
            }
        }
        System.out.println("No se puede subir el precio, no se encontró el codigo proporcionado");
    }

    // Getters & Setters
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    // toString
    public String toString() {
        return "Coleccion: " + "\n " +
                "Nombre de la coleccion: " + nombreColeccion + "\n " +
                "Lista de Figuras: " + listaFiguras;
    }
}

