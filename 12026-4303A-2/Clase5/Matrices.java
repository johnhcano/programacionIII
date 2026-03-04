public class Matrices {
    public static void main(String[] args) {

            int[][] m = {{9, 4, 1},
                         {2, 8, 7},
                         {3, 5, 6}};

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    System.out.println("m[" + i + "][" + j + "]=" + m[i][j]);
                }
            }
        }   
}
        