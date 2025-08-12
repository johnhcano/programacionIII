public class EjecutarOperacionesA {
    public static void main(String[] args){

        OperacionesArreglos objOp = new OperacionesArreglos();

        //Llenar el arreglo

        int[] x = objOp.llenarArregloEnteros(3);

        //Mostrar el arreglo

        objOp.mostrarArregloEnteros(x);

        System.out.println(objOp.promedioArregloEnteros(x));


    }
}