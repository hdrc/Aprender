package aplicacionesGráficas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser extends JFrame {

	private static final long serialVersionUID = -3705251562688110242L;
	private JPanel contentPane;
	private JTextField txtInsertaLaRuta;
	private JTextArea textArea;
	private JButton btnGuardar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileChooser frame = new FileChooser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FileChooser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtInsertaLaRuta = new JTextField();
		txtInsertaLaRuta.setText("Inserta la ruta del archivo");
		txtInsertaLaRuta.setBounds(52, 26, 209, 20);
		contentPane.add(txtInsertaLaRuta);
		txtInsertaLaRuta.setColumns(10);
		
		JButton btnSeleccionar = new JButton("Seleccionar...");
		btnSeleccionar.setBounds(288, 25, 109, 23);
		contentPane.add(btnSeleccionar);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(52, 76, 360, 156);
		
		JScrollPane scroll=new JScrollPane(textArea);
		scroll.setBounds(52, 76, 360, 156);
		contentPane.add(scroll);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(323, 239, 89, 23);
		contentPane.add(btnGuardar);
		
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Abrir archivos
				//Creamos el objeto JFileChooser
				JFileChooser fc=new JFileChooser();
				
				/*Indicar qué se puede seleccionar, en este ejemplo, archivos y directorios
				 otras opciones son:
				 FILES_ONLY: Solo ficheros; DIRECTORIES_ONLY: Solo directorios*/
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				//Para seleccionar varios ficheros
				
				 
				//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
				int seleccion=fc.showOpenDialog(contentPane);
				 
				//Filtro de extensiones
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
				fc.setFileFilter(filtro);
				//Si el usuario, pincha en aceptar
				if(seleccion==JFileChooser.APPROVE_OPTION){
				
				    //Seleccionamos el fichero
				    File fichero=fc.getSelectedFile();
				 
				    //Ecribe la ruta del fichero seleccionado en el campo de texto
				    txtInsertaLaRuta.setText(fichero.getAbsolutePath());
				 
				    try(FileReader fr=new FileReader(fichero)){
				        String cadena="";
				        int valor=fr.read();
				        while(valor!=-1){
				            cadena=cadena+(char)valor;
				            valor=fr.read();
				        }
				        textArea.setText(cadena);
				    } catch (IOException e1) {
				        e1.printStackTrace();
				    }
				}
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Guardar archivos
				JFileChooser fc=new JFileChooser();
				int selección=fc.showSaveDialog(contentPane);
				if(selección==JFileChooser.APPROVE_OPTION){
					File fichero=fc.getSelectedFile();
					try(FileWriter fw=new FileWriter(fichero)){
						fw.write(textArea.getText());
					}catch (IOException e1){
						e1.printStackTrace();
					}
				}
			}
		});
	}
}
