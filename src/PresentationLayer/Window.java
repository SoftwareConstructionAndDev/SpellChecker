package PresentationLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LogicLayer.UrduString;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String urduTextTmp="";
	/**
	 * Launch the application.
	 */
	public static void showWindow(UrduString txt) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window(txt);
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
	public Window(UrduString urdutext) {
		setTitle("اردو سپیل چیکر");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(40, 55, 388, 74);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("تصدیک کریں");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				urdutext.setTxt(textField.getText());
				//=textField.getText();
				//System.out.print(textField.getText());
			}
		});
		btnNewButton.setBounds(311, 141, 117, 29);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 177, 380, 48);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("اپنا  جملہ لکھئے");
		lblNewLabel.setBounds(322, 22, 104, 20);
		contentPane.add(lblNewLabel);
	}
}