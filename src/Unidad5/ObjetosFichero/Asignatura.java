package Unidad5.ObjetosFichero;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Asignatura implements Serializable {
    private final int codigo;
    private final String nombre;
    private final int creditos;

    public Asignatura(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public static void leerAsignatura(Path path) {
        // Leer el objeto de un fichero
        try {
            ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
            Asignatura a = (Asignatura) ois.readObject();
            a.imprimir();

        } catch (ClassNotFoundException e) {
            System.out.println("error" + e.getMessage());
        } catch (IOException e) {
            System.out.println("error 2" + e.getMessage());
        }
    }

    public void escribirAsignatura(Path path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path));
            oos.writeObject(this);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void imprimir() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Creditos: " + creditos);
    }
}
