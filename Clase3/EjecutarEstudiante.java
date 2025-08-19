import java.util.Arrays;

public class EjecutarEstudiante{
    public static void main(String[] args) {
        
        //Creación de los objetos
        Estudiante objEst1 = new Estudiante(1,1006720569,"Angelica","Ingeniería");
        Estudiante objEst2 = new Estudiante(2,1001256512,"Miguel","Ingeniería");
        Estudiante objEst3 = new Estudiante(3,1000999111,"Byron","Medicina");

        System.out.println(objEst1);

        //Creación del arreglo de objetos (Estudiantes)
        Estudiante[] e = new Estudiante[4];

        e[0] = objEst1;
        e[1] = objEst2;
        e[2] = objEst3;
        e[3] = new Estudiante(4, 1008940941, "Peter", "Ingeniería");

        System.out.println(Arrays.toString(e));
        
        //Actividad independiente
        //implementar el metodo matricular cursos para que cada estudiante pueda realizar dicha operación.
    }
}