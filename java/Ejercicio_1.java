import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Diccionario de divisas y sus valores en pesos colombianos
        Map<String, Double> divisas = new HashMap<>();
        divisas.put("Euro", 4444.0);
        divisas.put("Dollar", 4422.0);
        divisas.put("Yen", 31.86);
        divisas.put("Libra", 5157.0);
        divisas.put("Franco Suizo", 4811.0);
        divisas.put("Dólar Canadiense", 3271.0);
        divisas.put("Peso Mexicano", 220.0);
        divisas.put("Real Brasileño", 870.0);
        divisas.put("Rublo Ruso", 55.45);
        divisas.put("Yuan Chino", 677.5);

        // Preguntar al usuario por una divisa
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la divisa: ");
        String divisa = scanner.nextLine().trim().toLowerCase();

        // Convertir la primera letra a mayúscula
        divisa = divisa.substring(0, 1).toUpperCase() + divisa.substring(1);

        if (divisas.containsKey(divisa)) {
            System.out.print("Ingrese el valor en " + divisa + ": ");
            double valor = scanner.nextDouble();
            double conversion = valor * divisas.get(divisa);
            System.out.println(valor + " " + divisa + "(s) equivale a " + conversion + " pesos colombianos.");
        } else {
            System.out.println("Divisa no encontrada en el diccionario.");
        }
        
        scanner.close();
    }
}
