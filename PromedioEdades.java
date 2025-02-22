import java.util.Scanner;

public class PromedioEdades {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables
        int numeroDeAlumnos = 100;
        int sumaEdades = 0;
        int edad;

        // Leer las edades de los 100 alumnos
        for (int i = 1; i <= numeroDeAlumnos; i++) {
            System.out.print("Introduce la edad del alumno " + i + ": ");
            edad = scanner.nextInt();
            sumaEdades += edad;
        }

        // Calcular el promedio
        double promedio = (double) sumaEdades / numeroDeAlumnos;

        // Mostrar el resultado
        System.out.println("El promedio de las edades es: " + promedio);

        // Cerrar el Scanner
        scanner.close();
    }
}
