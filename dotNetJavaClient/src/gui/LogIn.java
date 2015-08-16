package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.datacontract.schemas._2004._07.servicelibrary.CustomerDTO;
import org.tempuri.IStoreService;
import org.tempuri.IStoreServiceAuthenticateCustomerErrorMessageFaultFaultMessage;
import org.tempuri.StoreService;



public class LogIn {
	
	//CARD VARIABLES
	JPanel cards;
	final static String LOGIN = "Login";
	final static String REGISTER = "Register";
	final static int extraWindowWidth = 100;

	public void addComponentToPane(Container pane) {
		JTabbedPane tabbedPane = new JTabbedPane();
		
		//Create the "cards".
		JPanel card1 = new JPanel() {
			//Make the panel wider than it really needs, so
            //the window's wide enough for the tabs to stay
            //in one row.
			public Dimension getPreferredSize() {
				Dimension size = super.getPreferredSize();
				size.width += extraWindowWidth;
				return size;
			}
		};
		card1.setLayout(null);
		Insets insets = card1.getInsets();
		JLabel username = new JLabel("Username");
		Dimension size = username.getPreferredSize();
		username.setBounds(30+insets.left, 30+insets.top, size.width, size.height);
		card1.add(username);
		JTextField usernameField = new JTextField();
		size = usernameField.getPreferredSize();
		usernameField.setBounds(120+insets.left, 30+insets.top, 100, size.height);
		card1.add(usernameField);
		JLabel password = new JLabel("Password");
		size = password.getPreferredSize();
		password.setBounds(30+insets.left, 60+insets.top, size.width, size.height);
		card1.add(password);
		JTextField passwordField = new JTextField();
		size = passwordField.getPreferredSize();
		passwordField.setBounds(120+insets.left, 60+insets.top, 100, size.height);
		card1.add(passwordField);
		JButton login = new JButton("Login");
		size = login.getPreferredSize();
		login.setBounds(260+insets.left, 60+insets.top, size.width, size.height);
		login.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				StoreService storeService = new StoreService();
				IStoreService proxy = storeService.getBasicHttpBindingIStoreService();
				try {
					CustomerDTO customer = proxy.authenticate(usernameField.getText(), passwordField.getText());
					JOptionPane.showMessageDialog(pane, "succes!!");	
				} catch (IStoreServiceAuthenticateCustomerErrorMessageFaultFaultMessage e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
		card1.add(login);
		
		JPanel card2 = new JPanel() {
			public Dimension getPreferredSize() {
				Dimension size = super.getPreferredSize();
				size.width += extraWindowWidth;
				return size;
			}
		};
		card2.setLayout(null);
		insets = card2.getInsets();
		JLabel newUser = new JLabel("Username");
		size = newUser.getPreferredSize();
		newUser.setBounds(30+insets.left, 30+insets.top, size.width, size.height);
		card2.add(newUser);
		JTextField newUserField = new JTextField();
		size = newUserField.getPreferredSize();
		newUserField.setBounds(120+insets.left,30+insets.top,100,size.height);
		card2.add(newUserField);
		JButton register = new JButton("Register");
		size = register.getPreferredSize();
		register.setBounds(260+insets.left, 60+insets.top, size.width, size.height);
		register.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO handle the register event
				
			}
		});
		card2.add(register);
		
		
		tabbedPane.add(LOGIN,card1);
		tabbedPane.add(REGISTER,card2);
		
		pane.add(tabbedPane, BorderLayout.CENTER);
	}
	
	private static void createAndShowGUI() {
		//Create and set up the window
		JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create and set up the content pane
		LogIn content = new LogIn();
		content.addComponentToPane(frame.getContentPane());
		
		//Display the window
		frame.pack();
		frame.setSize(400, 250);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
}
