package Unidad5.Ficheros.Eco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Eco {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Unidad5/Eco/eco.txt"))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

    }
}