package Unidad3.Clase.Superherores;

public class Figura {
    private String codigo;
    private double precio;
    Superheroe superheroe;
    Dimension dimensiones;

    // Constructor
    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    // Metodo para subir el precio
    public void subirPrecio(double precio) {
        this.precio += precio;
    }

    // Getters & Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    // ToString
    public String toString() {
        return "Figura: " + '\n' +
                "Codigo: " + codigo + '\n' +
                "Precio: " + precio + '\n' +
                "Superhero: " + superheroe + '\n' +
                "Dimensiones: " + dimensiones ;
    }
}
