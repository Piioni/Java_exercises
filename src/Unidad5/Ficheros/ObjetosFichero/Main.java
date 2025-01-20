package Unidad5.Ficheros.ObjetosFichero;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

//        Asignatura a1 = new Asignatura(1, "Matematicas", 5);


//        a1.escribirAsignatura(Path.of("C:\\Java\\Directorio_Padre\\Asignaturas\\a1.txt"));
        Asignatura.leerAsignatura(Path.of("C:\\Java\\Directorio_Padre\\Asignaturas\\a1.txt"));



    }
}
