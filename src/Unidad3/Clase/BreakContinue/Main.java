package Unidad3.Clase.BreakContinue;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<50; i++){
            if (i % 3 ==0){
                System.out.println(i);
                continue;
            } else if (i == 40){
                System.out.println("Se ha detenido la ejecucion por que el numero llego al 40");
                break;
            }
        }
    }
}
