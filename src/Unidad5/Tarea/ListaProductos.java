package Unidad5.Tarea;

import java.util.ArrayList;
import java.util.List;

public class ListaProductos {
    private final List<Producto> listaProductos;

    public ListaProductos() {
        listaProductos = new ArrayList<>();
    }

    public void anadirProducto(Producto p) {
        listaProductos.add(p);
    }

    public void eliminarProducto(int i) {
        if (i >= 0 && i < listaProductos.size()) {
            listaProductos.remove(i);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public Producto buscarProducto(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }


    public Producto[] getListaProductos() {
        return listaProductos.toArray(new Producto[0]);
    }
}
