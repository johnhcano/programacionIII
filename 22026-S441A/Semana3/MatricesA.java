public class MatricesA {
    public static void main(String[] args) {
        
        //Declaración de la matriz (Forma 1)
        int[][] m = {{5, 8, 6}, 
                     {1, 3, 2}, 
                     {4, 9, 7}};

        //Recorrido de la matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) { //m[0] hace referencia a las columnas
                System.out.println("m[" + i + "][" + j +"]=" + m[i][j]);    
            }
        }

        //Visualizar de mejor manera la matriz
        String cad = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) { //m[0] hace referencia a las columnas
                cad += "|" + m[i][j];        
            }
            cad += "| \n";
        }
        System.out.println(cad);
    }
}
