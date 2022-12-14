package poo;
import Auto;

public class Furgoneta extends Auto{
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		
		super();
		this.plazas_extra = plazas_extra;
		this.capacidad_carga = capacidad_carga;
	}
	public String dameDatosFurgoneta() {
		return "La capacidad de carga es de: " + this.capacidad_carga + ", "
				+ "y las plazas totales son: " + this.plazas_extra;
	}
}
