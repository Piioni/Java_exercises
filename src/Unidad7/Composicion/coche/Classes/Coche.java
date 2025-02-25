package Unidad7.Composicion.coche.Classes;

import Unidad7.Composicion.coche.Enums.tipoCarroceria;
import Unidad7.Composicion.coche.Enums.tipoChasis;

public class Coche {
    private Motor motor;
    private Llanta llantas;
    private Carroceria carroceria;
    private Chasis chasis;

    public Coche(double volumen, String marcaLlantas, int diametroRin, int altura, int anchura, String colorCarroceria,
                 tipoCarroceria claseCarroceria, tipoChasis claseChasis) {
        this.motor = new Motor(volumen);
        this.llantas = new Llanta(marcaLlantas, diametroRin, altura, anchura);
        this.carroceria = new Carroceria(colorCarroceria, claseCarroceria);
        this.chasis = new Chasis(claseChasis);
    }

}
