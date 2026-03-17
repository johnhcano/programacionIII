import java.util.Stack;

public class EjecutarPila {
    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();

        System.out.println(pila.empty()); //true

        //Insertar elemetos a la pila
        pila.push("María José");
        pila.push("Dalmar");
        pila.push("Samuel");
        pila.push("Yolian");

        //Mostrar la pila
        System.out.println(pila); //[María José, Dalmar, Samuel, Yolian]

        //Mostrar el tope de la pila sin eliminar el elemento
        System.out.println(pila.peek()); //Yolian

        //Eliminar el tope de la pila
        System.out.println("Elemento eliminado: " + pila.pop());

        //Mostrar la pila
        System.out.println(pila); //[María José, Dalmar, Samuel]

        System.out.println("Buscar: " + pila.search("Samuel")); //1
        System.out.println("Buscar: " + pila.search("Dalmar")); //2
        System.out.println("Buscar: " + pila.search("María José")); //3
        

    }
}
