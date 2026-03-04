import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {

        Random r = new Random();
        int min = 10;
        int max = 35;
        //Genera un número aleatorio entre 10 y 35
        for(int i = 1; i <= 10; i++){
            System.out.println(r.nextInt((max - min + 1)) + min);
        } 
    }
}