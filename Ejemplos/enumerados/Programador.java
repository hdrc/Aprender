package enumerados;


public class Programador {
	private String nombre;
	private int edad;
	private Lenguajes expertoEn;//Tipo enumerado
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public Lenguajes getExpertoEn() {
		return expertoEn;
	}
	public Programador(String nombre, int edad, Lenguajes expertoEn) {
		this.nombre=nombre;
		this.edad=edad;
		this.expertoEn=expertoEn;
	}
}