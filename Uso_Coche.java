package poo;

public class Uso_Vehiculos {
	
	public static void main(String[] args) {
		
		Furgoneta Furgo = new Furgoneta(450, 6); 
		
		System.out.println(Furgo.getFurgonetaData());
		System.out.println("Las ruedas de la furgo son: " + Furgo.getRuedas());
	
	}
	
}
