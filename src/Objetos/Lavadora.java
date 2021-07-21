package Objetos;

public class Lavadora extends Electrodomestico {
	// Atributos
	protected int carga;
	
	// Constantes
	final static int CARGA = 5;

	// Constructores

	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	public Lavadora(int carga) {
		super();
		this.carga = carga;
	}

	public Lavadora(int precio, int peso) {
		super(precio,peso);
	}

	public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		this.carga = carga;
	}

	// Métodos

	// Getters y Setters

	public int getCarga() {
		return carga;
	}

	public int precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			precioFinal = precioBase + 50;
		}

		return precioFinal;
	}


}
