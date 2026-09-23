package simulador;
import java.util.Random;

public class SimuladorTemperatura {
    static String[] opciones = {"BiblioTec", "LibroYa", "PrestaLibro", "LectoGo", "PaginaLibre", "NubeDeTinta"};
    static double[] puntajes = {3.0, 2.5, 2.0, 1.0, 0.5, 0.1};

    public static void main(String[] args) {
        double temperatura = args.length > 0 ? Double.parseDouble(args[0]) : 1.0;
        double[] prob = calcularProbabilidades(temperatura);

        System.out.println("Temperatura: " + temperatura);
        System.out.println("----------------------------------------");
        for (int i = 0; i < opciones.length; i++) {
            // Corrección 1: Asegurar que las barras nunca sean negativas para evitar errores en .repeat()
            int barras = (int) Math.round(prob[i] * 40);
            barras = Math.max(0, barras); 
            System.out.printf("%-12s %5.1f%% %s%n", opciones[i], prob[i] * 100, "#".repeat(barras));
        }
        System.out.println("----------------------------------------");
        System.out.print("5 intentos: ");
        Random azar = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.print(elegir(prob, azar) + (i < 4 ? ", " : "\n"));
        }
    }

    static double[] calcularProbabilidades(double t) {
        double[] prob = new double[puntajes.length];
        
        // Si la temperatura es cero o un valor negativo absurdo, asignamos 100% al mayor
        if (t <= 0.0001) { 
            prob[0] = 1.0;
            return prob;
        }

        // Corrección 2: Encontrar el puntaje máximo para estabilización numérica (evita Infinity)
        double maxPuntaje = puntajes[0];
        for (double p : puntajes) {
            if (p > maxPuntaje) maxPuntaje = p;
        }

        double suma = 0;
        for (int i = 0; i < puntajes.length; i++) {
            // Restamos el maxPuntaje para que el exponente máximo sea 0 (Math.exp(0) = 1)
            // Esto previene matemáticamente el desbordamiento a Infinity
            prob[i] = Math.exp((puntajes[i] - maxPuntaje) / t);
            suma += prob[i];
        }

        for (int i = 0; i < prob.length; i++) {
            prob[i] = prob[i] / suma;
        }
        return prob;
    }

    static String elegir(double[] prob, Random azar) {
        double r = azar.nextDouble();
        double acumulado = 0;
        for (int i = 0; i < prob.length; i++) {
            acumulado += prob[i];
            if (r < acumulado) {
                return opciones[i];
            }
        }
        return opciones[opciones.length - 1];
    }
}
