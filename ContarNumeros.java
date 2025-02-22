import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar contadores
        int positivos = 0;
        int negativos = 0;
        int neutros = 0;
        
        // Leer 20 números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = scanner.nextDouble();
            
            // Verificar si el número es positivo, negativo o neutro
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }
        
        // Imprimir los resultados
        System.out.println("\nCantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números neutros (cero): " + neutros);
        
        scanner.close();
    }
}
