package Unidad3.Clase.Automovil.clases;

import Unidad3.Clase.Automovil.enums.color;
import Unidad3.Clase.Automovil.enums.combustibles;
import Unidad3.Clase.Automovil.enums.tipoAutomovil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Automovil automovil1 = new Automovil("Toyota", "17/08/2004", "4000kws"
                , combustibles.Gasolina, tipoAutomovil.Todo_terreno, 4, 4,
                190, color.Rojo, 70);

        automovil1.mostrar();


    }
}