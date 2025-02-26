import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        // Diccionario de meses
        HashMap<String, String> meses = new HashMap<>();
        meses.put("01", "enero");
        meses.put("02", "febrero");
        meses.put("03", "marzo");
        meses.put("04", "abril");
        meses.put("05", "mayo");
        meses.put("06", "junio");
        meses.put("07", "julio");
        meses.put("08", "agosto");
        meses.put("09", "septiembre");
        meses.put("10", "octubre");
        meses.put("11", "noviembre");
        meses.put("12", "diciembre");

        // Solicitar la fecha al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fecha en formato dd/mm/aaaa: ");
        String fecha = scanner.nextLine();
        
        // Separar la fecha en día, mes y año
        String[] partes = fecha.split("/");
        if (partes.length != 3) {
            System.out.println("Formato de fecha incorrecto. Asegúrese de ingresar una fecha en el formato dd/mm/aaaa.");
            return;
        }
        
        String dia = partes[0];
        String mes = partes[1];
        String año = partes[2];

        // Verificar si el mes es válido
        if (meses.containsKey(mes)) {
            // Mostrar la fecha en el nuevo formato
            System.out.println(dia + " de " + meses.get(mes) + " de " + año);
        } else {
            System.out.println("Mes no válido. Asegúrese de ingresar una fecha en el formato correcto.");
        }
    }
}
