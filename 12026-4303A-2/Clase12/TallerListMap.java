import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TallerListMap {
    public static void main(String[] args) {

        // LinkedList
        LinkedList<String> historial = new LinkedList<>();

        historial.add("google.com");
        historial.add("github.com");
        historial.add("stackoverflow.com");

        System.out.println(historial); // [google.com, github.com, stackoverflow.com]

        System.out.println(historial.getLast()); // stackoverflow.com

        System.out.println("Historial eliminado: " + historial.removeLast()); // Historial eliminado: stackoverflow.com

        for (String p : historial) {
            System.out.println(p);
        }

        System.out.println("--------------------------------------------------------------");

        // Map

        Map<Integer, String> productos = new HashMap<>();

        productos.put(101, "Laptop");
        productos.put(102, "Mouse");
        productos.put(103, "Teclado");

        System.out.println(productos); // {101=Laptop, 102=Mouse, 103=Teclado}

        System.out.println(productos.containsKey(102)); // true

        productos.put(101, "Pantalla");

        System.out.println(productos); // {101=Pantalla, 102=Mouse, 103=Teclado}

        productos.forEach((key, value) -> {
            System.out.println("Código: [" + key + "] -> Producto: [" + value + "]");
        });

    }
}
