package Unidad4.RangelJuan.PaquetePrincipal;

import Unidad4.RangelJuan.PaqueteSecundario.Camarero;
import Unidad4.RangelJuan.PaqueteSecundario.Persona;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 20);
        p1.imprimir();
        System.out.println("\n");

        Camarero c1 = new Camarero("Pedro", 30, 1000);
        c1.imprimir();
        System.out.println("\n");

        Camarero c2 = new Camarero("Maria", 25, 1500);
        c2.imprimir();
        System.out.println("\n");

        Camarero c3 = new Camarero("Luis", 40, 2000);
        c3.imprimir();
        System.out.println("\n");

        Camarero.numCamareros();

    }
}
