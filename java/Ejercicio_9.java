import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Map<String, Double> facturas = new HashMap<>();
        double cantidadCobrada = 0;
        double cantidadPendiente = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Añadir nueva factura");
            System.out.println("2. Pagar una factura");
            System.out.println("3. Terminar");
            System.out.print("Ingrese su opción: ");
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                // Añadir una nueva factura
                System.out.print("Ingrese el número de la factura: ");
                String numeroFactura = scanner.nextLine();
                System.out.print("Ingrese el coste de la factura: ");
                double coste = Double.parseDouble(scanner.nextLine());
                facturas.put(numeroFactura, coste);
                cantidadPendiente += coste;
                System.out.printf("Factura %s añadida con un coste de %.2f.%n", numeroFactura, coste);
            } else if (opcion.equals("2")) {
                // Pagar una factura existente
                System.out.print("Ingrese el número de la factura a pagar: ");
                String numeroFactura = scanner.nextLine();
                if (facturas.containsKey(numeroFactura)) {
                    double coste = facturas.remove(numeroFactura);
                    cantidadCobrada += coste;
                    cantidadPendiente -= coste;
                    System.out.printf("Factura %s pagada con un coste de %.2f.%n", numeroFactura, coste);
                } else {
                    System.out.printf("La factura %s no existe.%n", numeroFactura);
                }
            } else if (opcion.equals("3")) {
                // Terminar el programa
                System.out.println("Terminando el programa.");
                break;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }

            // Mostrar las cantidades cobradas y pendientes
            System.out.printf("Cantidad cobrada hasta el momento: %.2f%n", cantidadCobrada);
            System.out.printf("Cantidad pendiente de cobro: %.2f%n", cantidadPendiente);
        }

        scanner.close();
    }
}
