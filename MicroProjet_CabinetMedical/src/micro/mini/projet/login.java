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
import javax.swing.JPanel;

public class login {

	private JFrame frmCabinet;
	private JTextField txtVv;
	private JPasswordField passwordField;
	
	Connection con = null;
	PreparedStatement prep = null;
	ResultSet result = null;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmCabinet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public login() {
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
		
		JLabel label = new JLabel("Nom utilisateur");
		label.setFont(new Font("Sitka Text", Font.BOLD, 11));
		label.setBounds(453, 102, 137, 23);
		frmCabinet.getContentPane().add(label);
		
		txtVv = new JTextField();
		txtVv.setToolTipText("");
		txtVv.setColumns(10);
		txtVv.setBounds(453, 136, 247, 23);
		frmCabinet.getContentPane().add(txtVv);
		
		JLabel label_1 = new JLabel("Mot de passe");
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 11));
		label_1.setBounds(453, 181, 137, 20);
		frmCabinet.getContentPane().add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(453, 212, 247, 23);
		frmCabinet.getContentPane().add(passwordField);
		
		JCheckBox checkBox = new JCheckBox("Afficher mot passe");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('*');
				}
			}
		});
		checkBox.setForeground(Color.BLACK);
		checkBox.setFont(new Font("Sitka Text", Font.BOLD, 10));
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(453, 264, 219, 20);
		frmCabinet.getContentPane().add(checkBox);
		
		JButton button = new JButton("Connexion");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String pssw =passwordField.getText().toString() ;
				String nom = txtVv.getText().toString();
				
				String sql ="select * from login";
				try {
					prep = con.prepareStatement(sql);
					result= prep.executeQuery();
					int i= 0;
					while(result.next())
					{
						String n1 = result.getString("user");
						String p1 = result.getString("password");
						if(n1.equals(nom) && p1.equals(pssw))
						{
							JOptionPane.showMessageDialog(null, "Connexion réussie ");
							frmCabinet.dispose();
							home f = new home();
							f.setVisible(true);
						}else {
							JOptionPane.showMessageDialog(null, "Connexion echouée || champs vide !!");

						}
					}
					
				}catch(SQLException ee)
				{
					ee.printStackTrace();
					
					
				}
				
		
			}
		});
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("Sitka Text", Font.BOLD, 11));
		button.setBackground(new Color(0, 139, 139));
		button.setBounds(453, 314, 247, 33);
		frmCabinet.getContentPane().add(button);
		
		JLabel lblSeConnecter = new JLabel("Se Connecter");
		lblSeConnecter.setForeground(new Color(0, 128, 128));
		lblSeConnecter.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		lblSeConnecter.setBounds(512, 38, 160, 23);
		frmCabinet.getContentPane().add(lblSeConnecter);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(57, 38, 343, 312);
		frmCabinet.getContentPane().add(panel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(login.class.getResource("/imag/logo.png")));
		panel.add(label_2);
	
	}
}

	