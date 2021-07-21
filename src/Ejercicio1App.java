import Objetos.*;

public class Ejercicio1App {

	public static void main(String[] args) {
		Electrodomestico[] electrodomestico = rellenarArray();
		
		
		for (int i = 0; i < electrodomestico.length; i++) {
			electrodomestico[i].precioFinal();
			System.out.println(electrodomestico[i]);
		
		}
		
		
	}
	
	public static Electrodomestico[] rellenarArray() {
		
		
		
		Television tele = new Television();
		Television tele1 = new Television();
		Television tele2 = new Television();
		Television tele3 = new Television();
		Television tele4 = new Television();
		
		Lavadora lavadora = new Lavadora();
		Lavadora lavadora1 = new Lavadora();
		Lavadora lavadora2 = new Lavadora();
		Lavadora lavadora3 = new Lavadora();
		Lavadora lavadora4 = new Lavadora();
		
		Electrodomestico[] electrodomestico = {tele,tele1,tele2,tele3,tele4,lavadora,lavadora1,lavadora2,lavadora3,lavadora4};
		
		
		return electrodomestico;
		
	}

}
