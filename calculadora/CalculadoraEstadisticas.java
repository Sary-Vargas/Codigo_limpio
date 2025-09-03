package calculadora;
public class CalculadoraEstadisticas {

    // Método principal para imprimir estadísticas
    public void imprimirEstadisticas(double[] numeros) {
        double media = calcularMedia(numeros);
        double varianza = calcularVarianza(numeros, media);
        double desviacion = Math.sqrt(varianza);

        System.out.println("Media: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación estándar: " + desviacion);
    }

    // Calcula la media
    private double calcularMedia(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    // Calcula la varianza
    private double calcularVarianza(double[] numeros, double media) {
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return sumaCuadrados / numeros.length;
    }
}
