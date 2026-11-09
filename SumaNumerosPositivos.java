import java.util.Scanner;

public class SumaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese número: ");
            numero = scanner.nextInt();

            // Si el número es positivo, se acumula en la suma
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0); // El ciclo se repite mientras no se ingrese un número negativo

        System.out.println("Suma total: " + suma);
        scanner.close();
    }
}