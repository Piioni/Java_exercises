package Unidad5.RandomAccesFile;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.file.Path;

public class Man {
    private static final Path PATH = Path.of("C:/Java/Directorio_Padre/RandomAcces/productos.dat");

    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Papas", 10, 5.0);
        Producto p2 = new Producto(2, "Coca-Cola", 20, 10.0);
        Producto p3 = new Producto(3, "Pepsi", 30, 15.0);
        Producto p4 = new Producto(4, "Doritos", 40, 20.0);
        Producto p5 = new Producto(5, "Sabritas", 50, 25.0);
        Producto p6 = new Producto(6, "Ruffles", 60, 30.0);
        Producto p7 = new Producto(7, "Cheetos", 70, 35.0);
        Producto p8 = new Producto(8, "Takis", 80, 40.0);
        Producto p9 = new Producto(9, "Churrumais", 90, 45.0);
        Producto p10 = new Producto(10, "Chetos", 100, 50.0);

        try {
            File file = new File(PATH.toString());
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            p1.escribir(raf);
            p2.escribir(raf);
            p3.escribir(raf);
            p4.escribir(raf);
            p5.escribir(raf);



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
