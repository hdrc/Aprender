package enumerados;

//Ejemplo de tipo enumerado
public enum Lenguajes{
//Entre par�ntesis se pueden agregar valores(Ej: a�os de aprendizaje), para eso se necesita un constructor, como el que est� m�s abajo
	JAVA(4),
	PHP(2),
	C(5),
	PERL(6),
	RUBY(3),
	PYTHON(4);
	
	//Atributo
	int a�osAprendizaje;
	
	//Constructor necesaro para agregar valores a las constantes
	Lenguajes(int a�osAprendizaje){
		this.a�osAprendizaje=a�osAprendizaje;
	}
	
	//M�todo que devuelve el valor
	public int getA�osAprendizaje(){
		return a�osAprendizaje;
	}
}