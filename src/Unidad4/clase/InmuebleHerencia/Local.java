package Unidad4.clase.InmuebleHerencia;

public class Local extends Inmueble{
    protected TipoLocal tipo;

    public Local(int identificador, int area, String direccion, TipoLocal tipo) {
        super(identificador, area, direccion);
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
