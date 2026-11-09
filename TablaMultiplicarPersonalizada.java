import java.util.Scanner;

public class TablaMultiplicarPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        
        int i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 12); // Se repite del 1 al 12 utilizando un ciclo do-while

        scanner.close();
    }
}