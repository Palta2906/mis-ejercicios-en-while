import java.util.Scanner;

public class MenuConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Conversión de Temperaturas ---");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese temperatura en Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9.0 / 5.0) + 32; // Fórmula: F = (C * 9/5) + 32
                    System.out.println("Resultado: " + celsius + " °C equivalen a " + fahrenheit + " °F");
                    break;
                case 2:
                    System.out.print("Ingrese temperatura en Fahrenheit: ");
                    double fahr = scanner.nextDouble();
                    double cels = (fahr - 32) * 5.0 / 9.0; // Fórmula: C = (F - 32) * 5/9
                    System.out.println("Resultado: " + fahr + " °F equivalen a " + cels + " °C");
                    break;
                case 3:
                    System.out.println("Saliendo del programa de conversión...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3); // El programa se repite hasta que el usuario elija salir[cite: 4]

        scanner.close();
    }
}