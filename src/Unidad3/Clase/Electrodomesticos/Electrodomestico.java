package Unidad3.Clase.Electrodomesticos;

public class Electrodomestico {
    private  String tipo;
    private  String marca;
    private  double potencia;

    // Constructor
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    // Metodo getConsumo
    public double getConsumo(int horas){
        return (potencia * horas);
    }

    // Metodo getCosteConsumo
    public double getCosteConsumo(int horas, double costeHora){
        return (costeHora * horas) * getConsumo(horas);
    }

    // getters & setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // toString
    public String toString() {
        return "Unidad4.Electrodomesticos.Electrodomestico: " + "\n" +
                "Tipo: " + tipo + "\n" +
                "Marca: " + marca + "\n" +
                "Potencia: " + potencia + "\n" ;
    }
}
