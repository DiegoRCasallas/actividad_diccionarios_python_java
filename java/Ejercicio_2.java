import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        String edad = scanner.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese su teléfono: ");
        String telefono = scanner.nextLine();

        // Almacenar los datos en un mapa
        Map<String, String> datosUsuario = new HashMap<>();
        datosUsuario.put("Nombre", nombre);
        datosUsuario.put("Edad", edad);
        datosUsuario.put("Dirección", direccion);
        datosUsuario.put("Teléfono", telefono);

        // Mostrar el mensaje con la información
        System.out.println(datosUsuario.get("Nombre") + " tiene " + datosUsuario.get("Edad") + 
                           " años, vive en " + datosUsuario.get("Dirección") + 
                           " y su número de teléfono es " + datosUsuario.get("Teléfono") + ".");

        scanner.close();
    }
}
