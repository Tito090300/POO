package poo;

import java.util.*;
import javax.swing.*;

public class Uso_Empleado {
	
	public static void main(String[] args) { 
	
		
		Empleado[] misEmpleados = new Empleado[5];
		misEmpleados[0] = new Empleado("Luis Mesas", 85000, 2020, 10, 7);
		misEmpleados[1] = new Empleado("Ariana Fernandez", 87545, 2018, 4, 30);
		misEmpleados[2] = new Empleado("Javier Urdaneta", 92330, 2019, 6, 23);
		misEmpleados[3] = new Empleado("Adrián José");
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + 
		misEmpleados[3].establece_bonus(500));
		
		for(Empleado empl : misEmpleados) {
			
			System.out.println(empl.dimeDatosEmpleado());
			empl.aumentarSalario(5);
			System.out.println("El nuevo salario de " + empl.dameNombre() + 
			" es de: " + empl.dimeSalario());
		}
		
	}

}

class Empleado{
	
	private String nombre;
	private double salario;
	private Date fecha_alta;
	private int id;
	static int idSiguiente = 0;
	
	public Empleado(String _nombre, double _salario, int _anio, int _mes, int _dia) {
		nombre = _nombre;
		
		salario = _salario;
		GregorianCalendar calendario = new GregorianCalendar(_anio, _mes-1, _dia);
		fecha_alta = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
		
	}
	public Empleado(String _nombre){
		this(_nombre, 30000, 2000, 01, 01);
	}
	public String dameNombre() {
		return "Nombre: " + this.nombre + ", id: "+ this.id;
	}
	public double dimeSalario() {
		return this.salario;
	}
	public Date dimeFechaContrato() {
		return this.fecha_alta;
	}
	public void definirNombre(String nombre) {
		this.nombre = nombre;
	}
	public void aumentarSalario(double porcentaje) {
		this.salario += (salario*porcentaje) / 100; 
	}
	public String dimeDatosEmpleado() {
		return
		"El nombre del empleado es: " + this.dameNombre() + ", y su fecha de "
		+ "alta fue " + this.dimeFechaContrato() + ", y el salario es de " 
		+ this.dimeSalario() + "$";
	}
}