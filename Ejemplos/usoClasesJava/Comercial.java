package usoClasesJava;

public class Comercial extends Empleado {
	// Esta clase, "Comercial", tiene todos los atributos y m�todos de la clase
	// "Empleado", m�s los escritos a continuaci�n
	private double comision;

	// Constructor por defecto
	public Comercial() {
		comision = 0;
	}

	// Constructor personalizado
	public Comercial(String nombre, String apellido, int edad, double salario,
			double comision) {
		super(nombre, apellido, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	// Tambi�n se pueden sobreescribir m�todos de la superclase
	public boolean plus(double sueldoPlus) {
		boolean aumento = false;
		if (comision < 50) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
}
