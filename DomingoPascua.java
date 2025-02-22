import java.util.Scanner;

public class DomingoPascua {

    // Función que calcula el valor de N para determinar el día del domingo de Pascua
    public static int calcularDomingoPascua(int año) {
        int A = año % 19;
        int B = año % 4;
        int C = año % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = (22 + D + E);
        return N;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el año
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();
        
        // Calcular el día del domingo de Pascua
        int N = calcularDomingoPascua(año);
        
        // Determinar el mes y el día del domingo de Pascua
        int dia;
        String mes;
        
        if (N <= 31) {
            // Domingo de Pascua cae en marzo
            dia = N;
            mes = "marzo";
        } else {
            // Domingo de Pascua cae en abril
            dia = N - 31;
            mes = "abril";
        }
        
        // Mostrar el resultado
        System.out.println("El domingo de Pascua en el año " + año + " será el " + dia + " de " + mes + ".");
        
        scanner.close();
    }
}
