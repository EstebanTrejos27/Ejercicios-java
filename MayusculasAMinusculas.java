import java.util.Scanner;

public class MayusculasAMinusculas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un texto
        System.out.println("Introduce una cadena de texto:");
        String texto = scanner.nextLine();

        // Transformar el texto a minúsculas
        String textoMinusculas = texto.toLowerCase();

        // Mostrar el texto transformado
        System.out.println("El texto en minúsculas es:");
        System.out.println(textoMinusculas);

        // Cerrar el Scanner
        scanner.close();
    }
}
