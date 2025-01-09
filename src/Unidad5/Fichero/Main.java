package Unidad5.Fichero;

import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        Path path = Path.of("C:\\Users\\Usuario\\OneDrive - Instituto FOC\\Cosas FOC\\Programacion\\Programas\\src\\Unidad5\\Fichero\\fichero.txt");
        System.out.println("Ruta absoluta: " + path.toAbsolutePath());

        if (!Files.exists(path)) {
            System.out.println("El fichero no existe");
            return;
        }

        String contenido = "";
        try {
            contenido = Files.readString(path);
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
    }
}
