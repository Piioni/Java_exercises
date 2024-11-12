package foc.programas;

public class Main {
    public static void main(String[] args) {

        Planeta Tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742,
                149.6, tipoPlaneta.TERRESTRE, true);

        Planeta Jupiter = new Planeta("Jupiter", 8, 1.898E27, 1.43128E15, 139820,
                778, tipoPlaneta.TERRESTRE, true);

        double densidad_tierra = Tierra.getDensidad();
        System.out.println("La densidad de la tierra es: " + densidad_tierra);
        Tierra.esExterior();
        double densidad_jupiter = Jupiter.getDensidad();
        System.out.println("La densidad de la jupiter es: " + densidad_jupiter);
        Jupiter.esExterior();

    }

}
