package enumerados;

public class ProgramadorApp {
	//Ejemplo de uso de tipo enumerado
	public static void main(String[] args) {
		Programador programador1=new Programador("Fernando", 23, Lenguajes.JAVA);
		Programador programador2=new Programador("Alberto", 27, Lenguajes.PHP);
		Programador programador3=new Programador("Sergio", 27, Lenguajes.PYTHON);
		
		System.out.println("La información sobre el programador 1 es la siguiente:\n"+
			"Nobmre: "+programador1.getNombre()+"\n"+
			"Edad: "+programador1.getEdad()+"\n"+
			"Es experto en: "+programador1.getExpertoEn()+"\n");
		System.out.println("La información sobre el programador 2 es la siguiente:\n"+
				"Nobmre: "+programador2.getNombre()+"\n"+
				"Edad: "+programador2.getEdad()+"\n"+
				"Es experto en: "+programador2.getExpertoEn()+"\n");
		System.out.println("La información sobre el programador 3 es la siguiente:\n"+
				"Nobmre: "+programador3.getNombre()+"\n"+
				"Edad: "+programador3.getEdad()+"\n"+
				"Es experto en: "+programador3.getExpertoEn()+"\n");
		
	//Operaciones con tipos enumerados
	//En este ejemplo, contar cuántos expertos en java hay
		Programador programadores[]=new Programador[3];
		programadores[0]=new Programador("Fernando", 23, Lenguajes.JAVA);
		programadores[1]=new Programador("Alberto", 27, Lenguajes.PHP);
		programadores[2]=new Programador("Sergio", 30, Lenguajes.PYTHON);
		
		byte contador=0;
		for (int i = 0; i < programadores.length; i++) {
			if (programadores[i].getExpertoEn() == Lenguajes.JAVA) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+" experto/s en Java");
		
		//Otro ejemplo, contar los años de aprendizaje
		byte contarAñosAprendizaje=0;
		for(byte i=0;i<programadores.length;i++){
			contarAñosAprendizaje+=programadores[i].getExpertoEn().getAñosAprendizaje();
		}
		System.out.println("La suma de los años de aprendizaje de los programadores es de "+contarAñosAprendizaje+"años");
	}
}