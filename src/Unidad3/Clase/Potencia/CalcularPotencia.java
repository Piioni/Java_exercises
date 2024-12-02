package Unidad3.Clase.Potencia;

public class CalcularPotencia {

    public static void potencia(int base, int exponente) {
        assert base < 0 || base > 10 : "La base debe ser mayor a 0 y menor a 20 inlcuyente";
        assert exponente < 0 || exponente > 10 : "El exponente debe ser mayor a 0 y menor a 20 inlcuyente";
        int resultado = 1;
        if (exponente == 0 || base == 1) {
            System.out.println("El resultado de la potencia es: 1");
        } else if (base == 0) {
            System.out.println("El resultado de la potencia es: 0");
        } else if (exponente > 0 && base > 1) {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
                if (resultado > 1000) {
                    System.out.println("El resultado de la potencia sera mayor a 1000, finalizando el proceso");
                    break;
                }
            }
            if (resultado <= 1000) {
                System.out.println("El resultado de " + base + "^" + exponente + " es igual a: " + resultado);
            }
        }
    }
}
