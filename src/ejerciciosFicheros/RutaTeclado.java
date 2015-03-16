package ejerciciosFicheros;

import java.io.*;

import javax.swing.JOptionPane;

public class RutaTeclado {
	public static String ruta=JOptionPane.showInputDialog("Ruta del Fichero");
	public static void entrada(){
		
		String texto=JOptionPane.showInputDialog("Texto a introducir");
		
		try {
			FileWriter fw=new FileWriter(ruta);
			fw.write(texto);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void salida(){
		try {
			FileReader fr=new FileReader(ruta);
			try {
				int valor=fr.read();
				while(valor!=-1){
					System.out.print((char)valor);
					valor=fr.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		entrada();
		salida();
	}
}
