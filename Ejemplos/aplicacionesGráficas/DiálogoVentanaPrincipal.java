package aplicacionesGráficas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//Ventana principal
public class DiálogoVentanaPrincipal extends JFrame {
	private static final long serialVersionUID = -6293695083260431779L;
	private JPanel contentPane;
	private DiálogoVentanaPrincipal frame;//Atributo del mismo tipo que la clase
	private JTextField textField;
	private JLabel lblNombreYApellido;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiálogoVentanaPrincipal frame = new DiálogoVentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public DiálogoVentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Componentes
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(48, 110, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNombreYApellido = new JLabel("Nombre y apellido fusionados");
		lblNombreYApellido.setBounds(48, 71, 159, 14);
		contentPane.add(lblNombreYApellido);
		
		JButton btnAbrirDilogo = new JButton("Abrir di\u00E1logo");
		btnAbrirDilogo.setBounds(251, 109, 141, 23);
		contentPane.add(btnAbrirDilogo);
		
		//Eventos
		btnAbrirDilogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Crear un objeto diálogo, y pasarle el atributo frame
				EjemploDiálogo dialogo=new EjemploDiálogo(frame);
				//Hacer visible la ventana de diálogo
				dialogo.setVisible(true);
				//Cuando pulsemos ok en el diálogo:
				if(dialogo.isPulsoOK()){
					String nombre=dialogo.getNombre();
					String apellido=dialogo.getApellido();
					
					textField.setText(nombre+" "+apellido);
				}
			}
		});
	}
}