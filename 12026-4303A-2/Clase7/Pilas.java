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
        
        //Mostrar el tope de la pila sin removerlo
        System.out.println(pila.peek()); // Juan
        
        //Mostrar el contenido de la pila
        System.out.println(pila); //[Sebastian, Alejandro, Natalia, Juan]
        
        //Eliminar el elemento que se encuentra en el tope de la pila
        System.out.println("Se eliminó: " + pila.pop()); //Juan
        
        //Mostrar el contenido de la pila
        System.out.println(pila); //[Sebastian, Alejandro, Natalia]
        
        //Posiciones de los elementos dentro de la pila
        System.out.println(pila.search("Sebastian")); //3
        System.out.println(pila.search("Alejandro")); //2
        System.out.println(pila.search("Natalia")); //1

        //Tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size()); //3
    }    
}
