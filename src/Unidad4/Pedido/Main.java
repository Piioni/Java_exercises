package Unidad4.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido.calcularPedido("Chuleton", 20, "Cerveza", 2);

        Pedido.calcularPedido("Chuleton", 20, "Cerveza", 2,
                "Ensalada", 5);

        Pedido.calcularPedido("Chuleton", 20, "Cerveza", 2,
                "Ensalada", 5, "Tarta", 3);

        Suma.sumar(1, 2);
        Suma.sumar(1, 2, 3);
        Suma.sumar(1.5, 2.5);
        Suma.sumar(1.5, 2.5, 3.5);
    }
}
