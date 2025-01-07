package Unidad4.clase.InmuebleHerencia;

public enum TipoLocal {
    INTERNO("Interno"),
    EXTERNO("Externo"),
    OTRO("Otro");

    private String tipo;

    private TipoLocal(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
