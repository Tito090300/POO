package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String args[]) {
		
		Empleado misEmpleados[] = new Empleado[3];
		misEmpleados[0] = new Empleado("Juan Martínez", 85000, 1995, 10, 07);
		misEmpleados[1] = new Empleado("Andrea Valentina", 95000, 1998, 04, 26);
		misEmpleados[2] = new Empleado("Andrés Gonzáles", 105000, 2002, 01, 07);
		
		for(empleado empl : misEmpleados) {
			System.out.println("El nombre es: " + empl.dameNombre() + ", su salario "
			+ "es de: " + empl.dameSalario() + ", y su fecha de alta es: "
			+ empl.dameFechaAlta() + ".");
			
			empl.subirSalario(5);
			
			System.out.println("El nuevo salario de " + empl.dameNombre() + 
			" es de: " + empl.dameSalario());
		}
		
	}
	
	
}

class Empleado{
	
	private double salario;
	private String nombre;
	private Date fecha_alta;
	
	public Empleado(String nom, double sala, int agno, int mes, int dia){
		
		nombre = nom;
		salario = sala;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		fecha_alta = calendario.getTime();
		
	}
	
	public double dameSalario() {
		return salario;
	}
	public String dameNombre() {
		return nombre;
	}
	public Date dameFechaAlta() {
		return fecha_alta;
	}
	public void subirSalario(double porcentaje) {
		double aumento = salario*porcentaje / 100;
		salario += aumento;
	}
	
	
	
}
