package Unidad5.Swing.Personas;

import java.util.ArrayList;

public class ListaPersonas {
    private ArrayList<Persona> listaPersonas;


    public ListaPersonas() {
        listaPersonas = new ArrayList<>();
    }

    public void anadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        if (i >= 0 && i < listaPersonas.size()) {
            listaPersonas.remove(i);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void borrarLista() {
        listaPersonas.clear();
    }

    public int getCantidad() {
        return listaPersonas.size();
    }

    public Persona obtenerPersona(int index) {
        if (index >= 0 && index < listaPersonas.size()) {
            return listaPersonas.get(index);
        }
        return null;
    }
}