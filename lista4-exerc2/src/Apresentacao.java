import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class Apresentacao {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Curso", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 243, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sigla");
		lblNewLabel_1.setBounds(10, 56, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 72, 35, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar Curso");
		btnNewButton.setBounds(10, 105, 111, 23);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Curso c = new Curso(textField_1.getText().charAt(0), textField.getText());							
						} catch(e) {
							
						}
						
					}
				});
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
	}
}
