package convertir;

import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class NuevoConversor extends JFrame {

	private static final long serialVersionUID = 6788083430955111035L;
	private JPanel contentPane;
	private JTextField gTextField,dTextField,rTextField;
	private JLabel lblGuaran,lblDlar,lblReal,lblDValor,lblRValor,lblGValor,lblConversorDeMonedas,lblAdvInternet;
	private JButton btnCalcular,btnCalcular_1;
	private JMenuBar menuBar;
	private JMenuItem mntmNuevoCálculo,mntmValorReal,mntmValorDlar,mntmConsultarValoresActuales;
	private int vReal=leerReal(),vDolar=leerDólar();
	private JMenu mnAyuda;
	private JLabel lblDolarActual;
	private JLabel lblRealActual;

	public NuevoConversor() {
		setTitle("Convetir");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 235);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNuevo = new JMenu("Nuevo");
		menuBar.add(mnNuevo);
		
		mntmNuevoCálculo = new JMenuItem("Nuevo c\u00E1lculo");
		mnNuevo.add(mntmNuevoCálculo);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		mntmValorReal = new JMenuItem("Valor Real");
		mnEditar.add(mntmValorReal);
		
		mntmValorDlar = new JMenuItem("Valor D\u00F3lar");
		mnEditar.add(mntmValorDlar);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmConsultarValoresActuales = new JMenuItem("Consultar informaci\u00F3n actualizada");
		mnAyuda.add(mntmConsultarValoresActuales);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblGuaran = new JLabel("Guaran\u00ED");
		lblGuaran.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGuaran.setBounds(30, 53, 59, 20);
		contentPane.add(lblGuaran);
		
		lblDlar = new JLabel("D\u00F3lar");
		lblDlar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDlar.setBounds(133, 50, 38, 27);
		contentPane.add(lblDlar);
		
		lblReal = new JLabel("Real");
		lblReal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblReal.setBounds(228, 56, 49, 14);
		contentPane.add(lblReal);
		
		gTextField = new JTextField();
		gTextField.setBounds(10, 84, 86, 20);
		contentPane.add(gTextField);
		gTextField.setColumns(10);
		gTextField.setText("");
		
		lblDValor = new JLabel("Valor");
		lblDValor.setBounds(133, 81, 78, 27);
		contentPane.add(lblDValor);
		
		lblRValor = new JLabel("Valor");
		lblRValor.setBounds(227, 81, 74, 27);
		contentPane.add(lblRValor);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(309, 83, 89, 23);
		contentPane.add(btnCalcular);
		
		lblGValor = new JLabel("Valor");
		lblGValor.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblGValor.setBounds(20, 115, 69, 27);
		contentPane.add(lblGValor);
		
		dTextField = new JTextField();
		dTextField.setText("0");
		dTextField.setColumns(10);
		dTextField.setBounds(105, 118, 86, 20);
		contentPane.add(dTextField);
		
		rTextField = new JTextField();
		rTextField.setText("0");
		rTextField.setColumns(10);
		rTextField.setBounds(213, 118, 86, 20);
		contentPane.add(rTextField);
		
		btnCalcular_1 = new JButton("Calcular");
		btnCalcular_1.setBounds(309, 117, 89, 23);
		contentPane.add(btnCalcular_1);
		
		lblConversorDeMonedas = new JLabel("Conversor de monedas");
		lblConversorDeMonedas.setFont(new Font("Microsoft PhagsPa", Font.ITALIC, 20));
		lblConversorDeMonedas.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblConversorDeMonedas.setBounds(64, 23, 235, 27);
		contentPane.add(lblConversorDeMonedas);
		
		lblAdvInternet = new JLabel("Se necesita conexi\u00F3n a Internet para acceder a esta informaci\u00F3n");
		lblAdvInternet.setVisible(false);
		lblAdvInternet.setBounds(10, 151, 388, 14);
		contentPane.add(lblAdvInternet);
		
		lblDolarActual = new JLabel("D\u00F3lar: "+ vDolar);
		lblDolarActual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDolarActual.setBounds(309, 11, 89, 14);
		contentPane.add(lblDolarActual);
		
		lblRealActual = new JLabel("Real: "+ vReal);
		lblRealActual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRealActual.setBounds(309, 33, 89, 14);
		contentPane.add(lblRealActual);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularME();
			}
		});
		btnCalcular_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularG();
			}
		});
		gTextField.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar())){
					e.consume();
				}
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
			}
		});
		dTextField.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseClicked(MouseEvent e) {
				rTextField.setText("0");
			}
		});
		rTextField.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {	
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseClicked(MouseEvent e) {
				dTextField.setText("0");
			}
		});
		mntmNuevoCálculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				reestablecer();
			}
		});
		mntmValorReal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tReal=JOptionPane.showInputDialog(mntmValorReal,
						"Editar el valor de cambio del Real"+"\nValor actual "+vReal);
				vReal=Integer.parseInt(tReal);
				lblRealActual.setText("Real: "+vReal);
				try(FileWriter fw=new FileWriter("C:\\Valor_del_Real.txt")){
					fw.write(tReal);
					fw.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		mntmValorDlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tDolar=JOptionPane.showInputDialog(mntmValorDlar,
						"Editar el valor de cambio del Dólar"+"\nValor actual "+vDolar);
				vDolar=Integer.parseInt(tDolar);
				lblDolarActual.setText("Dólar: "+vDolar);
				try(FileWriter fw=new FileWriter("C:\\Valor_del_Dólar.txt")){
					fw.write(tDolar);
					fw.close();
				}catch(IOException e1){
					e1.printStackTrace();
				}
			}
		});
		mntmConsultarValoresActuales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enlace("https://www.bcp.gov.py/");
			}
		});
		mntmConsultarValoresActuales.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
				lblAdvInternet.setVisible(false);
			}
			public void mouseEntered(MouseEvent e) {
				lblAdvInternet.setVisible(true);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
	public void reestablecer(){
		lblGValor.setText("Valor");
		lblDValor.setText("Valor");
		lblRValor.setText("Valor");
		dTextField.setText("0");
		rTextField.setText("0");
		gTextField.setText("0");
	}
	public void calcularME(){
		double guarani=Integer.parseInt(gTextField.getText()),dolar=0,real=0;
		dolar=guarani/vDolar;
		real=guarani/vReal;

		String fReal=String.format("%,.2f", real);
		String fDolar=String.format("%,.2f", dolar);
		
		lblDValor.setText(fDolar);
		lblRValor.setText(fReal);
	}
	public void calcularG(){
		double guarani;
		String dGuarani;
		if (!dTextField.getText().equalsIgnoreCase("0")||
			dTextField.getText().equalsIgnoreCase("")) {
			double dolar=Double.parseDouble(dTextField.getText());
			guarani = dolar * vDolar;
			dGuarani = String.format("%,.0f",guarani);
			lblGValor.setText(dGuarani);
		}
		if (!rTextField.getText().equalsIgnoreCase("0")||
			rTextField.getText().isEmpty()) {
			double real = Double.parseDouble(rTextField.getText());
			guarani = real * vReal;
			dGuarani = String.format("%,.0f",guarani);
			lblGValor.setText(dGuarani);
		}
	}
	
	public void enlace (String enlaceAAcceder){
		Desktop enlace=Desktop.getDesktop();
		try {
			enlace.browse(new URI(enlaceAAcceder));
		} catch (IOException | URISyntaxException e) {
			e.getMessage();
		}
	}
	
	public int leerReal(){
		int nvReal=0;
		File archivoR=new File("C:\\Valor_del_Real.txt");
		if (archivoR.exists()) {
			try (FileReader fr = new FileReader(archivoR)) {
				String tReal = "";
				int valor = fr.read();
				while (valor != -1) {
					tReal = tReal + (char) valor;
					valor = fr.read();
				}
				nvReal = Integer.parseInt(tReal);
				return nvReal;

			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(archivoR.exists()==false){
			nvReal=1700;
			try(FileWriter fw=new FileWriter(archivoR)){
				fw.write("1700");
				fw.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			leerReal();
		}
		return nvReal;
	}
	
	public int leerDólar(){
		int nvDólar=0;
		File archivoD=new File("C:\\Valor_del_Dólar.txt");
		if (archivoD.exists()){
			try (FileReader fr = new FileReader(archivoD)) {
				String tDolar = "";
				int valor = fr.read();
				while (valor != -1){
					tDolar = tDolar + (char) valor;
					valor = fr.read();
				}
				nvDólar = Integer.parseInt(tDolar);
				return nvDólar;
			} catch (IOException e){
				e.printStackTrace();
			}
		}else if(archivoD.exists()==false){
			nvDólar=4800;
			try(FileWriter fw=new FileWriter(archivoD)){
				fw.write("4800");
				fw.close();
			}catch(IOException e1){
				e1.printStackTrace();
			}
		}
		return nvDólar;
	}
}