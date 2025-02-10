package Unidad6.GenericsTests;

public class Main {
    public static void main(String[] args) {

        Tripleta<String, Integer, Double> t1 = new Tripleta<>("Hola", 5, 3.14);
        t1.imprimir();

        Tripleta2<String> t2 = new Tripleta2<>("Hola", "Mundo", "Java");
        t2.imprimir();


    }
}
