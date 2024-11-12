package foc.programas;

public class Automovil {
    private String marca;
    private String modelo;
    private String motor;
    private combustibles tipo_combustible;
    private tipoAutomovil tipo_automovil;
    private int numero_puertas;
    private int cantidad_asientos;
    private double velocidad_maxima;
    private color color;
    private double velocidad_actual;

    // Constructor
    public Automovil(String marca, String modelo, String motor, combustibles tipo_combustible, tipoAutomovil tipo_automovil,
                     int numero_puertas, int cantidad_asientos, double velocidad_maxima, color color,
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

    public void setTipo_combustible(combustibles tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public void setTipo_automovil(tipoAutomovil tipo_automovil) {
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

    public void setColor(color color) {
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

    public combustibles getTipo_combustible() {
        return tipo_combustible;
    }

    public tipoAutomovil getTipo_automovil() {
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

    public color getColor() {
        return color;
    }

    public double getVelocidad_actual() {
        return velocidad_actual;
    }


    // methods de conduction
    public void acelerar(double velocidad) {
        if ((velocidad_actual + velocidad) <= velocidad_maxima) {
            velocidad_actual += velocidad;
            System.out.println("Velocidad aumentada en: " + velocidad + " ,La velocidad actual es: " + velocidad_actual);
        } else {
            velocidad_actual = velocidad_maxima;
            System.out.println("No puedes acelerar mas de la velocidad maxima, velocidad actual es: " + velocidad_maxima);
        }
    }

    public void desacelerar(double velocidad) {
        if ((velocidad_actual - velocidad) > 0) {
            velocidad_actual -= velocidad;
            System.out.println("Velocidad reducida en: " + velocidad + " ,La velocidad actual es: " + velocidad_actual);
        } else {
            velocidad_actual = 0;
            System.out.println("No puedes desacelerar a una velocidad negativa, velocidad actual es: " + velocidad_actual);
        }
    }

    public void frenar() {
        velocidad_actual = 0;
        System.out.println("El coche ha frenado");
    }


    // metodo para calcular tiempo estimado de llegada según velocidad
    public void tiempoLlegada(double distancia) {
        if (velocidad_actual > 0){
            System.out.println("El tiempo estimado es: "+ distancia / velocidad_actual + " Horas" );
        }
        else System.out.println("El coche no se esta moviendo");
    }


    //Metodo mostrar
    public void mostrar() {
        System.out.println("Especificaciones del Automovil: " + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Motor: " + motor + "\n" +
                "Tipo de combustible: " + tipo_combustible + "\n" +
                "Tipo de automovil: " + tipo_automovil + "\n" +
                "Numero de puertas: " + numero_puertas + "\n" +
                "Cantidad asientos: " + cantidad_asientos + "\n" +
                "Velocidad maxima: " + velocidad_maxima + "\n" +
                "Color: " + color + "\n" +
                "Velocidad_actual: " + velocidad_actual);
    }


}
