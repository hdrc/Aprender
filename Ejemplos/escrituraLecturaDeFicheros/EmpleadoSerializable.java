package escrituraLecturaDeFicheros;

import java.io.Serializable;
//Clase serializable
public class EmpleadoSerializable implements Serializable{
	private static final long serialVersionUID = -8972008247876905526L;
	/**
	 *Atributos
	 */
	protected final static double SALARIO_DEF=600;
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	/**
	 * @return
	 * Métodos
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean plus(double sueldoPlus){
		boolean aumento=false;
		if(edad>40){
			salario+=sueldoPlus;
			aumento=true;
		}
		return aumento;
	}
	public boolean equals(EmpleadoSerializable a){
		if(a.getNombre().equals(nombre)&&a.getApellido().equals(apellido)){
			return true;
		}else{
			return false;
		}
	}
	public int compareTo(EmpleadoSerializable a) {
		int estado=-1;
		if(this.edad==a.getEdad()){
			estado=0;//Los objetos son iguales
		}else if(this.edad>a.getEdad()){
			estado=1;//El objeto1 es mayor que el objeto dado como parámetro
		}
		return estado;
	}

	public String toString() {
		return "EmpleadoSerializable [nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", salario=" + salario + "]";
	}
	/**
	 * Constructores
	 */
//Constructor por defecto
	public EmpleadoSerializable(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.salario=SALARIO_DEF;
    }
 //Constructor con 2 parámetros
	public EmpleadoSerializable(String nombre, String apellido){
		this(nombre, apellido, 0, SALARIO_DEF);
	 }
 
 //Constructor con 3 parámetros
	public EmpleadoSerializable(String nombre, String apellido, int edad){
		this(nombre, apellido, edad, SALARIO_DEF);
	 }
	public EmpleadoSerializable(String nombre, String apellido, int edad, double salario){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.salario=salario;
	}
}