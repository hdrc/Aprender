package series;

public class Serie implements Entregable{
	//Constantes
	private final byte TEMPORADAS_DEF=3;
	private final boolean ENTREGADO_DEF=false;
	public final static byte MENOR=-1;
	public final byte IGUAL=0;
	public final static byte MAYOR=1;
	
	//Atributos
	private String titulo;
	private byte numeroDeTemporadas;
	private boolean entregado;
	private String g�nero;
	private String creador;
	
	//Setters y getters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public byte getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}
	public void setNumeroDeTemporadas(byte numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	//M�todos
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDeTemporadas="
				+ numeroDeTemporadas + ", entregado=" + entregado + ", g�nero="
				+ g�nero + ", creador=" + creador + "]";
	}
	//Constructores
	public Serie(){
		this.titulo="";
		this.numeroDeTemporadas=TEMPORADAS_DEF;
		this.entregado=ENTREGADO_DEF;
		this.g�nero="";
		this.creador="";
	}
	public Serie(String titulo, String creador){
		this.titulo=titulo;
		this.creador=creador;
		this.numeroDeTemporadas=TEMPORADAS_DEF;
		this.entregado=ENTREGADO_DEF;
		this.g�nero="";
	}
	public Serie(String titulo,byte numeroDeTemporadas,String g�nero,String creador){
		this.titulo=titulo;
		this.numeroDeTemporadas=numeroDeTemporadas;
		this.g�nero=g�nero;
		this.creador=creador;
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
		Serie s=(Serie)a;
		byte comparaci�n;
		if(this.numeroDeTemporadas==s.getNumeroDeTemporadas()){
			 comparaci�n=IGUAL;
			 return comparaci�n;
		}else if(this.numeroDeTemporadas<s.getNumeroDeTemporadas()){
			comparaci�n=MENOR;
			return comparaci�n;
		}else{
			comparaci�n=MAYOR;
			return comparaci�n;
		}
	}
}
