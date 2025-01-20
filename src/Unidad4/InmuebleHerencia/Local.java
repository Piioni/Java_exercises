package Unidad4.InmuebleHerencia;

public class Local extends Inmueble{
    protected TipoLocal tipo;

    public Local(int identificador, int area, String direccion, double precioVenta, TipoLocal tipo) {
        super(identificador, area, direccion, precioVenta);
        this.tipo = tipo;
    }

    public Local() {
        super();
        this.tipo = TipoLocal.OTRO;
    }

    public void imprimir() {
        System.out.println("Local");
        super.imprimir();
    }

}
