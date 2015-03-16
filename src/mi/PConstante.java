package mi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class PConstante {

	public static void main(String[] args) {
		final double PRECIO = 365.45;
		int m1, m2, consumo;

		String text_d1 = JOptionPane.showInputDialog("Medida 1");
		m1 = Integer.parseInt(text_d1);

		String text_d2 = JOptionPane.showInputDialog("Medida 2");
		m2 = Integer.parseInt(text_d2);

		consumo = m2 - m1;
		System.out.println(">>" + consumo);
		double c = PRECIO * consumo;
		System.out.println(">>" + c);
		double costo = Math.round(c);
		System.out.println(">>" + costo);
		String fCosto = String.format("%,.0f", costo);
		JOptionPane.showMessageDialog(null, "El costo es " + fCosto
				+ " Gs, y el consumo es " + consumo + "KWh");
		try (FileWriter fw = new FileWriter("E:\\nota.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Costo:" + fCosto + "Gs Consumo:" + consumo + "KWh");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
	}

}
