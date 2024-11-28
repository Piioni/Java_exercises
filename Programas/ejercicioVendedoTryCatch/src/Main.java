import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Vamos a crear un nuevo vendedor!");
            System.out.println("Dime un nombre");
            String nombre = sc.nextLine();
            System.out.println("Dime un apellido");
            String apellido = sc.nextLine();
            try {
                System.out.println("Dime un edad");
                int edad = sc.nextInt();
                Vendedor v1 = new Vendedor(nombre, apellido);
                v1.verificarEdad(edad);
                v1.imprimir();
            } catch (IllegalArgumentException e) {
                e.getMessage();
                sc.nextLine();

        }
    }
}
