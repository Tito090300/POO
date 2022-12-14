package poo;

public class Auto {
	private int motor;
	private int ruedas;
	private double largo;
	private double ancho; 
	private double peso;
	private double pesoPlataforma;
	private String color;
	private boolean asientosDeCuero;
	private boolean aireAcondicionado;

	public Auto() {
		
		ruedas = 4;
		motor = 1;
		largo = 4.25;
		ancho= 1.50;
		peso = 960;
		pesoPlataforma = 300;
		color = "Verde";
		
	}
	public int dameRuedas() {
		return ruedas;
	}
	public void definirColor(String arg) {
		color = arg;
	}
	public String dameColor() {
		return color;
	}
	public String datosVehiculo() {
		return "El auto tiene " + this.motor + " motor, un largo de " 
	+ this.largo + " mts y un ancho de " + this.ancho + " mts, tiene un color "
	+ this.color + " y su peso es de " + this.peso + " Kgs.";
	}
	public void modificarAsientos(String asientosDeCuero) {
		if(asientosDeCuero.equalsIgnoreCase("si")){
			this.asientosDeCuero = true;
		}else {
			this.asientosDeCuero = false;
		}
	}
	public String dimeAsientos() {
		if(!!this.asientosDeCuero) {
			return "Tiene asientos de cuero";
		}else {
			return "NO tiene asientos de cuero";
		}
	}
	public void tieneAire(String aire) {
		
		if(aire.equalsIgnoreCase("si")) {
			this.aireAcondicionado = true;
		}else {
			this.aireAcondicionado = false;
		}
		
	}
	public String getAire() {
		if(!!this.aireAcondicionado) {
			return "Tiene aire acondicionado";
		}else {
			return "NO tiene aire acondicionado";
		}
	}
	public String setPeso() {
		
		int pesoCarroceria = 750;
		peso = peso + pesoCarroceria;
		
		if(!!this.asientosDeCuero) {
			peso += 10;
		}
		if(!!this.aireAcondicionado) {
			peso += 20;
		}
		
		return "El peso total del auto es: " + this.peso;
		
	}

}