import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();
        //Mostrar si la pila está vacía
        System.out.println(pila.empty()); //true
        //Agregar elementos a la pila
        pila.push("Sebastian");
        pila.push("Alejandro");
        pila.push("Natalia");
        pila.push("Juan");
        //Mostrar el contenido de la pila
        System.out.println(pila); //[Sebastian, Alejandro, Natalia, Juan]

    }    
}
