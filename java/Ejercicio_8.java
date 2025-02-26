import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_8{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la lista de palabras y sus traducciones
        System.out.print("Ingrese las palabras en formato 'español:inglés' separadas por comas: ");
        String entrada = scanner.nextLine();
        
        // Crear el diccionario de traducción
        Map<String, String> diccionarioTraduccion = new HashMap<>();
        String[] pares = entrada.split(",");
        
        for (String par : pares) {
            String[] idiomas = par.split(":");
            String espanol = idiomas[0].trim();
            String ingles = idiomas[1].trim();
            diccionarioTraduccion.put(espanol, ingles);
        }
        
        // Solicitar la frase en español para traducir
        System.out.print("Ingrese una frase en español: ");
        String frase = scanner.nextLine();
        
        // Traducir la frase palabra por palabra
        String[] palabras = frase.split(" ");
        StringBuilder fraseTraducida = new StringBuilder();
        
        for (String palabra : palabras) {
            if (diccionarioTraduccion.containsKey(palabra)) {
                fraseTraducida.append(diccionarioTraduccion.get(palabra)).append(" ");
            } else {
                fraseTraducida.append(palabra).append(" ");  // Dejar sin traducir si no está en el diccionario
            }
        }
        
        // Mostrar la frase traducida
        System.out.println("Frase traducida: " + fraseTraducida.toString().trim());
    }
}
