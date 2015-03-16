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
	private String género;
	private String compañía;
	
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
	public String getGénero() {
		return género;
	}
	public void setGénero(String género) {
		this.género = género;
	}
	public String getCompañía() {
		return compañía;
	}
	public void setCompañía(String compañía) {
		this.compañía = compañía;
	}
	//Métodos
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas="
				+ horasEstimadas + ", entregado=" + entregado + ", género="
				+ género + ", compañía=" + compañía + "]";
	}
	//Constructores
	public Videojuego(){
		this.titulo="";
		this.horasEstimadas=HORAS_DEF;
		this.entregado=ENTREGADO_DEF;
		this.género="";
		this.compañía="";
	}
	public Videojuego(String titulo, byte horasEstimadas){
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.entregado=ENTREGADO_DEF;
		this.género="";
		this.compañía="";
	
	}
	public Videojuego(String titulo, byte horasEstimadas, String género,
			String compañía) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.género = género;
		this.compañía = compañía;
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
		byte comparación;
		Videojuego v=(Videojuego) a;
		if(this.horasEstimadas==v.getHorasEstimadas()){
			comparación=IGUAL;
			return comparación;
		}else if(this.horasEstimadas<v.getHorasEstimadas()){
			comparación=MENOR;
			return comparación;
		}else{
			comparación=MAYOR;
			return comparación;
		}
	}
}
