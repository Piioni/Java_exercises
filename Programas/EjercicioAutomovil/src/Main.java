public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Automovil automovil1 = new Automovil("Toyota", "17/08/2004", "4000kws"
                , "diesel", "Todo terreno", 4, 4,
                190, "Rojo", 70);

        String caracteristicas = automovil1.mostrar();
        System.out.println(caracteristicas);
    }
}