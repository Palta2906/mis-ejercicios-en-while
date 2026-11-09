import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 25; // Número secreto definido por ejemplo[cite: 4]
        int intento;
        int intentosRealizados = 0;

        do {
            System.out.print("Adivine el número secreto: ");
            intento = scanner.nextInt();
            intentosRealizados++;

            if (intento > numeroSecreto) {
                System.out.println("Muy alto"); //[cite: 4]
            } else if (intento < numeroSecreto) {
                System.out.println("Muy bajo"); //[cite: 4]
            } else {
                System.out.println("¡Correcto!"); //[cite: 4]
                System.out.println("Intentos realizados: " + intentosRealizados); //[cite: 4]
            }
        } while (intento != numeroSecreto); // Se repite mientras no acierte[cite: 4]

        scanner.close();
    }
}