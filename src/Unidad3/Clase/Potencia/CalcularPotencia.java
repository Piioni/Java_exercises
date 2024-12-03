package Unidad3.Clase.Potencia;

public class CalcularPotencia {

    public static void potencia(int base, int exponente) {
        // assertions para cerciorarnos que los valores de base y exponente estén dentro de los rangos permitidos.
        assert base >= 0 && base <= 10 : "La base debe ser mayor a 0 y menor a 10 incluyente";
        assert exponente >= 0 && exponente <= 20 : "El exponente debe ser mayor a 0 y menor a 20 incluyente";
        int resultado = 1;

        // Primeros 2 casos especiales
        if (exponente == 0 || base == 1) {
            System.out.println("El resultado de la potencia es: 1");
        } else if (base == 0) {
            System.out.println("El resultado de la potencia es: 0");
            // Caso general de potencia
        } else if (base>1 && exponente>0){
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
                // Comprobación para romper el bucle si el resultado supera 1000.
                if (resultado > 1000) {
                    System.out.println("El resultado de la potencia sera mayor a 1000, finalizando el proceso");
                    break;
                }
            }
            // Comprobación de que el bucle no se haya roto para imprimir el resultado.
            if (resultado <= 1000) {
                System.out.println("El resultado de " + base + "^" + exponente + " es igual a: " + resultado);
            }
            // Else final para tirar excepción si el programa se ejecuta sin -ea.
        } else throw new IllegalArgumentException("Los valores de base y exponente no pueden ser negativos");
    }
}
