package Unidad7.Composicion.furbo;

public class MedioCampo  extends Jugador{
    protected int asistencias;

    public MedioCampo(String nombre, String apellidos, int edad, boolean titular, int asistencias) {
        super(nombre, apellidos, edad, titular);
        this.asistencias = asistencias;
    }

    public MedioCampo() {
        super();
        this.asistencias = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Asistencias: " + this.asistencias);
    }


}
