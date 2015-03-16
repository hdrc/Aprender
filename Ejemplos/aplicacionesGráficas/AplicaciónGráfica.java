package aplicacionesGráficas;

import javax.swing.*;

@SuppressWarnings("serial")
public class AplicaciónGráfica extends JFrame{
	//Panel de la aplicación
	private JPanel contentPane;
	//Constructor
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AplicaciónGráfica(){
		//Añadir un título
		setTitle("Titulo de la ventana");
		
		setBounds(400, 200, 607, 448);//(coordenada x,coordenada y, altura, longitud)
		
		//Cerrar la aplicación al cerrar la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Hacer visible la ventana
		setVisible(true);
		
		//Crear el panel
		contentPane=new JPanel();
		
		//Indicar su diseño
		contentPane.setLayout(null);
		
		//Asignar el panel a la ventana
		setContentPane(contentPane);
		
		//Crear un componente(etiqueta)
		JLabel etiqueta=new JLabel("¡Holaaaa!");
		
		//Colocar el componente
		etiqueta.setBounds(60, 20, 100, 20);
		
		//Añadir el componente al panel
		contentPane.add(etiqueta);
		
		//Campo de texto
		JTextField textField = new JTextField();
		textField.setBounds(43, 67, 86, 26);
		contentPane.add(textField);
		
		//Botón
		JButton botón=new JButton("Pulsame");
		botón.setBounds(43, 133, 89, 23);
		contentPane.add(botón);
		
		//Botón radio
		JRadioButton opcion1=new JRadioButton("Opcion 1", true);
		opcion1.setBounds(43, 194, 109, 23);
		contentPane.add(opcion1);
		
		JRadioButton opcion2=new JRadioButton("Opcion 2",false);
		opcion2.setBounds(43, 220, 109, 23);
		contentPane.add(opcion2);
		
		JRadioButton opcion3=new JRadioButton("Opcion 3",false);
		opcion3.setBounds(43, 246, 109, 23);
		contentPane.add(opcion3);
		
		ButtonGroup bgroup=new ButtonGroup();
		bgroup.add(opcion1);
		bgroup.add(opcion2);
		bgroup.add(opcion3);
		
		//Botón checkbox
		JCheckBox o1=new JCheckBox("Opción 1",true);
		o1.setBounds(43, 305, 97, 23);
		contentPane.add(o1);
		
		JCheckBox o2=new JCheckBox("Opción 2",true);
		o2.setBounds(43, 325, 97, 23);
		contentPane.add(o2);
		
		JCheckBox o3=new JCheckBox("Opción 3", false);
		o3.setBounds(43, 346, 97, 23);
		contentPane.add(o3);
		
		//Área de texto
		JTextArea textArea=new JTextArea("prueba");
		textArea.setBounds(189, 18, 141, 117);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		contentPane.add(textArea);
		
		//Scroll
		JScrollPane scroll=new JScrollPane(textArea);
		scroll.setBounds(189, 18, 141, 117);
		contentPane.add(scroll);
		
		//Campo de Password
		JPasswordField pwd=new JPasswordField("Hider");
		pwd.setBounds(189, 171, 139, 20);
		contentPane.add(pwd);
		
		//Menú de selección
		JComboBox comboBox=new JComboBox<>();
		comboBox.setBounds(189, 221, 141, 22);
		contentPane.add(comboBox);
		
		comboBox.addItem("Hider");
		comboBox.addItem("Karen");
		comboBox.addItem("Nando");
		
		//Interruptor
		JToggleButton toggle=new JToggleButton("Interruptor",true);
		toggle.setBounds(189, 291, 121, 23);
		contentPane.add(toggle);
		
		//Contador
		JSpinner spinner=new JSpinner();
		spinner.setBounds(371, 20, 29, 20);
		contentPane.add(spinner);
		
		//Lista
		String pelis[]={"Star wars: la venganza de los siths","El señor de los anillos: el retorno del rey",
		"Guerra mundial Z","Revolution","007: Todo o Nada"};
		JList list=new JList<>(pelis);
		list.setBounds(371, 72, 86, 80);
		contentPane.add(list);
		JScrollPane scroll2=new JScrollPane(list);
		scroll2.setBounds(371, 72, 86, 80);
		contentPane.add(scroll2);
	}
}