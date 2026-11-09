import java.util.Scanner;

public class ValidacionDeContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordCorrecta = "Java2026";
        String passwordIngresada;

        do {
            System.out.print("Ingrese contraseña: ");
            passwordIngresada = scanner.nextLine();

            if (!passwordIngresada.equals(passwordCorrecta)) {
                System.out.println("Contraseña incorrecta");
            }
        } while (!passwordIngresada.equals(passwordCorrecta)); // Se repite si es incorrecta

        System.out.println("Acceso permitido");
        scanner.close();
    }
}