package electrodomestico;

public class Televisi�n extends Electrodom�stico{
	private final int RESOLUCION_DEF=20;
	private final boolean SINTONIZADOR_DEF=false;
	
	//atributos
	private int resoluci�n;
	private boolean sintonizadorTDT;
	
	//Getters
	public int getResoluci�n() {
		return resoluci�n;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	//Constructores
	public Televisi�n(){
		this.resoluci�n=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADOR_DEF;
		this.precio=PRECIO_DEF;
		this.color=COLOR_DEF;
		this.consumoEnerg�tico=CONSUMO_DEF;
		this.peso=PESO_DEF;
	}
	public Televisi�n(int precio, int peso){
		this.precio=precio;
		this.peso=peso;
		this.resoluci�n=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADOR_DEF;;
		this.color=COLOR_DEF;
		this.consumoEnerg�tico=CONSUMO_DEF;
	}
	public Televisi�n(int resoluci�n,boolean sintonizador,int precio,double peso,String color,
			char consumoEnerg�tico) {
		super(precio, peso, color, consumoEnerg�tico);
		this.resoluci�n=resoluci�n;
		this.sintonizadorTDT=sintonizador;
	}
	//M�todo
	public int pecioFinal(){
		int aumentoR=0;
		int aumentoTDT=0;
		int total=0;
		if(this.resoluci�n>40){
			aumentoR=(int)(this.precio*0.30);
		}
		if(this.sintonizadorTDT==true){
			aumentoTDT=50;
		}
		total=super.precioFinal()+aumentoR+aumentoTDT;
		return total;
	}
	@Override
	public String toString() {
		return "Televisi�n [resoluci�n=" + resoluci�n + ", sintonizadorTDT="
				+ sintonizadorTDT + ", precio=" + precio + ", color=" + color
				+ ", consumoEnerg�tico=" + consumoEnerg�tico + ", peso=" + peso
				+ ", pecioFinal()=" + pecioFinal() + "]";
	}
}