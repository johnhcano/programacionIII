public class Estudiante {
    
    private int id;
    private String nombre;
    private String facultad;

    public Estudiante(int id, String nombre, String facultad) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public String toString() {
        return "Estudiante [ id: " + id + " Nombre: " + nombre + " Facultad: " + facultad + " ]";
    }

}
