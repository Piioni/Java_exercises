package Unidad7.Composicion.furbo;

public class Tecnico extends Persona {
    protected int anyosExperiencia;

    public Tecnico(String nombre, String apellidos, int edad, int anyosExperiencia) {
        super(nombre, apellidos, edad);
        this.anyosExperiencia = anyosExperiencia;
    }

    public Tecnico() {
        super();
        this.anyosExperiencia = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Años de Experiencia: " + this.anyosExperiencia);
    }
}
