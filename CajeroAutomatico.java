import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 5000.0; // Posee S/ 5000
        int opcion;

        do {
            System.out.println("\n--- Menú Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: S/ " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese monto a retirar: S/ ");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo actual: S/ " + saldo);
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese monto a depositar: S/ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Saldo actual: S/ " + saldo);
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4); // El menú se repite hasta que el usuario selecciona salir

        scanner.close();
    }
}