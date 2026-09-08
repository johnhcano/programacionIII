public class MatricesA2 {
    public static void main(String[] args) {
        
        //Declaración de una matriz 3X3 (Forma 1)
        int[][] m = {{5, 8, 6},
                     {1, 3, 2},
                     {4, 9, 7}};
        
        //Recorrer la matriz
        for (int i = 0; i < m.length; i++) { //m.length -> siempre será para recorrer las filas
            for (int j = 0; j < m[0].length; j++) {   //m[0].length -> siempre será para recorrer las columnas
                System.out.println("m["+i+"]["+j+"]="+m[i][j]);        
            }
        }

        //Visualizar de mejor manera la matriz
        String cad = "";
        for (int i = 0; i < m.length; i++) { //m.length -> siempre será para recorrer las filas
            for (int j = 0; j < m[0].length; j++) {   //m[0].length -> siempre será para recorrer las columnas
                cad += "|"+m[i][j];        
            }
            cad+="| \n";
        }

        System.out.println(cad);



    }
}
