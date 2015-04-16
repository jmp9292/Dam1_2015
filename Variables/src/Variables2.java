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
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
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
		
		//Visualizar variable
		
		//conversiones
		//1
		pruebaString=Integer.toString(valor);
		//añadir datos conviertiendo el float "decimal" a string
		pruebaDecimales=Float.toString(decimal);
		//añadir datos conviertiendo el float "decimal" a string
		pruebaBoolean=Boolean.toString(si);
		
		
		
		
		
		
	}
}
