import java.util.Scanner;

public class PromedioDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double sumaTotal = 0;
        int cantidadNotas = 0;
        char continuar;

        do {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();

            sumaTotal += nota;
            cantidadNotas++;

            System.out.print("¿Continuar? (S/N): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        // Evitar división entre cero por seguridad
        double promedio = (cantidadNotas > 0) ? (sumaTotal / cantidadNotas) : 0;

        System.out.println("\n--- Resultados Finales ---");
        System.out.println("Cantidad de notas: " + cantidadNotas);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}