import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;

        do {
            System.out.print("Ingrese número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (numero != 0); // Solicita números hasta que ingrese cero[cite: 3]

        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);

        scanner.close();
    }
}