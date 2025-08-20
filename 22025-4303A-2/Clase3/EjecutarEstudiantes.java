import java.util.Arrays;

public class EjecutarEstudiantes {
    public static void main(String[] args) {
    
        Estudiantes objEst1 = new Estudiantes(1, "Juan", "Ingeniería");
        Estudiantes objEst2 = new Estudiantes(2, "Pedro", "Derecho");
        Estudiantes objEst3 = new Estudiantes(3, "María", "Ingeniería");
        
        //Creación del arreglo de objetos
        Estudiantes[] est = new Estudiantes[4];

        //Asignar los estudiantes a cada posición del arreglo de objetos
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;
        est[3] = new Estudiantes(4, "Ana", "Psicología");

        //Forma1 --> Imprimir el arreglo de objetos
        for(int i = 0; i < est.length; i++){
            System.out.println(est[i]);
        }

        //Forma2 --> Imprimir el arreglo de objetos
        System.out.println(Arrays.toString(est));

    }
}
