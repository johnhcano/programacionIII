import java.util.ArrayDeque;
import java.util.Queue;

public class EjecutarCola {
    public static void main(String[] args) {
        
        Queue<Integer> cola = new ArrayDeque<>();

        //Insertar elementos a la cola
        cola.add(10);
        cola.add(15);
        cola.add(8);
        cola.add(20);
        cola.add(35);
        cola.add(12);

        //Mostrar los elementos de la cola
        System.out.println(cola); //[10, 15, 8, 20, 35, 12]

        //Verificar que elemento está en la cabeza de la cola con el método element
        System.out.println(cola.element()); //10

        //Agrear otro elemento con el método offer
        cola.offer(55);

        //Mostrar los elementos de la cola
        System.out.println(cola); //[10, 15, 8, 20, 35, 12, 55]

        //Verificar que elemento está en la cabeza de la cola con el método peek
        System.out.println(cola.peek()); //10

        //Eliminar el primer elemento de la cola (cabeza) con método poll
        System.out.println("Elemento eliminado: " + cola.poll()); //10

        //Eliminar el primer elemento de la cola (cabeza) con método remove
        System.out.println("Elemento eliminado: " + cola.remove()); //15

        //Mostrar los elementos de la cola
        System.out.println(cola); //[8, 20, 35, 12, 55]

        //Obtener el tamaño de la cola
        System.out.println("Tamaño de la cola: " + cola.size());

    }
}
