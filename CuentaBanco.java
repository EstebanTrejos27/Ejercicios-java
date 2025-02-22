/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class CuentaBanco {
    // Variable para almacenar el saldo
    private static double saldo = 123897.4;

    // Función para consultar saldo
    public static double consultaSaldo() {
        return saldo;
    }

    // Función para hacer un retiro
    public static void hacerRetiro(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Has retirado: " + cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    // Función para hacer una consignación
    public static void hacerConsignacion(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Has consignado: " + cantidad);
        } else {
            System.out.println("La cantidad a consignar debe ser positiva.");
        }
    }

    // Método Main
    public static void main(String[] args) {
        String usuario = "Eder Lara T";
        Scanner scanner = new Scanner(System.in); // Scanner inicializado aquí

        while (true) {
            System.out.println("Hola Usuario " + usuario + "\n");
            System.out.println("¿Qué quieres hacer el día de hoy?\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiros");
            System.out.println("3. Hacer Consignación");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            if (opcion == 4) {
                System.out.println("¡Hasta luego!");
                break;
            }

            switch (opcion) {
                case 1:
                    // Consultar saldo
                    System.out.println("Consultando saldo...");
                    System.out.println("Tu saldo actual es: " + consultaSaldo());
                    break;
                case 2:
                    // Hacer un retiro
                    System.out.print("Ingresa la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    hacerRetiro(cantidadRetiro);
                    break;
                case 3:
                    // Hacer una consignación
                    System.out.print("Ingresa la cantidad a consignar: ");
                    double cantidadConsignacion = scanner.nextDouble();
                    hacerConsignacion(cantidadConsignacion);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}
