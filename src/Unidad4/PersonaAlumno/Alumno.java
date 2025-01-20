package Unidad4.PersonaAlumno;

public class Alumno extends Persona {
    private double nota;

    public Alumno(String Nombre, String Apellido, int edad, double nota) {
        super(Nombre, Apellido, edad);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
