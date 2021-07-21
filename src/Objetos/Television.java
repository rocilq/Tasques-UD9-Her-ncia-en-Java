package Objetos;

public class Television extends Electrodomestico {
	// Atributos
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	// Constantes
	
	final static int RESOLUCION = 20;
	final static boolean SINTONIZADOR = false;
	
	// Constructores
	
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR;
	}
	
	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		
	}
	
	// Métodos
	
	// Getters y Setters
	
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	

}
