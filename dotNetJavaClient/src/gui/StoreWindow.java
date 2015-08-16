package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import org.datacontract.schemas._2004._07.servicelibrary.ArrayOfProductDTO;
import org.datacontract.schemas._2004._07.servicelibrary.ProductDTO;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringint.KeyValueOfstringint;

public class StoreWindow {

	private JFrame frame;
	private JList storeList, customerList;

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
		
		storeList = new JList();
		storeList.setBounds(63, 64, 188, 300);
		storeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.getContentPane().add(storeList);
		
		customerList = new JList();
		customerList.setBounds(468, 64, 188, 300);
		customerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.getContentPane().add(customerList);
		
		JButton btnKoopProduct = new JButton("Koop product");
		btnKoopProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buyProduct();
			}
		});
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
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshStore();
			}
		});
		btnRefresh.setBounds(168, 31, 97, 25);
		frame.getContentPane().add(btnRefresh);
		frame.setVisible(true);
	}

	protected void buyProduct() {
		StoreService service = new StoreService();
		IStoreService proxy = service.getBasicHttpBindingIStoreService();
		Object product = storeList.getSelectedValue();
		ArrayOfKeyValueOfstringint orderRows = new ArrayOfKeyValueOfstringint();
		KeyValueOfstringint input = new KeyValueOfstringint();
		input.setKey("something");
		input.setValue(0);
		orderRows.getKeyValueOfstringint().add(input);
		proxy.placeOrder("Lars", orderRows); //TODO: make customer name dynamic
		
	}

	private void refreshStore(){
		StoreService service = new StoreService();
		IStoreService proxy = service.getBasicHttpBindingIStoreService();
		ArrayOfProductDTO productArray = proxy.getProductsInStock();
		List<ProductDTO> products = productArray.getProductDTO();
		DefaultListModel listModel = new DefaultListModel();
		for (ProductDTO p : products){
			listModel.addElement(p); //toString of ProductDTO will print correctly
		}
		storeList.setModel(listModel);
	}
}
