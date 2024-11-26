public class Main {
    public static void main(String[] args) {
        int numero = 14525;
        int numero_digitos= 0;
        for (int i = 10; numero % i != 0 ; i+=10 ){
                numero_digitos++;

        }
        System.out.println(numero_digitos);
    }
}
