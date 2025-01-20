package Unidad4.PersonaAlumno;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "Rangel", 20);
        Alumno alumno = new Alumno("Juan2", "Rangel", 20, 10.0);

        persona.mostrarPersona();
        System.out.println("Nota: " + alumno.getNota());
    }
}
