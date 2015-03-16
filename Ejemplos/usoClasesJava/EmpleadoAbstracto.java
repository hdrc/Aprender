package usoClasesJava;

//Esta es una clase abstracta, o sea una clase a partir de la cual no se pueden crear objetos
public abstract class EmpleadoAbstracto {

	protected final static double SALARIO_DEF = 600;
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;

	public EmpleadoAbstracto() {
		this("", "", 0, SALARIO_DEF);
	}

	public EmpleadoAbstracto(String nombre, String apellido, int edad,
			double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSalario() {
		return salario;
	}

	// Método no implementado, tiene que ser implementado por las subclases que
	// hereden ésta
	public abstract boolean plus(double sueldoPlus);

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}