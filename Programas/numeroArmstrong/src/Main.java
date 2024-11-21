public class Main {
    public static void main(String[] args) {

        for(int i = 0; i<10000; i++) {
            if(getSumatoria(i))
                System.out.println(i);
        }
    }

    private static boolean getSumatoria(int numero ) {
        int sumatoria = 0;
        String numeroString = (String.valueOf(numero));
        for (int i = 0; i < numeroString.length(); i++){
            int j = Integer.parseInt(numeroString.charAt(i)+"");
            int aSumar = (int) Math.pow(j , numeroString.length());
            sumatoria += aSumar;
        }
        return (sumatoria == numero);
    }
}
