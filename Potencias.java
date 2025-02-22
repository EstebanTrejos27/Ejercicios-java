import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = scanner.nextDouble();
            
            // Calcular el cubo y la cuarta potencia
            double cubo = Math.pow(numero, 3);
            double cuarta = Math.pow(numero, 4);
            
            // Mostrar los resultados
            System.out.println("El cubo de " + numero + " es: " + cubo);
            System.out.println("La cuarta potencia de " + numero + " es: " + cuarta);
            System.out.println();
        }
        
        scanner.close();
    }
}
