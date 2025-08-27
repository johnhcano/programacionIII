public class EjecutaClaseLibro {
    public static void main(String[] args) {
        
        Libro[] libros = new Libro[5];

        libros[0] = new Libro("Libro1", "autor1", 2000);
        libros[1] = new Libro("Libro2", "autor2", 1000);
        libros[2] = new Libro("Libro3", "autor3", 1500);
        libros[3] = new Libro("Libro4", "autor4", 3000);
        libros[4] = new Libro("Libro5", "autor5", 1100);

        System.out.println("El total de los libros es: " + libros[0].calcularPrecio(libros));

    }
}
