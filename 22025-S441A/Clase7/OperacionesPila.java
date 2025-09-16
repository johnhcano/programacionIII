import java.util.Stack;

public class OperacionesPila {

    Stack<String> pilaSignos;

    public boolean validarParentesis(String[] s) {
        boolean flag = false;

        pilaSignos = new Stack<>();

        //Almacenar en la pila el arreglo de signos
        for (int i = 0; i < s.length; i++) {
            pilaSignos.push(s[i]);
        }

        int tam = pilaSignos.size();
        int cont1 = 0, cont2 = 0; 
        //recorrer la pila
        for (int i = 0; i < tam; i++) {
            if (pilaSignos.peek().equals("(")){
                cont1 += 1;
            }else{
                cont2 += 1;
            }
            pilaSignos.pop();
        }

        flag = (cont1 == cont2 ? true : false);

        return flag;
    }
}
