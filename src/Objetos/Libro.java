package Clases;

public class Libro {
	// Atributos
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;

	
	// Constructores
	
	public Libro(String ISBN, String titulo, String autor, int numPaginas) {
		super();
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public String toString() {
		return "El libro " + titulo + " con ISBN: " + 
				ISBN + " creado por el autor " + autor + 
				" tiene " + numPaginas + " páginas";	
	}
	

	// Métodos
	
	
	
	// Getters y Setters
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
}
