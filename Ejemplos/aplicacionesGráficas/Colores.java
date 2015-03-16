package aplicacionesGráficas;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colores extends JFrame {
	private static final long serialVersionUID = 1924480387647658432L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colores frame = new Colores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Colores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Elige un color");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Cuadro de selección de colores
				Color color=JColorChooser.showDialog(contentPane, "Elige un color",Color.BLACK);
				
				//Cambiar el color de fondo de la etiqueta
				lblNewLabel.setBackground(color);
				lblNewLabel.setOpaque(true);
				lblNewLabel_1.setForeground(color);
			}
		});
		btnNewButton.setBounds(10, 60, 137, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(185, 64, 154, 91);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Muestra de color");;
		lblNewLabel_1.setBounds(215, 39, 106, 14);
		contentPane.add(lblNewLabel_1);
	}
}