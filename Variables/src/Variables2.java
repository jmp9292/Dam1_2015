import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Font;


public class Variables2 extends JFrame {

	private JPanel contentPane;
	
	//definimos caja
	private JTextField cajaTexto;
	private JTextField cajaTexto2;
	private JTextField textField;
	private JTextField cajaTexto3;
	private JTextField cajaTexto4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Variables2 ventana  = new Variables2();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Variables2() {
		//ZONA DE VARIABLES
		int valor = 5;
		String cadenaTexto = "Paco";
		float decimal=2.34f;
		float decimal2,decimal3;
		boolean si = true;
		String pruebaString;
		String pruebaDecimales;
		String pruebaBoolean;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//EL tamaño de la ventana
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//jtextfield para mostrar infomación caja primera
		cajaTexto = new JTextField();
		cajaTexto.setBounds(10, 42, 86, 20);
		contentPane.add(cajaTexto);
		cajaTexto.setColumns(10);
		
		cajaTexto.setText(cadenaTexto);
		//etiqueta
		JLabel lblNewLabel = new JLabel("Nombre, Variable");
		lblNewLabel.setBounds(10, 17, 86, 14);
		contentPane.add(lblNewLabel);
		//caja texto 2
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(10, 73, 86, 20);
		contentPane.add(cajaTexto2);
		cajaTexto2.setColumns(10);
		
		//Visualizar variable
		
		//conversiones
		//1
		pruebaString=Integer.toString(valor);
		cajaTexto2.setText(pruebaString);
		
		textField = new JTextField();
		textField.setBounds(171, 42, 200, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSegundaPrueba = new JLabel("Segunda prueba");
		lblSegundaPrueba.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSegundaPrueba.setBounds(10, 119, 237, 50);
		contentPane.add(lblSegundaPrueba);
		JLabel lblDecimales = new JLabel("Decimales");
		lblDecimales.setBounds(10, 183, 86, 14);
		contentPane.add(lblDecimales);
		
		//creación caja texto 3
		cajaTexto3 = new JTextField();
		cajaTexto3.setText("5");
		cajaTexto3.setColumns(10);
		cajaTexto3.setBounds(10, 203, 86, 20);
		contentPane.add(cajaTexto3);
		//añadir datos conviertiendo el float "decimal" a string
		pruebaDecimales=Float.toString(decimal);
		cajaTexto3.setText(pruebaDecimales);
		
		JLabel lblBooleanos = new JLabel("Booleanos");
		lblBooleanos.setBounds(10, 234, 86, 14);
		contentPane.add(lblBooleanos);
		//creación caja texto 4
		cajaTexto4 = new JTextField();
		cajaTexto4.setText("5");
		cajaTexto4.setColumns(10);
		cajaTexto4.setBounds(10, 254, 86, 20);
		contentPane.add(cajaTexto4);
		//añadir datos conviertiendo el float "decimal" a string
		pruebaBoolean=Boolean.toString(si);
		cajaTexto4.setText(pruebaBoolean);
		
		
		
		
		
		
	}
}
