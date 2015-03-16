package electrodomestico;

public class Televisión extends Electrodoméstico{
	private final int RESOLUCION_DEF=20;
	private final boolean SINTONIZADOR_DEF=false;
	
	//atributos
	private int resolución;
	private boolean sintonizadorTDT;
	
	//Getters
	public int getResolución() {
		return resolución;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	//Constructores
	public Televisión(){
		this.resolución=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADOR_DEF;
		this.precio=PRECIO_DEF;
		this.color=COLOR_DEF;
		this.consumoEnergético=CONSUMO_DEF;
		this.peso=PESO_DEF;
	}
	public Televisión(int precio, int peso){
		this.precio=precio;
		this.peso=peso;
		this.resolución=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADOR_DEF;;
		this.color=COLOR_DEF;
		this.consumoEnergético=CONSUMO_DEF;
	}
	public Televisión(int resolución,boolean sintonizador,int precio,double peso,String color,
			char consumoEnergético) {
		super(precio, peso, color, consumoEnergético);
		this.resolución=resolución;
		this.sintonizadorTDT=sintonizador;
	}
	//Método
	public int pecioFinal(){
		int aumentoR=0;
		int aumentoTDT=0;
		int total=0;
		if(this.resolución>40){
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
		return "Televisión [resolución=" + resolución + ", sintonizadorTDT="
				+ sintonizadorTDT + ", precio=" + precio + ", color=" + color
				+ ", consumoEnergético=" + consumoEnergético + ", peso=" + peso
				+ ", pecioFinal()=" + pecioFinal() + "]";
	}
}