package ExamenFinal1;

import ExamenFinal1.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Crear un objeto Libro
        Libro libro = new Libro("El código Da Vinci", "Dan Brown", "Misterio");

        // Mostrar información del libro
        libro.mostrarInformacion();

        // Buscar un libro por título
        libro.buscarLibro("El código Da Vinci");

        // Reservar el libro
        libro.reservarLibro();

        // Intentar reservar el libro nuevamente (no debería ser posible)
        libro.reservarLibro();

        // Devolver el libro
        //libro
		
		
		
	}

}
