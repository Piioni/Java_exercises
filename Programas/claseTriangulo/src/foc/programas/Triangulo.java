package foc.programas;

public class Triangulo {
    private final int catetoA;
    private final int catetoB;
    private final int angulo;
    private double catetoC;
    private double perimetro;
    private double area;

    // Constructor con parameters
    public Triangulo(int base, int altura, int angulo) {
        this.catetoA = base;
        this.catetoB = altura;
        this.angulo = angulo;
        this.catetoC = calcularCatetoC();
    }

    // Metodo para calcular el cateto c y asignar su valor en el objeto
    public double calcularCatetoC() {
        double radianes = angulo * Math.PI / 180;
        double catetoC = Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoB, 2) - 2 * catetoA * catetoB * Math.cos(radianes)));
        this.catetoC = Math.ceil(catetoC);
        System.out.println("El cateto C del trinagulo es: " + catetoC);
        return catetoC;
    }

    // Metodo para mostrar por pantalla que tipo de triángulo soy
    public void queSoy() {
        if (angulo == 90) {
            if (catetoA == catetoB) {
                System.out.println("Soy un triangulo Rectangulo isosceles!");
            } else System.out.println("Soy un triangulo Rectangulo escaleno!");
        } else {
            if (catetoA == catetoB && catetoB == catetoC) {
                System.out.println("Soy un triangulo equilatero!");
            } else if (catetoA == catetoB || catetoB == catetoC) {
                System.out.println("Soy un triangulo isosceles");
            } else System.out.println("Soy un triangulo escaleno!");
        }
    }

    // Metodo para calcular el perímetro
    public double getPerimetro() {
        double perimetro = catetoA + catetoB + catetoC;
        System.out.println("El perimetro del triangulo es: " + perimetro);
        this.perimetro= perimetro;
        return perimetro;
    }

    // Metodo para calcular el área
    public double getArea() {
        if (angulo == 90) {
            double area = (double) (catetoA * catetoB) / 2;
            System.out.println("El area del triangulo es: " + area);
            this.area = area;
            return area;
        } else {
            // Angulo que se forma al partir el triangulo por la altura
            double radianes_triangulo_provisional = (180 - 90 - angulo) * Math.PI / 180;
            double cateto_provisional = catetoA * Math.sin(radianes_triangulo_provisional);
            double altura = Math.sqrt(Math.pow(catetoA, 2) - Math.pow(cateto_provisional, 2));
            double area = (double) 1 / 2 * catetoB * altura;
            System.out.println("El area del triangulo es: " + area);
            this.area = area;
            return area;
        }
    }

}