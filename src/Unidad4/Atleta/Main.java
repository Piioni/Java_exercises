package Unidad4.Atleta;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Alejandro perlaza", 9.55);
        Atleta atleta2 = new Atleta("Anthony zambrano", 9.28);
        Atleta atleta3 = new Atleta("Diego Palomenque", 9.53);
        Atleta atleta4 = new Atleta("Gilmar Herrera", 9.29);

        atleta1.imprimirAtleta();
        atleta2.imprimirAtleta();
        atleta3.imprimirAtleta();
        atleta4.imprimirAtleta();

        atleta1.correr400Metros();
        atleta2.correr400Metros();
        atleta3.correr400Metros();
        atleta4.correr400Metros();

        Atleta.imprimirSeleccion();
        Atleta.imprimirTiempoEquipo();
    }
}
