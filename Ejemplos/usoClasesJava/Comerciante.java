package usoClasesJava;

public class Comerciante extends EmpleadoAbstracto {

	private double comision;

	public Comerciante() {
		comision = 0;
	}

	public Comerciante(String nombre, String apellido, int edad,
			double salario, double comision) {
		super(nombre, apellido, edad, salario);
		this.comision = comision;
	}

	public boolean plus(double sueldoPlus) {
		boolean aumento = false;
		if (comision < 50) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}

}