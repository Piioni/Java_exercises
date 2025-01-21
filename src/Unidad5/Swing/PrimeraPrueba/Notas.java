package Unidad5.Swing.PrimeraPrueba;

public class Notas {
    double[] listaNotas;

    public Notas() {
        listaNotas = new double[5]; // Crea un array de 5 notas
    }

    double calcularPromedio() {
        double suma = 0;
        for (double listaNota : listaNotas) { // Se recorre el array
            suma = suma + listaNota; // Suma las notas del array
        }
        // Obtiene el promedio como la división de la suma de notas sobre el total de notas
        return (suma / listaNotas.length);
    }

    double calcularDesviacion() {
        double prom = calcularPromedio();
        /* Invoca el método para calcular el promedio */
        double suma = 0;
        for (double listaNota : listaNotas) {
            // Aplica fórmula para la sumatoria de elementos
            suma += Math.pow(listaNota - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.length);
        /* Retorna el cálculo final de la desviación */
    }

    double calcularMenor() {
        double menor = listaNotas[0];
        /* Define una variable como la nota menor */
        for (double listaNota : listaNotas) { // Se recorre el array
            if (listaNota < menor) {
                /* Si un elemento del array es menor que el menor actual,
                   se actualiza su valor */
                menor = listaNota;
            }
        }
        return menor;
    }

    double calcularMayor() {
        double mayor = listaNotas[0];
        /* Define una variable como la nota mayor */
        for (double listaNota : listaNotas) { // Se recorre el array
            if (listaNota > mayor) {
                /* Si un elemento del array es mayor que el mayor actual,
                   se actualiza su valor */
                mayor = listaNota;
            }
        }
        return mayor;
    }
}
