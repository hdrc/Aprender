package electrodomestico;
public class Electrodom�stico {
	
	protected final int  PRECIO_DEF=100;
	protected final String COLOR_DEF="Blanco";
	protected final char CONSUMO_DEF='F';
	protected final double PESO_DEF=5;
	
	//Atributos
	protected int precio;
	protected String color;
	protected char consumoEnerg�tico;
	protected double peso;
	
	//Getters
	public int getPrecio() {
		return precio;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnerg�tico() {
		return consumoEnerg�tico;
	}
	public double getPeso() {
		return peso;
	}
	//Constructores
	public Electrodom�stico(){
		this.precio=PRECIO_DEF;
		this.color=COLOR_DEF;
		this.consumoEnerg�tico=CONSUMO_DEF;
		this.peso=PESO_DEF;
	}
	public Electrodom�stico(int precio, double peso){
		this.precio=precio;
		this.peso=peso;
		this.color=COLOR_DEF;
		this.consumoEnerg�tico=CONSUMO_DEF;
	}
	public Electrodom�stico(int precio, double peso, String color,char consumoEnerg�tico) {
		this.precio=precio;
		this.peso=peso;
		this.color=color;
		this.consumoEnerg�tico=consumoEnerg�tico;
		comprobarConsumoEnerg�tico(this.consumoEnerg�tico);
		comprobarColor(this.color);
	}
	//M�todos
	public int precioFinal(){
		int precioAdicionalE=0;
		int precioAdicionalP=0;
		int total;
		if(this.consumoEnerg�tico=='A'){
			precioAdicionalE=100;
		}else if(this.consumoEnerg�tico=='B'){
			precioAdicionalE=80;
		}else if(this.consumoEnerg�tico=='C'){
			precioAdicionalE=60;
		}else if(this.consumoEnerg�tico=='D'){
			precioAdicionalE=50;
		}else if(this.consumoEnerg�tico=='E'){
			precioAdicionalE=30;
		}else if(this.consumoEnerg�tico=='F'){
			precioAdicionalE=10;
		}
		if(this.peso<=19){
			precioAdicionalP=10;
		}else if(this.peso<=49){
			precioAdicionalP=50;
		}else if(this.peso<=79){
			precioAdicionalP=80;
		}else if(this.peso>=80){
			precioAdicionalP=100;
		}
		total=this.precio+precioAdicionalE+precioAdicionalP;
		return total;
	}
	private void comprobarConsumoEnerg�tico(char letra){
		if(letra!='A'&&letra!='B'&&letra!='C'&&letra!='D'&&letra!='E'&&letra!='F'){
			this.consumoEnerg�tico=CONSUMO_DEF;
		}
		
	}
	private void comprobarColor(String color){
		if(color.equalsIgnoreCase("blanco")==false&&
		color.equalsIgnoreCase("negro")==false&&
		color.equalsIgnoreCase("rojo")==false&&
		color.equalsIgnoreCase("azul")==false&&
		color.equalsIgnoreCase("gris")==false){
			this.color=COLOR_DEF;
		}
	}
	public String toString() {
		return "Electrodom�stico [precio=" + precio + ", color=" + color
				+ ", consumoEnerg�tico=" + consumoEnerg�tico + ", peso=" + peso
				+ ", precioFinal()=" + precioFinal() + "]";
	}
}