package Unidad5.Leectura_Escritura;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("src/Unidad5/Leectura_Escritura/entrada.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantas lineas quieres imprimir: ");
        // escribir en el archivo
        try {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                // Escribir en el archivo
                try {
                    Files.writeString(path, "Linea: " + i + "\n", StandardOpenOption.APPEND);
                } catch (Exception e) {
                    System.out.println("Error al escribir en el archivo");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el numero de lineas");
        }

        // Leer el archivo
        try {
            String texto;
            texto = Files.readString(path);
            System.out.println(texto);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
