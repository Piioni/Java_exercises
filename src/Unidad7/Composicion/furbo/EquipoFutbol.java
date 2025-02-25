package Unidad7.Composicion.furbo;

public class EquipoFutbol {
    private String nombre;
    private String pais;
    private Tecnico tecnico;
    private Portero portero;
    private Defensa[] defensas;
    private MedioCampo[] MedioCampos;
    private Delantero[] delanteros;

    public EquipoFutbol(String nombre, String pais, Tecnico tecnico, Portero portero, Defensa[] defensas,
                        MedioCampo[] MedioCampos, Delantero[] delanteros) {
        this.nombre = nombre;
        this.pais = pais;
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensas = defensas;
        this.MedioCampos = MedioCampos;
        this.delanteros = delanteros;
    }

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public EquipoFutbol() {
        this.nombre = "Desconocido";
        this.pais = "Desconocido";
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Pais: " + this.pais);
    }

    public void imprimirJugadores() {
        System.out.println("Tecnico:");
        this.tecnico.imprimir();
        System.out.println("Portero:");
        this.portero.imprimir();
        System.out.println("Defensas:");
        for (Defensa defensa : this.defensas) {
            defensa.imprimir();
        }
        System.out.println("MedioCampos:");
        for (MedioCampo MedioCampo : this.MedioCampos) {
            MedioCampo.imprimir();
        }
        System.out.println("Delanteros:");
        for (Delantero delantero : this.delanteros) {
            delantero.imprimir();
        }
    }


}
