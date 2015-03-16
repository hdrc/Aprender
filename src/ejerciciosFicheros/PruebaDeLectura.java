package ejerciciosFicheros;

import java.io.FileReader;
import java.io.IOException;

public class PruebaDeLectura {

	public static void main(String[] args){
		try{
			FileReader fr=new FileReader("E:\\ejercicio.txt");
			int valor=fr.read();
			while(valor!=-1){
				if (valor!=32) {
					System.out.print((char) valor);
				}
				valor = fr.read();
			}
			fr.close();
		}catch(IOException e){  
		}
	}
}
