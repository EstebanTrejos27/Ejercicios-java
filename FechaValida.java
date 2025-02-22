import java.util.Scanner;

public class FechaValida {
    
    // Método para comprobar si un año es bisiesto
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Método para comprobar si la fecha es válida
    public static boolean esFechaValida(int dia, int mes, int año) {
        // Verificar que el año sea mayor que 0
        if (año <= 0) {
            return false;
        }
        
        // Verificar que el mes esté entre 1 y 12
        if (mes < 1 || mes > 12) {
            return false;
        }

        // Verificar que el día sea válido dependiendo del mes
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return dia >= 1 && dia <= 31; // Meses con 31 días
            case 4: case 6: case 9: case 11:
                return dia >= 1 && dia <= 30; // Meses con 30 días
            case 2:
                if (esBisiesto(año)) {
                    return dia >= 1 && dia <= 29; // Febrero en año bisiesto
                } else {
                    return dia >= 1 && dia <= 28; // Febrero en año no bisiesto
                }
            default:
                return false; // Mes no válido (aunque esto no debería ocurrir con el control previo de mes)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar fecha al usuario
        System.out.print("Introduce la fecha (dd:mm:aaaa): ");
        String fecha = scanner.nextLine();
        
        // Separar la fecha en día, mes y año
        String[] partes = fecha.split(":");
        if (partes.length != 3) {
            System.out.println("Formato de fecha incorrecto. Debe ser dd:mm:aaaa");
            return;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        // Verificar si la fecha es válida
        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
    }
}
