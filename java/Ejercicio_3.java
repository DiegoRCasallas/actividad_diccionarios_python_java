import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_3{
    public static void main(String[] args) {
        // Diccionario de precios de repuestos
        Map<String, Double> preciosRepuestos = new HashMap<>();
        preciosRepuestos.put("Bujia", 1.40);
        preciosRepuestos.put("Pastillas de freno", 5.80);
        preciosRepuestos.put("Radiador", 300.50);
        preciosRepuestos.put("Rodamiento", 10.70);

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre del repuesto
        System.out.print("Ingrese el nombre del repuesto: ");
        String repuesto = scanner.nextLine().trim().toLowerCase();

        // Convertir la primera letra a mayúscula
        repuesto = repuesto.substring(0, 1).toUpperCase() + repuesto.substring(1);

        // Verificar si el repuesto está en el diccionario
        if (preciosRepuestos.containsKey(repuesto)) {
            System.out.print("Ingrese la cantidad requerida: ");
            int cantidad = scanner.nextInt();
            double precioTotal = preciosRepuestos.get(repuesto) * cantidad;
            System.out.printf("El precio total de %d %s(s) es %.2f pesos.%n", cantidad, repuesto, precioTotal);
        } else {
            System.out.println("El repuesto no se encuentra en el inventario.");
        }

        scanner.close();
    }
}
