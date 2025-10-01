import java.util.Stack;

public class TallerPilasColas {

    public int segundoMasGrande(int[] arreglo) {
        int max1 = 0;
        int max2 = 0;
        int max1n = 9999;
        int max2n = 9999;
        boolean flag = false;

        Stack<Integer> numeros = new Stack<>();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= 0) {
                if (arreglo[i] >= max1) {
                    max1 = arreglo[i];
                }
                flag = true;
            } else {
                if (arreglo[i] <= max1n) {
                    max1n = arreglo[i];
                }
                flag = false;
            }
        }

        if(flag) {
            numeros.add(max1);
        }else{
            numeros.add(max1n);
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= 0) {
                if (arreglo[i] >= max2 && arreglo[i] != max1) {
                    max2 = arreglo[i];
                }
                flag = true;
            } else {
                if (arreglo[i] <= max2n && arreglo[i] != max1n) {
                    max2n = arreglo[i];
                }
                flag = false;
            }
        }

        if(flag){
            numeros.add(max2);
        }else{
            numeros.add(max2n);
        }
        
        return numeros.peek();
    }
}
