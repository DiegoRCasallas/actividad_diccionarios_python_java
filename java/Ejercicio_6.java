import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        // Crear un diccionario vacío
        HashMap<String, String> datosPersona = new HashMap<>();

        // Lista de campos a solicitar
        String[] campos = {"Nombre", "Edad", "Sexo", "Teléfono", "Correo electrónico"};

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos y llenar el diccionario
        for (String campo : campos) {
            System.out.print("Ingrese su " + campo + ": ");
            String valor = scanner.nextLine();
            datosPersona.put(campo, valor);
            
            // Mostrar los datos actuales
            System.out.println("Datos actuales: " + datosPersona);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
