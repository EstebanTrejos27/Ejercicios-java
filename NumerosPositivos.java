import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = scanner.nextDouble();
            
            // Verificar si el número es positivo
            if (numero > 0) {
                System.out.println("Número positivo: " + numero);
            }
        }
        
        scanner.close();
    }
}
