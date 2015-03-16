package electrodomestico;
public class Electrodoméstico {
	
	protected final int  PRECIO_DEF=100;
	protected final String COLOR_DEF="Blanco";
	protected final char CONSUMO_DEF='F';
	protected final double PESO_DEF=5;
	
	//Atributos
	protected int precio;
	protected String color;
	protected char consumoEnergético;
	protected double peso;
	
	//Getters
	public int getPrecio() {
		return precio;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnergético() {
		return consumoEnergético;
	}
	public double getPeso() {
		return peso;
	}
	//Constructores
	public Electrodoméstico(){
		this.precio=PRECIO_DEF;
		this.color=COLOR_DEF;
		this.consumoEnergético=CONSUMO_DEF;
		this.peso=PESO_DEF;
	}
	public Electrodoméstico(int precio, double peso){
		this.precio=precio;
		this.peso=peso;
		this.color=COLOR_DEF;
		this.consumoEnergético=CONSUMO_DEF;
	}
	public Electrodoméstico(int precio, double peso, String color,char consumoEnergético) {
		this.precio=precio;
		this.peso=peso;
		this.color=color;
		this.consumoEnergético=consumoEnergético;
		comprobarConsumoEnergético(this.consumoEnergético);
		comprobarColor(this.color);
	}
	//Métodos
	public int precioFinal(){
		int precioAdicionalE=0;
		int precioAdicionalP=0;
		int total;
		if(this.consumoEnergético=='A'){
			precioAdicionalE=100;
		}else if(this.consumoEnergético=='B'){
			precioAdicionalE=80;
		}else if(this.consumoEnergético=='C'){
			precioAdicionalE=60;
		}else if(this.consumoEnergético=='D'){
			precioAdicionalE=50;
		}else if(this.consumoEnergético=='E'){
			precioAdicionalE=30;
		}else if(this.consumoEnergético=='F'){
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
	private void comprobarConsumoEnergético(char letra){
		if(letra!='A'&&letra!='B'&&letra!='C'&&letra!='D'&&letra!='E'&&letra!='F'){
			this.consumoEnergético=CONSUMO_DEF;
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
		return "Electrodoméstico [precio=" + precio + ", color=" + color
				+ ", consumoEnergético=" + consumoEnergético + ", peso=" + peso
				+ ", precioFinal()=" + precioFinal() + "]";
	}
}