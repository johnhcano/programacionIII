public class EjecutarLibro {
    public static void main(String[] args) {

        // objetos
        Libro[] libros = new Libro[5];

        libros[0] = new Libro(1, "Libro1", 2000);
        libros[1] = new Libro(2, "Libro2", 3000);
        libros[2] = new Libro(3, "Libro3", 1500);
        libros[3] = new Libro(4, "Libro4", 4000);
        libros[4] = new Libro(5, "Libro5", 2500);

        System.out.println("El costo total de los libros es: " + libros[3].calcularPrecios(libros) + " US");

    }
}
