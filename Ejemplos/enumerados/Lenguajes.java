package enumerados;

//Ejemplo de tipo enumerado
public enum Lenguajes{
//Entre paréntesis se pueden agregar valores(Ej: años de aprendizaje), para eso se necesita un constructor, como el que está más abajo
	JAVA(4),
	PHP(2),
	C(5),
	PERL(6),
	RUBY(3),
	PYTHON(4);
	
	//Atributo
	int añosAprendizaje;
	
	//Constructor necesaro para agregar valores a las constantes
	Lenguajes(int añosAprendizaje){
		this.añosAprendizaje=añosAprendizaje;
	}
	
	//Método que devuelve el valor
	public int getAñosAprendizaje(){
		return añosAprendizaje;
	}
}