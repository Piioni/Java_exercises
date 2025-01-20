package Unidad5.Ficheros.Inmobiliaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Inmobiliaria inmobiliaria = new Inmobiliaria();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            showUsage();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la ciudad:");
                    String ciudad = sc.nextLine();
                    System.out.println("Introduce la direccion:");
                    String direccion = sc.nextLine();
                    System.out.println("Introduce el tipo: (1/2)");
                    showTipo();
                    try {
                        String tipo = sc.nextInt() == 1 ? "ARRIENDO" : "VENTA";
                        inmobiliaria.agregarInmueble(ciudad, direccion, Tipo.valueOf(tipo));
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Introduce el id del inmueble a eliminar:");
                    try {
                        int id = sc.nextInt();
                        inmobiliaria.eliminarInmueble(id);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Introduce el id del inmueble a editar:");
                    try {
                        int id = sc.nextInt();
                        Inmueble inmueble = inmobiliaria.buscarInmueble(id);
                        if (inmueble != null) {
                            System.out.println("Introduce la ciudad:");
                            inmueble.setCiudad(sc.nextLine());
                            System.out.println("Introduce la direccion:");
                            inmueble.setDireccion(sc.nextLine());
                            System.out.println("Introduce el tipo: (1/2)");
                            showTipo();
                            String tipo = sc.nextInt() == 1 ? "ARRIENDO" : "VENTA";
                            inmueble.setTipo(Tipo.valueOf(tipo));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    inmobiliaria.imprimirInmuebles();
                    break;
            }


        }
    }

    public static void showUsage() {
        System.out.println("1. Agregar inmueble");
        System.out.println("2. Eliminar inmueble");
        System.out.println("3. Editar inmuebles");
        System.out.println("4. Imprimir inmuebles");
        System.out.println("0. Salir");
    }

    public static void showTipo() {
        System.out.println("Tipo: ");
        System.out.println("1. Arrinedo");
        System.out.println("2. Venta");
    }
}
