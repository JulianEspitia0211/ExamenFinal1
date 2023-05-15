package ExamenFinal1;

public class Libro {

	private String titulo;
    private String autor;
    private String categoria;
    private boolean disponibilidad;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponibilidad = true;
    }

    // Métodos de acceso (getters) para los atributos

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    // Métodos de modificación (setters) para los atributos

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Métodos para buscar, reservar, comprar y devolver el libro

    public void buscarLibro(String titulo) {
        if (this.titulo.equalsIgnoreCase(titulo)) {
            System.out.println("Libro encontrado:");
            mostrarInformacion();
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void reservarLibro() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("El libro ha sido reservado.");
        } else {
            System.out.println("El libro no está disponible para reservar.");
        }
    }

    public void comprarLibro() {
        if (disponibilidad) {
            System.out.println("El libro ha sido comprado.");
        } else {
            System.out.println("El libro no está disponible para comprar.");
        }
    }

    public void devolverLibro() {
        if (!disponibilidad) {
            disponibilidad = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("No se puede devolver un libro que no ha sido prestado.");
        }
    }

    // Método auxiliar para mostrar la información del libro

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
        System.out.println("Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible"));
	
	
    }
	
	
}
