package Unidad5.Ficheros.GestionPersonas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("C:/Java/Directorio_Padre/personas.dat");

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Cuantas personas deseas agregar?");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingresa el nombre de la persona: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingresa la edad de la persona: ");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa la altura de la persona: ");
                double altura = scanner.nextDouble();
                escribirDatos(path, "Nombre: " +nombre+ ", " + "Edad: " +edad+ ", " + "Altura: " +altura+ "\n");
                scanner.nextLine();
            }
            System.out.println(leerDatos(path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribirDatos(Path path, String datos) throws IOException {
        try {
            Files.write(path, datos.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leerDatos(Path path) throws IOException {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}
