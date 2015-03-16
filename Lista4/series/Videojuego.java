package series;

public class Videojuego implements Entregable{
	//Constantes
	private final byte HORAS_DEF=10;
	private final boolean ENTREGADO_DEF=false;
	public final static byte MAYOR=1;
	public final static byte MENOR=-1;
	public final static byte IGUAL=0;
	
	//Atributos
	private String titulo;
	private byte horasEstimadas;
	private boolean entregado;
	private String g�nero;
	private String compa��a;
	
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public byte getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(byte horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
	public String getCompa��a() {
		return compa��a;
	}
	public void setCompa��a(String compa��a) {
		this.compa��a = compa��a;
	}
	//M�todos
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas="
				+ horasEstimadas + ", entregado=" + entregado + ", g�nero="
				+ g�nero + ", compa��a=" + compa��a + "]";
	}
	//Constructores
	public Videojuego(){
		this.titulo="";
		this.horasEstimadas=HORAS_DEF;
		this.entregado=ENTREGADO_DEF;
		this.g�nero="";
		this.compa��a="";
	}
	public Videojuego(String titulo, byte horasEstimadas){
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.entregado=ENTREGADO_DEF;
		this.g�nero="";
		this.compa��a="";
	
	}
	public Videojuego(String titulo, byte horasEstimadas, String g�nero,
			String compa��a) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.g�nero = g�nero;
		this.compa��a = compa��a;
	}
	public void entregar() {
		this.entregado=true;
	}
	public void devolver() {
		this.entregado=false;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public byte compareTo(Object a) {
		byte comparaci�n;
		Videojuego v=(Videojuego) a;
		if(this.horasEstimadas==v.getHorasEstimadas()){
			comparaci�n=IGUAL;
			return comparaci�n;
		}else if(this.horasEstimadas<v.getHorasEstimadas()){
			comparaci�n=MENOR;
			return comparaci�n;
		}else{
			comparaci�n=MAYOR;
			return comparaci�n;
		}
	}
}
