package listeners;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;

public class EjemploEvento extends JFrame{
	private static final long serialVersionUID = -1146667553015897003L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox<String> comboBox;
	private JRadioButton rdbtnOpcion;
	private JRadioButton rdbtnOpcion_1;
	private JRadioButton rdbtnOpcion_2;
	private JLabel lblEstasSobreLa;
	private JLabel lblOtro;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					EjemploEvento frame=new EjemploEvento();
					frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public EjemploEvento(){
		setTitle("Titulo de la ventana");
		setBounds(400, 200, 655, 520);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Etiquetas
		JLabel lblEscribeElNombre=new JLabel("Escribe el nombre de una persona");
		lblEscribeElNombre.setBounds(369, 11, 229, 25);
		contentPane.add(lblEscribeElNombre);
		
		lblOtro = new JLabel("Apretaste otro bot\u00F3n");
		lblOtro.setVisible(false);
		lblOtro.setBounds(175, 177, 154, 39);
		contentPane.add(lblOtro);
		
		JLabel lblEligeUnaOpci=new JLabel("Elige una opción");
		lblEligeUnaOpci.setBounds(195, 11, 109, 14);
		contentPane.add(lblEligeUnaOpci);
		
		JLabel lblPulsaElBoton=new JLabel("Pulsa el botón");
		lblPulsaElBoton.setBounds(43, 11, 85, 14);
		contentPane.add(lblPulsaElBoton);
		
		lblEstasSobreLa=new JLabel("Estás sobre la ");
		lblEstasSobreLa.setBounds(158, 126, 192, 14);
		contentPane.add(lblEstasSobreLa);
		
		JLabel lblSoloSePuede=new JLabel("Solo se puede escribir dígitos");
		lblSoloSePuede.setBounds(369, 92, 193, 14);
		contentPane.add(lblSoloSePuede);
		
		JLabel lblNombreElegido=new JLabel("Nombre Elegido");
		lblNombreElegido.setBounds(185, 70, 110, 14);
		contentPane.add(lblNombreElegido);
		
		//Campos de texto
		textField=new JTextField();
		textField.setBounds(369, 35, 193, 26);
		contentPane.add(textField);
		
		textField_1=new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(175, 95, 141, 20);
		contentPane.add(textField_1);
		
		textField_2=new JTextField();
		textField_2.setBounds(379, 121, 126, 20);
		contentPane.add(textField_2);
		
		//Botones
		JButton btnPulsame=new JButton("Pulsame");
		btnPulsame.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPulsame.setBounds(43, 36, 89, 23);
		contentPane.add(btnPulsame);
		
		JButton btnOtroBotn = new JButton("Otro bot\u00F3n");
		btnOtroBotn.setBounds(22, 175, 118, 23);
		contentPane.add(btnOtroBotn);
		
		JButton btnAñadir=new JButton("Añadir");
		btnAñadir.setBounds(371, 124, 89, 23);
		
		//Botones radio
		rdbtnOpcion=new JRadioButton("Opcion 1");
		rdbtnOpcion.setBounds(43, 66, 109, 23);
		contentPane.add(rdbtnOpcion);
		
		rdbtnOpcion_1=new JRadioButton("Opcion 2");
		rdbtnOpcion_1.setBounds(43, 92, 109, 23);
		contentPane.add(rdbtnOpcion_1);
		
		rdbtnOpcion_2=new JRadioButton("Opcion 3");
		rdbtnOpcion_2.setBounds(43, 120, 109, 23);
		contentPane.add(rdbtnOpcion_2);
		
		ButtonGroup bgroup=new ButtonGroup();
		bgroup.add(rdbtnOpcion);
		bgroup.add(rdbtnOpcion_1);
		bgroup.add(rdbtnOpcion_2);
		
		//Menu de opciones
		comboBox=new JComboBox<>();
		comboBox.setBounds(175, 36, 141, 22);
		contentPane.add(comboBox);
		
		comboBox.addItem("Fernando");
		comboBox.addItem("Alberto");
		comboBox.addItem("Arturo");
		
		//Eventos
		btnPulsame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "¡Me has pulsado!");
			}
		});
		//En este caso decidimos convertir el componente en un atributo
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(comboBox.getItemAt(comboBox.getSelectedIndex()));
			}
		});
		btnOtroBotn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblOtro.isVisible()==false){
				lblOtro.setVisible(true);
				}else if(lblOtro.isVisible()==true){
					lblOtro.setVisible(false);
				}
			}
		});
		textField.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				//Si el caracter introducido es un digito
				if(Character.isDigit(e.getKeyChar())){
					//no escribir
					e.consume();
				}
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {		
			}
		});
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
				textField.setText("");
				JOptionPane.showMessageDialog(contentPane, "Nombre añadido");
			}
		});
		rdbtnOpcion.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				lblEstasSobreLa.setText("Estas sobre la ");
			}
			public void mouseEntered(MouseEvent e) {
				lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion.getText());
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		rdbtnOpcion_1.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {	
			}
			public void mousePressed(MouseEvent e) {	
			}
			public void mouseExited(MouseEvent e) {
				lblEstasSobreLa.setText("Estas sobre la ");
			}
			public void mouseEntered(MouseEvent e) {
				lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion_1.getText());
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		rdbtnOpcion_2.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				lblEstasSobreLa.setText("Estas sobre la ");
			}
			public void mouseEntered(MouseEvent e) {
				lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion_2.getText());
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_2.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				//Si el caracter introducido no es un dígito
				if(!Character.isDigit(e.getKeyChar())){
					//no escribir
					e.consume();
				}
			}
			public void keyReleased(KeyEvent e) {		
			}
			public void keyPressed(KeyEvent e) {
			}
		});
	}
}