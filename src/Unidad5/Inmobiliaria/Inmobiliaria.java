package Unidad5.Inmobiliaria;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Inmobiliaria implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Path path = Path.of("C:\\Java\\Directorio_Padre\\Inmuebeles\\Lista.txt");
    private static final ArrayList<Inmueble> inmuebles = new ArrayList<>();

    public Inmobiliaria() {
        loadInmuebles();
    }

    public void agregarInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
    }

    public void eliminarInmueble(int id) {
        Inmueble inmueble = buscarInmueble(id);
        if (inmueble != null) {
            inmuebles.remove(inmueble);
        }
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
            oos.writeObject(inmuebles);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadInmuebles() {
        // Leer el objeto de un fichero
        try {
            ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
            ArrayList<Inmueble> inmuebles = (ArrayList<Inmueble>) ois.readObject();
            inmuebles.forEach(Inmueble::imprimir);

        } catch (ClassNotFoundException e) {
            System.out.println("error" + e.getMessage());
        } catch (IOException e) {
            System.out.println("error 2" + e.getMessage());
        }
    }
}
