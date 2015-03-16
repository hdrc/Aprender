package usoClasesJava;

/**
 * Clase Empleado
 *
 * Contiene la información de cada empleado
 *
 * @author Hider Rodi
 * @version 1.0
 */
public class Empleado implements Comparable<Empleado> {

	// Atributos

	/**
	 * Nombre del empleado
	 */
	private String nombre;
	/**
	 * Apellido del empleado
	 */
	private String apellido;
	/**
	 * Edad del empleado
	 */
	private int edad;
	/**
	 * Salario del empleado
	 */
	protected double salario;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		this("", "", 0, 0);
	}

	/**
	 * Constructor con 4 parámetros
	 *
	 * @param nombre
	 *            del empleado
	 * @param apellido
	 *            del empleado
	 * @param salario
	 *            del empleado
	 */
	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	// Método compareTo
	public int compareTo(Empleado a) {
		int estado = -1;
		if (edad == a.getEdad())
			estado = 0;
		else if (edad > a.getEdad())
			estado = 1;
		return estado;
	}

	public boolean equals(Empleado a) {
		if (a.getNombre().equals(nombre) && a.getApellido().equals(apellido))
			return true;
		else
			return false;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	// Getters y setters, permiten mostrar o modificar el valor de un atributo
	// cuando se accede desde otra clase
	public String getNombre() {
		return nombre;
	}

	public double getSalario() {
		return salario;
	}

	// Metodos públicos
	/**
	 * Suma un plus al salario del empleado si el empleado tiene más de 40 años
	 *
	 * @param sueldoPlus
	 * @return <ul>
	 *         <li>true: se suma el plus al sueldo</li>
	 *         <li>false: no se suma el plus al sueldo</li>
	 *         </ul>
	 */
	public boolean plus(double sueldoPlus) {
		boolean aumento = false;
		if (edad > 40) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}

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

	public String toString() {
		String mensaje = "El empleado se llama " + nombre + " " + apellido
				+ " con " + edad + " años " + " y un salario de " + salario;
		return mensaje;
	}
}