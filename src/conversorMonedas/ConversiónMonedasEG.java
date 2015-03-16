package conversorMonedas;

import javax.swing.JOptionPane;

public class ConversiónMonedasEG {
	public static void guaraniDolar(double dolar, String moneda) {
		double guarani = dolar * 4735;
		String fDolar = String.format("%,.2f", dolar);
		String fGuarani = String.format("%,.0f", guarani);
		JOptionPane.showMessageDialog(null, fDolar + " Dólares= " + fGuarani
				+ " Guaranies");
	}

	public static void guaraniReal(double real, String moneda) {
		double guarani = real * 1800;
		String fReal = String.format("%,.2f", real);
		String fGuarani = String.format("%,.0f", guarani);
		JOptionPane.showMessageDialog(null, fReal + " Reales= " + fGuarani
				+ " Guaranies");
	}

	public void ejecutar() {
		int reintentar;
		double guarani = 0;

		do {
			reintentar = JOptionPane.NO_OPTION;
			String tValor = JOptionPane
					.showInputDialog("Escribir un valor para convertir");
			if (tValor.matches("\\d*.?\\d*")) {
				guarani = Double.parseDouble(tValor);
				String moneda = JOptionPane.showInputDialog("¿Real o Dolar?");

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
