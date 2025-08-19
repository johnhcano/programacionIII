import java.util.Arrays;

public class Estudiante {
    // Atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;

    // Constructor
    public Estudiante(int id, int cedula, String nombre, String facultad) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    // Método Matricular Cursos
    public void matricularCursos(String[] cursos) {
        System.out.println(Arrays.toString(cursos));
    }

    // Método toString
    public String toString() {
        return "Estudiante: [ id: " + id + " Cédula: " + cedula + " Nombre: " + nombre + " Facultad: " + facultad + " ]";
    }

}