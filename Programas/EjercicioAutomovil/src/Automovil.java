public class Automovil {
    private String marca;
    private String modelo;
    private String motor;
    private String tipo_combustible;
    private String tipo_automovil;
    private int numero_puertas;
    private int cantidad_asientos;
    private double velocidad_maxima;
    private String color;
    private double velocidad_actual;

    // Constructor
    public Automovil(String marca, String modelo, String motor, String tipo_combustible, String tipo_automovil,
                     int numero_puertas, int cantidad_asientos, double velocidad_maxima, String color,
                     double velocidad_actual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipo_combustible = tipo_combustible;
        this.tipo_automovil = tipo_automovil;
        this.numero_puertas = numero_puertas;
        this.cantidad_asientos = cantidad_asientos;
        this.velocidad_maxima = velocidad_maxima;
        this.color = color;
        this.velocidad_actual = velocidad_actual;
    }

    // methods Setter
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }
    public void setTipo_automovil(String tipo_automovil) {
        this.tipo_automovil = tipo_automovil;
    }
    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }
    public void setCantidad_asientos(int cantidad_asientos) {
        this.cantidad_asientos = cantidad_asientos;
    }
    public void setVelocidad_maxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setVelocidad_actual(double velocidad_actual) {
        this.velocidad_actual = velocidad_actual;
    }

    // methods getter
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMotor() {
        return motor;
    }
    public String getTipo_combustible() {
        return tipo_combustible;
    }
    public String getTipo_automovil() {
        return tipo_automovil;
    }
    public int getNumero_puertas() {
        return numero_puertas;
    }
    public int getCantidad_asientos() {
        return cantidad_asientos;
    }
    public double getVelocidad_maxima() {
        return velocidad_maxima;
    }
    public String getColor() {
        return color;
    }
    public double getVelocidad_actual() {
        return velocidad_actual;
    }

    // methods de conduction
    public void acelerar(double velocidad){
        if (velocidad_actual + velocidad <= velocidad_maxima){
            velocidad_actual += velocidad;
        }
        else {
            System.out.println("No puedes acelerar mas de la velocidad maxima");
        }
    }
    public void desacelerar(double velocidad){
        if (velocidad_actual - velocidad > 0) {
            velocidad_actual -= velocidad;
        }
        else {
            System.out.println("No puedes desacelerar a una velocidad negativa");
        }
    }
    public void frenar(){
        velocidad_actual = 0;
    }

    // metodo para calcular tiempo estimado de llegada segun velocidad
    public double tiempoLlegada(double distancia){
        return distancia/velocidad_actual;
    }

    //Metodo mostrar
    public String mostrar() {
        return "Automovil " + "\n" +
                "marca= " + marca + "\n" +
                "modelo= " + modelo + "\n" +
                "motor= " + motor + "\n" +
                "tipo_combustible= " + tipo_combustible + "\n" +
                "tipo_automovil= " + tipo_automovil + "\n" +
                "numero_puertas= " + numero_puertas + "\n" +
                "cantidad_asientos= " + cantidad_asientos + "\n" +
                "velocidad_maxima= " + velocidad_maxima + "\n" +
                "color= " + color + "\n" +
                "velocidad_actual= " + velocidad_actual
                ;
    }


}
