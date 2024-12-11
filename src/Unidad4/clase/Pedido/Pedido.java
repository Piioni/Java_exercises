package Unidad4.clase.Pedido;
public class Pedido {

    public static double calcularPedido(String primer_plato, double precio_primer, String bebida, double precio_bebida) {
        double total = precio_primer + precio_bebida;
        System.out.println("El coste de "+ primer_plato + " y la " + bebida + " es igual a: " + total);
        return total;
    }
    public static double calcularPedido(String primer_plato, double precio_primer, String bebida, double precio_bebida,
                                        String segundo_plato, double precio_segundo) {
        double total = precio_primer + precio_segundo + precio_bebida;
        System.out.println("El coste de "+ primer_plato + " + " + bebida + " + " + segundo_plato + " es igual a: " + total);
        return total;
    }
    public static double calcularPedido(String primer_plato, double precio_primer, String bebida, double precio_bebida,
                                        String segundo_plato, double precio_segundo, String postre, double precio_postre) {
        double total = precio_primer + precio_segundo + precio_postre + precio_bebida;
        System.out.println("El coste de "+ primer_plato + " + " + bebida + " + " + segundo_plato +
                " + " + postre + " es igual a: " + total);
        return total;
    }
}
