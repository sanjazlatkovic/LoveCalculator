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
import java.awt.Component;


public class Lovegui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lovegui frame = new Lovegui();
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
	public Lovegui() {
		setTitle("True Love");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(30, 90, 183, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 90, 183, 41);
		contentPane.add(textField_1);
		

		textField_2 = new JTextField();
		textField_2.setBounds(10, 331, 478, 41);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(174, 258, 122, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Izracunaj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String prvoIme = textField.getText();
				String drugoIme = textField_1.getText();
				
				Love l = new Love();
				String novi = Integer.toString(l.racunanje(prvoIme, drugoIme));
				
				
				lblNewLabel.setText(novi);
				textField_2.setText(l.druga(l.racunanje(prvoIme, drugoIme)));
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(195, 182, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
