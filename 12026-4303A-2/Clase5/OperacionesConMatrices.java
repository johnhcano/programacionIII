import java.util.Random;

public class OperacionesConMatrices {

    public int[][] llenarMatriz(int fila, int col, int min, int max) {
        int[][] m = new int[fila][col];
        Random r = new Random();
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                m[i][j] = r.nextInt((max - min + 1) + min);
            }
        }
        return m;
    }

    public String mostrarMatriz(int[][] m){
        String cad = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                cad += m[i][j] + " ";
            }
            cad += "\n";
        }        
        return cad;
    }
}
