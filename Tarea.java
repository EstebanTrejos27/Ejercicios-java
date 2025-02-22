package main;

// Importamos las clases necesarias:
import java.util.Scanner;

public class Tarea {

    /**
     * @param args
     * @description: Clase principal del programa
     * @author edela
     */

    public static void main(String[] args) {

        // Variables:
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese dos números:
        System.out.println("Introduce un número: ");
        float numero = scanner.nextFloat();

        System.out.println("Introduce otro número: ");
        float operador = scanner.nextFloat();

        // Realizamos las operaciones:
        float suma = numero + operador;
        float resta = numero - operador;
        float multiplicacion = numero * operador;
        double division = numero / operador;

        // Mostramos los resultados:
        System.out.println("La suma de " + numero + " + " + operador + " es: " + suma);
        System.out.println("La resta de " + numero + " - " + operador + " es: " + resta);
        System.out.println("La multiplicación de " + numero + " * " + operador + " es: " + multiplicacion);
        System.out.println("La división de " + numero + " / " + operador + " es: " + division);

        // Condicionales:
        if (numero > operador) {
            System.out.println("El número " + numero + " es mayor que " + operador);
        } else if (numero < operador) {
            System.out.println("El número " + numero + " es menor que " + operador);
        } else {
            System.out.println("Los números son iguales.");
        }

        // Verificación si la suma es mayor que 10:
        if (suma > 10) {
            System.out.println("La suma es mayor que 10");
        } else {
            System.out.println("La suma es menor o igual que 10, en este caso es: " + suma);
        }

        // Cerramos el scanner:
        scanner.close();
    }
}
