package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class StoreWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreWindow window = new StoreWindow();
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
	public StoreWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(63, 64, 188, 300);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(468, 64, 188, 300);
		frame.getContentPane().add(list_1);
		
		JButton btnKoopProduct = new JButton("Koop product");
		btnKoopProduct.setBounds(121, 374, 130, 25);
		frame.getContentPane().add(btnKoopProduct);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setBounds(478, 377, 56, 16);
		frame.getContentPane().add(lblSaldo);
		
		JLabel label = new JLabel("50.00");
		label.setBounds(546, 377, 56, 16);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Winkel voorraad");
		lblNewLabel.setBounds(63, 35, 93, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gekochte producten");
		lblNewLabel_1.setBounds(468, 35, 113, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(168, 31, 97, 25);
		frame.getContentPane().add(btnRefresh);
	}
}
