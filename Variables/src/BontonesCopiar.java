import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BontonesCopiar extends JFrame {

	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BontonesCopiar frame = new BontonesCopiar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BontonesCopiar() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		caja1 = new JTextField();
		caja1.setText("Texto 1");
		caja1.setBounds(10, 46, 86, 20);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		JLabel lblTexto = new JLabel("Texto 1");
		lblTexto.setBounds(10, 22, 46, 14);
		contentPane.add(lblTexto);
		
		JLabel lblTexto_1 = new JLabel("Texto 2");
		lblTexto_1.setBounds(10, 99, 46, 14);
		contentPane.add(lblTexto_1);
		
		caja2 = new JTextField();
		caja2.setEditable(false);
		caja2.setText("Texto 2");
		caja2.setBounds(10, 134, 86, 20);
		contentPane.add(caja2);
		caja2.setColumns(10);
		//Codigo delboton
		JButton btnCopiar = new JButton("COPIAR");
		btnCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("Apretado");
				String textocaja1="";

				textocaja1=caja1.getText();
				caja2.setText(textocaja1);
			}
		});
		btnCopiar.setBounds(128, 73, 89, 23);
		contentPane.add(btnCopiar);
	}
}
