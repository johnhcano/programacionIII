import java.util.Arrays;

public class OperacionesArreglos {

    /*
     * Método para llenar el arreglo con números enteros y retornarlo
     */
    public int[] llenarArregloEnteros(int tam){

        int[] a = new int[tam];
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (1 + Math.random() * (100-1) + 1); 
        }

        return a;
    }

    /*
     * Método para mostrar el arreglo de números enteros
     */

    public void mostrarArregloEnteros(int[] a){
        System.out.println(Arrays.toString(a));
    } 

    /*
     * Método para calcular el promedio de un arreglo
     */

    public double promedioArregloEnteros(int[] a){
        int suma = 0;
        double promedio = 0.0;

        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }

        promedio = suma / a.length;

        return promedio;
    }

}