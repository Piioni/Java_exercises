package Unidad4.clase.InmuebleHerencia;

public class Oficina extends Local{
    protected double valorArea;
    protected boolean esGobierno;

    public Oficina(int identificador, int area, String direccion, TipoLocal tipo, double valorArea, boolean esGobierno) {
        super(identificador, area, direccion, tipo);
        this.valorArea = valorArea;
        this.esGobierno = esGobierno;
    }

    public Oficina() {
        super();
        this.valorArea = 0;
        this.esGobierno = false;
    }

    public void imprimir() {
        System.out.println("Oficina");
        super.imprimir();
        System.out.println("Valor Area: " + this.valorArea);
        System.out.println("Es Gobierno: " + this.esGobierno);
    }

}
