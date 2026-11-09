import java.util.Scanner;

public class SistemaDeVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double montoTotalVendido = 0;
        int cantidadTotalProductos = 0;
        int cantidadTransacciones = 0;
        String continuar;

        do {
            System.out.println("\n--- Registro de Producto ---");
            
            // Consumir cualquier salto de línea pendiente si lo hubiera
            scanner.nextLine(); 

            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();

            double subtotal = precio * cantidad;
            montoTotalVendido += subtotal;
            cantidadTotalProductos += cantidad;
            cantidadTransacciones++;

            System.out.print("¿Desea seguir registrando ventas? (S/N): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("S")); // Valida tanto 'S' como 's' sin errores

        double promedioVenta = (cantidadTransacciones > 0) ? (montoTotalVendido / cantidadTransacciones) : 0;

        System.out.println("\n--- Resumen de Ventas ---");
        System.out.println("Monto total vendido: " + montoTotalVendido);
        System.out.println("Cantidad total de productos vendidos: " + cantidadTotalProductos);
        System.out.println("Promedio de venta por producto: " + promedioVenta);

        scanner.close();
    }
}