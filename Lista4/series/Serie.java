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
	private String género;
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
	public String getGénero() {
		return género;
	}
	public void setGénero(String género) {
		this.género = género;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	//Métodos
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDeTemporadas="
				+ numeroDeTemporadas + ", entregado=" + entregado + ", género="
				+ género + ", creador=" + creador + "]";
	}
	//Constructores
	public Serie(){
		this.titulo="";
		this.numeroDeTemporadas=TEMPORADAS_DEF;
		this.entregado=ENTREGADO_DEF;
		this.género="";
		this.creador="";
	}
	public Serie(String titulo, String creador){
		this.titulo=titulo;
		this.creador=creador;
		this.numeroDeTemporadas=TEMPORADAS_DEF;
		this.entregado=ENTREGADO_DEF;
		this.género="";
	}
	public Serie(String titulo,byte numeroDeTemporadas,String género,String creador){
		this.titulo=titulo;
		this.numeroDeTemporadas=numeroDeTemporadas;
		this.género=género;
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
		byte comparación;
		if(this.numeroDeTemporadas==s.getNumeroDeTemporadas()){
			 comparación=IGUAL;
			 return comparación;
		}else if(this.numeroDeTemporadas<s.getNumeroDeTemporadas()){
			comparación=MENOR;
			return comparación;
		}else{
			comparación=MAYOR;
			return comparación;
		}
	}
}
