package micro.mini.projet;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import micro.Dao.ClientDao;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ClientSW {

	private JFrame frmCabinet;

	
	
	Connection con = null;
	PreparedStatement prep = null;
	ResultSet result = null;
	
	
	private JTextField textversion;
	private JPasswordField texttitre;
	private JTextField textnom;
	private JPasswordField textprenom;
	
	
	

	public ClientSW() {
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
		
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		
				frmCabinet.dispose();
				home h= new home();
		
			}
		});
		btnQuitter.setForeground(new Color(0, 0, 0));
		btnQuitter.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnQuitter.setBackground(new Color(0, 139, 139));
		btnQuitter.setBounds(466, 283, 208, 33);
		frmCabinet.getContentPane().add(btnQuitter);
		
		JButton btnSuprimer = new JButton("Suprimer");
		btnSuprimer.setForeground(Color.BLACK);
		btnSuprimer.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnSuprimer.setBackground(new Color(0, 139, 139));
		btnSuprimer.setBounds(466, 239, 208, 33);
		frmCabinet.getContentPane().add(btnSuprimer);
		
		JButton button_2 = new JButton("Ajouter");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed() {
			
				}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Sitka Text", Font.BOLD, 11));
		button_2.setBackground(new Color(0, 139, 139));
		button_2.setBounds(466, 152, 208, 33);
		frmCabinet.getContentPane().add(button_2);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setForeground(Color.BLACK);
		btnModifier.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnModifier.setBackground(new Color(0, 139, 139));
		btnModifier.setBounds(466, 195, 208, 33);
		frmCabinet.getContentPane().add(btnModifier);
		
		textversion = new JTextField();
		textversion.setToolTipText("");
		textversion.setColumns(10);
		textversion.setBounds(188, 152, 179, 23);
		frmCabinet.getContentPane().add(textversion);
		
		texttitre = new JPasswordField();
		texttitre.setBounds(188, 189, 179, 23);
		frmCabinet.getContentPane().add(texttitre);
		
		textnom = new JTextField();
		textnom.setToolTipText("");
		textnom.setColumns(10);
		textnom.setBounds(188, 223, 179, 23);
		frmCabinet.getContentPane().add(textnom);
		
		textprenom = new JPasswordField();
		textprenom.setBounds(188, 257, 179, 23);
		frmCabinet.getContentPane().add(textprenom);
		
		JLabel lblVersion = new JLabel("Version");
		lblVersion.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblVersion.setBounds(41, 152, 137, 23);
		frmCabinet.getContentPane().add(lblVersion);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblPrnom.setBounds(41, 257, 137, 23);
		frmCabinet.getContentPane().add(lblPrnom);
		
		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblTitre.setBounds(41, 189, 137, 23);
		frmCabinet.getContentPane().add(lblTitre);
		
		JLabel lblNom = new JLabel("Nom ");
		lblNom.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNom.setBounds(41, 223, 137, 23);
		frmCabinet.getContentPane().add(lblNom);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setForeground(new Color(0, 128, 128));
		lblClient.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		lblClient.setBounds(303, 67, 160, 23);
		frmCabinet.getContentPane().add(lblClient);
		
	
	
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientSW window = new ClientSW();
					window.frmCabinet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}





}

	