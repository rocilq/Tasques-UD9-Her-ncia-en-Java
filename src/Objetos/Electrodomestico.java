package Objetos;
public class Electrodomestico {
	
	// Atributos

	protected int precioBase;
	protected int precioFinal;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	// Constantes
	
	protected final String COLOR = "Blanco";
	protected final char CONSUMO = 'F';

	// Constructores

	public Electrodomestico() {
		this.precioBase = 100;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = 5;
	}

	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// Métodos
	
	

	@Override
	public String toString() {
		return "precioBase=" + precioBase + ", PrecioFinal UWU OWO="+ precioFinal + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", COLOR=" + COLOR + ", CONSUMO=" + CONSUMO ;
	}

	public String comprobarColor (String color) {
		color = color.toLowerCase();

		switch (color) {
		case "blanco":
			return color;

		case "negro":
			return color;

		case "rojo":
			return color;

		case "azul":
			return color;

		case "gris":
			return color;

		default:
			return "Blanco";

		}
	}

	public char comprobarConsumoEnergetico(char letra){
		char letraMayus = Character.toUpperCase(letra);
		
		switch (letraMayus) {
		case 'A':
			return letraMayus;
		case 'B':
			return letraMayus;
		case 'C':
			return letraMayus;
		case 'D':
			return letraMayus;
		case 'E':
			return letraMayus;
		case 'F':
			return letraMayus;
		default:
			return 'F';
		}
	}
	
	public int precioFinal(){
		char letraMayus = Character.toUpperCase(consumoEnergetico);
		
		switch (letraMayus) {
		case 'A':
			precioFinal = precioBase + 100;
		case 'B':
			precioFinal = precioBase + 80;
		case 'C':
			precioFinal = precioBase + 60;
		case 'D':
			precioFinal = precioBase + 50;
		case 'E':
			precioFinal = precioBase + 30;
		case 'F':
			precioFinal = precioBase + 10;
		break;
		
		}
		
		if (peso >= 0 && peso <= 19) {
			precioFinal = precioBase + 10;
		}else if(peso > 20 && peso < 49) {
			precioFinal = precioBase + 50;
		}else if(peso > 50 && peso < 79){
			precioFinal = precioBase + 80;
		}else if(peso > 80) {
			precioFinal = precioBase + 100;
		}
		
		return precioFinal;
	}
	
	// Getters y Setters
	
	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	

}
