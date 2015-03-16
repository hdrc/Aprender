package iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIteradores {
	
	//Un iterador sirve para recorrer estructuras dinámicas
	public static void main(String[] args){
		//Crear un ArrayList
		ArrayList<String>lista=new ArrayList<>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		lista.add("Elemento 5");
		
		//Crear un iterador
		Iterator<String>iterador=lista.iterator();
		
		//Usar el método hasNext, para comprobar si hay algún elemento
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
	}

}