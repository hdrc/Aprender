package escrituraLecturaDeFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter2 {

	// Método para escritura
	public static void escribeFichero(BufferedWriter bw) throws IOException {
		bw.write("Esto es una prueba usando Buffered");
		bw.newLine();
		bw.write("Seguimos usando Buffered");
	}

	// Método para lectura
	public static void leeFichero(BufferedReader br) throws IOException {
		String linea = br.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
	}

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				"E:\\ficherox.txt"));
				BufferedReader br = new BufferedReader(new FileReader(
						"E:\\ficherox.txt"));) {

			escribeFichero(bw);
			bw.flush();
			leeFichero(br);
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
	}
}
