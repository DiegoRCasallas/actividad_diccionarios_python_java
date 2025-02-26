import java.util.HashMap;
import java.util.Map;

public class Ejercicio_5 {
    public static void main(String[] args) {
        // Diccionario con los créditos de las asignaturas
        HashMap<String, Integer> creditosCurso = new HashMap<>();
        creditosCurso.put("Matemáticas", 6);
        creditosCurso.put("Física", 4);
        creditosCurso.put("Química", 5);

        // Mostrar los créditos de cada asignatura
        for (Map.Entry<String, Integer> entry : creditosCurso.entrySet()) {
            String asignatura = entry.getKey();
            int creditos = entry.getValue();
            System.out.println(asignatura + " tiene " + creditos + " créditos.");
        }

        // Calcular y mostrar el total de créditos
        int totalCreditos = 0;
        for (int creditos : creditosCurso.values()) {
            totalCreditos += creditos;
        }
        System.out.println("El total de créditos del curso es " + totalCreditos + ".");
    }
}
