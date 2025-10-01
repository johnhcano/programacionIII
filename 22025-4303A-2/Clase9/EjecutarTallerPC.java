public class EjecutarTallerPC {
    public static void main(String[] args) {
        
        int[] a = {10, 40, 30, 20, 50};
        //int[] b = {5, 5, 5, 5, 9};
        //int[] c = {-3, -1, -7, -2};

        TallerPilasColas objTpc = new TallerPilasColas();

        System.out.println(objTpc.segundoMasGrande(a));
    }
}
