package Unidad3.Clase.Electrodomesticos;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    // 1er constructor
    public Lavadora( String marca, double potencia, double precio, boolean aguaCaliente) {
        super("Unidad4.Electrodomesticos.Lavadora" , marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    // 2 constructor
    public Lavadora(String marca, double potencia) {
        super("Unidad4.Electrodomesticos.Lavadora" , marca, potencia);
        this.aguaCaliente = false;
    }

    // Metodo getConsumo dependiente del agua
    public double getConsumo(int horas){
        if (aguaCaliente){
            return horas * (getPotencia()+getPotencia() * 0.20);
        } else return horas * getPotencia();
    }

    // Metodo getCosteConsumo override
    @Override
    public double getCosteConsumo(int horas, double costeHora) {
        return super.getCosteConsumo(horas, costeHora);
    }

    // Getters & Setters de la clase
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }


    // Getters & Setters de la superclase
    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public double getPotencia() {
        return super.getPotencia();
    }

    @Override
    public void setPotencia(double potencia) {
        super.setPotencia(potencia);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    // Metodo toString
    public String toString() {
        return "Unidad4.Electrodomesticos.Lavadora: " + "\n" +
                "Tipo: " + getTipo() +  "\n" +
                "Potencia: " + getPotencia() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Precio: " + precio + "\n" +
                "AguaCaliente=" + aguaCaliente ;
    }
}
