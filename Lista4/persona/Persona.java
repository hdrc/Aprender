package persona;

public class Persona {

	private final static char SEXO_DEF='H';
	public final byte INFRAPESO=-1;
	public final byte PESO_IDEAL=0;
	public final byte SOBREPESO=1;
	
	private String nombre;
	private byte edad;
	private int identidad;
	private char sexo;
	private float peso;
	private float altura;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public int getIdentidad() {
		return identidad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public Persona() {
		this.nombre="";
		this.edad=0;
		this.identidad=0;
		this.sexo=SEXO_DEF;
		this.peso=0;
		this.altura=0;
	}
	public Persona(String nombre,byte edad,char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}	
	public Persona(String nombre, byte edad,char sexo,float peso,float altura){
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
		generarIdentidad();
		comprobarSexo(sexo);
	}

	public byte calcularIMC(){
		double imc=peso/Math.pow(altura, 2);
		if(imc<18.5){
			return INFRAPESO;
		}else if(imc<25){
			return PESO_IDEAL;
		}
		else {return SOBREPESO;}
	}
	public boolean esMayorDeEdad(){
		if(edad>=18){
			return true;
		}else {return false;}
	}
	private void comprobarSexo(char sexo) {
		if(sexo!=this.sexo){
			this.sexo='H';
		}
	}
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", identidad="
				+ identidad + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + "]";
	}
	private void generarIdentidad(){
		int identidad=(int)(Math.random()*1000000);
		this.identidad=identidad;
	}
}