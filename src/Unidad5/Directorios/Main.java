package Unidad5.Directorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Ruta del directorio padre
        Path path = Path.of("C:/Java/Directorio_Padre");

        // Comprobar si el directorio existe
        System.out.println("Existe el directorio: " + existe(path));

        // Listar los archivos del directorio
        try (var stream = Files.list(path)) {
            stream.forEach(file -> {
                System.out.println(file.getFileName());
                if(Files.isDirectory(file)) {
                    System.out.println("Es un directorio");
                } else System.out.println("Es un archivo");
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fin del programa");
        }

        // hallar la palabra más grande de un archivo de texto
        Path path2 = Path.of("C:/Java/Directorio_Padre/Hola.txt");
        try{
            System.out.println("Palabra mas grande: " + palabraMasGrande(path2));
        } catch (RuntimeException e) {
            System.out.println("Error al leer el archivo");
        }


    }

    public static boolean existe(Path path) {
        return Files.exists(path);
    }

    public static String palabraMasGrande(Path path) throws RuntimeException {
        String palabraMasGrande = "";
        List<String> Lineas;
        try {
            Lineas = Files.readAllLines(path);
            System.out.println(Lineas);
            for (String Linea : Lineas) {
                for (String palabra : Linea.split("\\s+")) {
                    if (palabra.length() > palabraMasGrande.length()) {
                        palabraMasGrande = palabra;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return palabraMasGrande;
    }
}
