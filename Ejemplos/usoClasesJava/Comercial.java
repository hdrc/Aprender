package usoClasesJava;

public class Comercial extends Empleado {
	// Esta clase, "Comercial", tiene todos los atributos y métodos de la clase
	// "Empleado", más los escritos a continuación
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

	// También se pueden sobreescribir métodos de la superclase
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
