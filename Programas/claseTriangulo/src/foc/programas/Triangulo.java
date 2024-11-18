package foc.programas;

public class Triangulo {
    private double base = 0;
    private double altura = 0;

    public Triangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            System.out.println("Error en los datos, introduzcalos nuevamente");
            this.base = 0;
            this.altura = 0;
        } else {
            this.base = base;
            this.altura = altura;
        }
    }

    public double hipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public void queSoy() {
        if (base == altura) {
            System.out.println("Soy un triangulo isosceles");
        } else if (base != altura) {
            System.out.println("Soy un triangulo escaleno");
        } else System.out.println("No soy un triangulo rectangulo, Soy equilatero");
    }

    // Getters and setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
