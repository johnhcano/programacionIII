public class Estudiantes {
    
    private int id;
    private String nombre;
    private String facultad;

    public Estudiantes(int id, String nombre, String facultad) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public String getFacultad(){
        return facultad;
    }

    public String toString() {
        return "Estudiante [ id: " + id + " Nombre: " + nombre + " Facultad: " + facultad + " ]";
    }

    //Método para saber cuántos estudiantes tiene una facultad
    public int contarEstudiantes(Estudiantes[] e, String nombreFacultad){
        
        int contador = 0;
        
        for (int i = 0; i < e.length; i++) {
            if(e[i].getFacultad().equals(nombreFacultad)){
                contador++;
            }        
        }
        
        return contador;
    }
}
