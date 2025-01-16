package Unidad5.CuentaAhorros;

public enum TipoTransaccion {
    CONSIGNACION("Consignación"),
    RETIRO("Retiro");

    private String tipo;

    TipoTransaccion(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

}
