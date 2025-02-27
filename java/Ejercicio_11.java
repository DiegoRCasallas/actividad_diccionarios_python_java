import java.util.HashMap;
import java.util.Map;

public class Ejercicio_11 {
    public static void main(String[] args) {
        // Cadena de texto de ejemplo
        String directorio = "cedula;nombre;email;telefono;descuento\n1001234567;Luis González;luisgonzalez@mail.com;656343576;12.5\n1007654321;Ana López;analopez@mail.com;612345678;10.0";

        // Separar la cadena en líneas
        String[] lineas = directorio.split("\n");

        // La primera línea contiene los nombres de los campos
        String[] campos = lineas[0].split(";");

        // Crear un diccionario para almacenar la información de los clientes
        Map<String, Map<String, String>> clientes = new HashMap<>();

        // Procesar cada línea (excepto la primera)
        for (int i = 1; i < lineas.length; i++) {
            String[] datos = lineas[i].split(";");
            String cedula = datos[0];
            
            // Crear un diccionario para el cliente actual
            Map<String, String> infoCliente = new HashMap<>();
            for (int j = 0; j < campos.length; j++) {
                infoCliente.put(campos[j], datos[j]);
            }

            // Añadir el cliente al diccionario principal
            clientes.put(cedula, infoCliente);
        }

        // Mostrar el diccionario resultante
        System.out.println("Diccionario de clientes:");
        for (Map.Entry<String, Map<String, String>> cliente : clientes.entrySet()) {
            System.out.println("Cédula: " + cliente.getKey() + " Info: " + cliente.getValue());
        }
    }
}
