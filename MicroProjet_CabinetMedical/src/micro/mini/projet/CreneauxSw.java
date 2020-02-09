package micro.mini.projet;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class CreneauxSw {

	private JFrame frmCabinet;
	private JTextField txtVv;
	private JPasswordField passwordField;
	
	Connection con = null;
	PreparedStatement prep = null;
	ResultSet result = null;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreneauxSw window = new CreneauxSw();
					window.frmCabinet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CreneauxSw() {
		initialize();
	}

	private void initialize() {
		frmCabinet = new JFrame();
		frmCabinet.setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		frmCabinet.setTitle("Cabinet Medical");
		frmCabinet.getContentPane().setBackground(new Color(255, 255, 255));
		frmCabinet.setBounds(100, 100, 784, 424);
		frmCabinet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCabinet.getContentPane().setLayout(null);
		frmCabinet.setResizable(false);
		frmCabinet.setVisible(true);
		con= MyConnection.connect();
		
	
		
		txtVv = new JTextField();
		txtVv.setToolTipText("");
		txtVv.setColumns(10);
		txtVv.setBounds(261, 81, 189, 23);
		frmCabinet.getContentPane().add(txtVv);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(261, 148, 189, 23);
		frmCabinet.getContentPane().add(passwordField);
		
		JButton button = new JButton("Quitter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCabinet.dispose();
				home h= new home();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Sitka Text", Font.BOLD, 11));
		button.setBackground(new Color(0, 139, 139));
		button.setBounds(525, 205, 208, 33);
		frmCabinet.getContentPane().add(button);
		
		JButton button_1 = new JButton("Suprimer");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Sitka Text", Font.BOLD, 11));
		button_1.setBackground(new Color(0, 139, 139));
		button_1.setBounds(525, 161, 208, 33);
		frmCabinet.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Modifier");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Sitka Text", Font.BOLD, 11));
		button_2.setBackground(new Color(0, 139, 139));
		button_2.setBounds(525, 117, 208, 33);
		frmCabinet.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Ajouter");
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Sitka Text", Font.BOLD, 11));
		button_3.setBackground(new Color(0, 139, 139));
		button_3.setBounds(525, 74, 208, 33);
		frmCabinet.getContentPane().add(button_3);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(261, 115, 189, 23);
		frmCabinet.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(261, 182, 189, 23);
		frmCabinet.getContentPane().add(textField_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(261, 215, 189, 23);
		frmCabinet.getContentPane().add(passwordField_1);
		
		JLabel label = new JLabel("Version");
		label.setFont(new Font("Sitka Text", Font.BOLD, 11));
		label.setBounds(62, 81, 137, 23);
		frmCabinet.getContentPane().add(label);
		
		JLabel lblHdebut = new JLabel("Hdebut");
		lblHdebut.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblHdebut.setBounds(62, 115, 137, 23);
		frmCabinet.getContentPane().add(lblHdebut);
		
		JLabel lblMdebt = new JLabel("Mdebut");
		lblMdebt.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblMdebt.setBounds(62, 148, 137, 23);
		frmCabinet.getContentPane().add(lblMdebt);
		
		JLabel lblHfin = new JLabel("Hfin");
		lblHfin.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblHfin.setBounds(62, 183, 137, 23);
		frmCabinet.getContentPane().add(lblHfin);
		
		JLabel lblMfin = new JLabel("Mfin");
		lblMfin.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblMfin.setBounds(62, 213, 137, 23);
		frmCabinet.getContentPane().add(lblMfin);
		
		JLabel lblCreneaux = new JLabel("Creneaux");
		lblCreneaux.setForeground(new Color(0, 128, 128));
		lblCreneaux.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		lblCreneaux.setBounds(344, 25, 160, 23);
		frmCabinet.getContentPane().add(lblCreneaux);
	
	}
}

	