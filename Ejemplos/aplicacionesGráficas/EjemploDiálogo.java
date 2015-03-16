package aplicacionesGráficas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
//Cuadro de diálogo
public class EjemploDiálogo extends JDialog {
	private static final long serialVersionUID = -5562610863965829660L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField,textField_1;
	private boolean pulsoOK;
	
	//Indicar un frame como parámetro
	public EjemploDiálogo(JFrame frame) {
		
		//Invocar al constructor padre, el atributo true indica que hasta que no quitemos
		//la ventana, no podremos acceder a otra
		super(frame,true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblEscribeElNombre = new JLabel("Escribe el nombre");
		lblEscribeElNombre.setBounds(24, 28, 133, 14);
		contentPanel.add(lblEscribeElNombre);
		
		textField = new JTextField();
		textField.setBounds(23, 56, 153, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEscribeElApellido = new JLabel("Escribe el apellido");
		lblEscribeElApellido.setBounds(24, 105, 152, 14);
		contentPanel.add(lblEscribeElApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 156, 142, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
		JButton okButton = new JButton("OK");
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
			
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
		
		//Eventos
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsoOK=true;
				setVisible(false);
			}
		});
		//Crear listener
		KeyListener kl=new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(Character.isDigit(e.getKeyChar())){
					e.consume();
				}
			}
			public void keyReleased(KeyEvent e) {		
			}
			public void keyPressed(KeyEvent e) {	
			}
		};
		//Añadir los listeners creados
		textField.addKeyListener(kl);
		textField_1.addKeyListener(kl);
	}
	//Modificar los métodos get, para que devuelva un String
	public String getNombre(){
	return textField.getText();
	}
	public String getApellido(){
		return textField_1.getText();
	}
	
	//Método que va a ser usado en la ventana principal
	public boolean isPulsoOK(){
		return pulsoOK;
	}
}