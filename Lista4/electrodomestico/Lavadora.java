package electrodomestico;

public class Lavadora extends Electrodom�stico{

	private final double CARGA_DEF=5;
	
	//Atributo
	private double carga;
	
	//Getters
	public double getCarga() {
		return carga;
	}
	//Constructores
	public Lavadora(){
		this.carga=CARGA_DEF;
		this.peso=PESO_DEF;
		this.color=COLOR_DEF;
		this.consumoEnerg�tico=CONSUMO_DEF;
		this.precio=PRECIO_DEF;
	}
	public Lavadora(int precio, double peso){
		this.precio=precio;
		this.peso=peso;
		this.carga=CARGA_DEF;
		this.color=COLOR_DEF;
		this.consumoEnerg�tico=CONSUMO_DEF;
	}
	public Lavadora(int precio,double peso,String color,char consumoEnerg�tico,double carga){
		super(precio, peso, color, consumoEnerg�tico);
		this.carga=carga;
	}
	
	//M�todo
	public int precioFinal(){
		int precioAdicional=0;
		int total;
		if(this.carga>30){
			precioAdicional=50;
		}
		total=super.precioFinal()+precioAdicional;
		return total;
	}
	public String toString() {
		return "Lavadora [carga=" + carga + ", precio=" + precio + ", color="
				+ color + ", consumoEnerg�tico=" + consumoEnerg�tico
				+ ", peso=" + peso + ", precioFinal()=" + precioFinal() + "]";
	}
}
