package escrituraLecturaDeFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//BuferedWriter y BufferedReader son una versión mejorada de FileWriter y FileReader
public class BufferedReaderWriter {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				"E:\\fichero.txt"));
				BufferedReader br = new BufferedReader(new FileReader(
						"E:\\fichero.txt"));) {

			// Escribir en el fichero
			bw.write("Esto es una prueba usando Buffered");
			bw.newLine();
			bw.write("Seguimos usando Buffered");
			bw.flush();

			// Leer el fichero
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
	}
}
