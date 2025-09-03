package calculadora;

public class AppEstadisticas {
    public static void main(String[] args) {
        double[] datos = {10, 20, 30, 40, 50};
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        calculadora.imprimirEstadisticas(datos);
    }
}
