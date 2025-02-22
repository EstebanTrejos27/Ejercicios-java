import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables
        int numeroDeCalificaciones = 7;
        double sumaCalificaciones = 0;
        double calificacion;

        // Leer las 7 calificaciones del alumno
        for (int i = 1; i <= numeroDeCalificaciones; i++) {
            System.out.print("Introduce la calificación " + i + " de la materia de Cálculo: ");
            calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion;
        }

        // Calcular el promedio
        double promedio = sumaCalificaciones / numeroDeCalificaciones;

        // Mostrar el resultado
        System.out.println("El promedio de las calificaciones es: " + promedio);

        // Cerrar el Scanner
        scanner.close();
    }
}
