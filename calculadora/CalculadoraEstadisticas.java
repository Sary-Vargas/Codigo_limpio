package calculadora;
public class CalculadoraEstadisticas {

    public void imprimirEstadisticas(double[] numeros) {
        double media = calcularMedia(numeros);
        double varianza = calcularVarianza(numeros, media);
        double desviacion = Math.sqrt(varianza);

        System.out.println("Media: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación estándar: " + desviacion);
    }

    private double calcularMedia(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    private double calcularVarianza(double[] numeros, double media) {
        double suma = 0;
        for (double numero : numeros) {
            suma += Math.pow(numero - media, 2);
        }
        return suma / numeros.length;
    }
}
