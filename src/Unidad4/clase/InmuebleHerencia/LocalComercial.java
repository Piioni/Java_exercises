package Unidad4.clase.InmuebleHerencia;

public class LocalComercial extends Local {
    protected double valorArea;
    protected String centroComercial;

    public LocalComercial(int identificador, int area, String direccion, TipoLocal tipo, double valorArea, String centroComercial) {
        super(identificador, area, direccion, tipo);
        this.valorArea = valorArea;
        this.centroComercial = centroComercial;
    }

    public LocalComercial() {
        super();
        this.valorArea = 0;
        this.centroComercial = "";
    }

    public void imprimir() {
        System.out.println("Local Comercial");
        super.imprimir();
        System.out.println("Valor Area: " + this.valorArea);
        System.out.println("Centro Comercial: " + this.centroComercial);
    }
}
