package Unidad5.Ficheros.Fichero;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero: ");
        String nombreFichero = scanner.nextLine();
        leerFichero(nombreFichero);
    }

    private static void leerFichero(String nombre) {
        Path path = Path.of("C:\\Users\\Usuario\\OneDrive - Instituto FOC\\Cosas FOC\\Programacion\\Programas\\src\\Unidad5\\Fichero\\" + nombre);

        if (!Files.exists(path)) {
            System.out.println("El fichero no existe");
            return;
        }

        String contenido;
        try {
            contenido = Files.readString(path).toUpperCase();
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
    }
}
