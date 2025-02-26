import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_7{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> cestaCompra = new HashMap<>();
        
        // Ciclo para añadir artículos a la cesta
        while (true) {
            System.out.print("Ingrese el nombre del artículo (o 'terminar' para finalizar): ");
            String articulo = scanner.nextLine().toLowerCase();
            if (articulo.equals("terminar")) {
                break;
            }
            System.out.print("Ingrese el precio de " + articulo + ": ");
            double precio = Double.parseDouble(scanner.nextLine());
            cestaCompra.put(articulo, precio);
        }
        
        // Mostrar la lista de la compra y calcular el coste total
        System.out.println("\nLista de la compra:");
        double costeTotal = 0;
        for (Map.Entry<String, Double> entry : cestaCompra.entrySet()) {
            String articulo = entry.getKey();
            double precio = entry.getValue();
            System.out.printf("%s: %.2f%n", articulo, precio);
            costeTotal += precio;
        }
        
        System.out.printf("\nTotal Coste: %.2f%n", costeTotal);
    }
}
