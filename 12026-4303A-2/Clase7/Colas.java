import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        
        //Creación de cola
        Queue<Integer> cola = new LinkedList<>();
        
        //Insertar elementos a la cola (add, offer)
        cola.add(10);
        cola.add(20);
        cola.offer(5);
        cola.offer(15);

        //Mostrar la cola
        System.out.println(cola); //[10, 20, 5, 15]

        //Mostrar la cabeza de la cola (element, peek)
        System.out.println("element -> " + cola.element()); //10
        System.out.println("peek -> " + cola.peek()); //10

        //Mostrar la cola
        System.out.println(cola); //[10, 20, 5, 15]

        //Eliminar los elementos de la cabeza de la cola
        System.out.println(cola.poll()); //elimina el elemento 10
        System.out.println(cola.remove()); //elimina el elemento 20
         
        //Mostrar la cola
        System.out.println(cola); //[5, 15]

    }
}
