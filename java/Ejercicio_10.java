import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_10{
    public static void main(String[] args) {
        Map<String, Map<String, String>> clientes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú de opciones
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Eliminar cliente");
            System.out.println("3. Mostrar cliente");
            System.out.println("4. Listar todos los clientes");
            System.out.println("5. Listar clientes preferentes");
            System.out.println("6. Terminar");
            System.out.print("Ingrese su opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    // Añadir un nuevo cliente
                    System.out.print("Ingrese el NIF del cliente: ");
                    String nif = scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la dirección del cliente: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el correo electrónico del cliente: ");
                    String correo = scanner.nextLine();
                    System.out.print("¿Es un cliente preferente? (sí/no): ");
                    String preferente = scanner.nextLine().equalsIgnoreCase("sí") ? "sí" : "no";

                    Map<String, String> cliente = new HashMap<>();
                    cliente.put("Nombre", nombre);
                    cliente.put("Dirección", direccion);
                    cliente.put("Teléfono", telefono);
                    cliente.put("Correo", correo);
                    cliente.put("Preferente", preferente);

                    clientes.put(nif, cliente);
                    System.out.println("Cliente " + nombre + " añadido con éxito.");
                    break;

                case "2":
                    // Eliminar un cliente existente
                    System.out.print("Ingrese el NIF del cliente a eliminar: ");
                    nif = scanner.nextLine();
                    if (clientes.containsKey(nif)) {
                        clientes.remove(nif);
                        System.out.println("Cliente con NIF " + nif + " eliminado con éxito.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case "3":
                    // Mostrar los datos de un cliente
                    System.out.print("Ingrese el NIF del cliente: ");
                    nif = scanner.nextLine();
                    if (clientes.containsKey(nif)) {
                        System.out.println("Datos del cliente " + nif + ": " + clientes.get(nif));
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case "4":
                    // Listar todos los clientes
                    if (!clientes.isEmpty()) {
                        System.out.println("Lista de todos los clientes:");
                        for (Map.Entry<String, Map<String, String>> entry : clientes.entrySet()) {
                            System.out.println("NIF: " + entry.getKey() + ", Nombre: " + entry.getValue().get("Nombre"));
                        }
                    } else {
                        System.out.println("No hay clientes en la base de datos.");
                    }
                    break;

                case "5":
                    // Listar clientes preferentes
                    boolean hayPreferentes = false;
                    for (Map.Entry<String, Map<String, String>> entry : clientes.entrySet()) {
                        if (entry.getValue().get("Preferente").equals("sí")) {
                            if (!hayPreferentes) {
                                System.out.println("Lista de clientes preferentes:");
                                hayPreferentes = true;
                            }
                            System.out.println("NIF: " + entry.getKey() + ", Nombre: " + entry.getValue().get("Nombre"));
                        }
                    }
                    if (!hayPreferentes) {
                        System.out.println("No hay clientes preferentes en la base de datos.");
                    }
                    break;

                case "6":
                    // Terminar el programa
                    System.out.println("Terminando el programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}
