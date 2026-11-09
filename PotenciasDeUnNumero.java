import java.util.Scanner;

public class PotenciasDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        int base = scanner.nextInt();

        System.out.print("Exponente: ");
        int exponente = scanner.nextInt();

        int resultado = 1;
        int contador = 0;

        // Calcula la potencia usando únicamente un ciclo do-while[cite: 3]
        if (exponente >= 0) {
            do {
                if (exponente == 0) {
                    resultado = 1;
                    break;
                }
                
                if (contador > 0) {
                    resultado *= base;
                } else {
                    resultado = base; // Primera multiplicación base ^ 1
                }
                
                contador++;
            } while (contador < exponente);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}