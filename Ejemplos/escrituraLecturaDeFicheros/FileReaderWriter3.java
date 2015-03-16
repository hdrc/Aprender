package escrituraLecturaDeFicheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Usar FileReader y FileWriter por medio de m�todos
public class FileReaderWriter3 {

	// M�todo para escribir un fichero
	public static void escribeFichero(FileWriter fw) throws IOException {
		fw.write("Esto es una pureba");
	}

	// M�todo para leer un fichero
	public static void leeFichero(FileReader fr) throws IOException {
		int valor = fr.read();
		while (valor != -1) {
			System.out.print((char) valor);
			valor = fr.read();
		}
	}

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("E:\\fichero3.doc");
				FileReader fr = new FileReader("E:\\fichero3.doc");) {
			escribeFichero(fw);
			fw.flush();
			leeFichero(fr);
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
	}
}