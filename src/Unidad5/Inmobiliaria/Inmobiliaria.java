package Unidad5.Inmobiliaria;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Inmobiliaria implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private static final Path path = Path.of("C:\\Java\\Directorio_Padre\\Inmuebles\\Lista.txt");
    private final ArrayList<Inmueble> inmuebles = new ArrayList<>();
    private int numInmuebles = 0;

    public Inmobiliaria() {
        try{
            loadInmuebles();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getNewId() {
        return ++numInmuebles;
    }

    public void agregarInmueble(String ciudad, String direccion, Tipo tipo) {
        Inmueble inmueble = new Inmueble(getNewId(), ciudad, direccion, tipo);
        inmuebles.add(inmueble);
        this.guardarInmuebles();

    }

    public void eliminarInmueble(int id) {
        Inmueble inmueble = buscarInmueble(id);
        if (inmueble != null) {
            inmuebles.remove(inmueble);
            numInmuebles--;
        }
        this.guardarInmuebles();
    }

    public void imprimirInmuebles() {
        inmuebles.forEach(Inmueble::imprimir);
    }

    public Inmueble buscarInmueble(int id) {
        return inmuebles.stream()
                .filter(inmueble -> inmueble.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void guardarInmuebles() {
        // Escribir el objeto en un fichero
        try {
            ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path));
            oos.writeObject(this);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadInmuebles() throws IOException {
        // Leer el objeto de un fichero
        if(Files.exists(path) && Files.size(path) > 0) {
            try {
                ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
                Inmobiliaria inmobiliaria = (Inmobiliaria) ois.readObject();
                this.inmuebles.addAll(inmobiliaria.inmuebles);
                this.numInmuebles = inmobiliaria.numInmuebles;

            } catch (IOException e) {
                System.out.println("error 2" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("error 3" + e.getMessage());
            }
        } else {
            System.out.println("El fichero no existe o No hay inmuebles");
        }

    }
}
