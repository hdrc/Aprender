package conversorMonedas;

import javax.swing.JOptionPane;

public class ConversiónMonedasGE {
	public static void guaraniDolar(double guarani, String moneda) {
		double dolar = guarani / 4703;
		String fDolar = String.format("%,.2f", dolar);
		String fGuarani = String.format("%,.0f", guarani);
		JOptionPane.showMessageDialog(null, fGuarani + " guaranies= " + fDolar
				+ " Dólares");
	}

	public static void guaraniReal(double guarani, String moneda) {
		double real = guarani / 1761;
		String fReal = String.format("%,.2f", real);
		String fGuarani = String.format("%,.0f", guarani);
		JOptionPane.showMessageDialog(null, fGuarani + " guaranies= " + fReal
				+ " Reales");
	}

	public void ejecutar() {
		int reintentar;
		double guarani = 0;

		do {
			reintentar = JOptionPane.NO_OPTION;
			String tGuarani = JOptionPane
					.showInputDialog("Escribir la canidad de guaraníes");
			if (tGuarani.matches("\\d*")) {
				guarani = Double.parseDouble(tGuarani);
				String moneda = JOptionPane
						.showInputDialog("¿A qué moneda convertir?\nReal o Dolar");

				if (moneda.equalsIgnoreCase("real"))
					guaraniReal(guarani, moneda);
				else if (moneda.equalsIgnoreCase("dolar"))
					guaraniDolar(guarani, moneda);
				else
					reintentar = JOptionPane
					.showConfirmDialog(
							null,
							"Sólo pueden ser Dólares o Reales\n¿Intentar otra vez?",
							"Reintentar", JOptionPane.YES_NO_OPTION,
							JOptionPane.ERROR_MESSAGE);
			} else
				reintentar = JOptionPane
				.showConfirmDialog(
						null,
						"Sólo se permiten números enteros\n¿Intentar otra vez?",
						"Reintentar", JOptionPane.YES_NO_OPTION,
						JOptionPane.ERROR_MESSAGE);

		} while (reintentar == JOptionPane.YES_OPTION);

	}
}
