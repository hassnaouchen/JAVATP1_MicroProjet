package micro.mini.projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home {

	private JFrame frmCa;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
					window.frmCa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public home() {
		initialize();
	}

	
	private void initialize() {
		frmCa = new JFrame();
		frmCa.setBackground(new Color(253, 245, 230));
		frmCa.getContentPane().setBackground(new Color(255, 255, 255));
		frmCa.setTitle("CabinetMedical");
		frmCa.setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		frmCa.setBounds(100, 100, 753, 430);
		frmCa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCa.setVisible(true);
		frmCa.setResizable(false);
		frmCa.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 747, 401);
		frmCa.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Client");
	//	btnNewButton.setIcon(new ImageIcon(home.class.getResource("/images/cccc.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCa.dispose();
				ClientSW nn= new ClientSW();
			}
		});
		btnNewButton.setBounds(0, 0, 147, 45);
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(0, 128, 128));
		panel.add(btnNewButton);
		
		JButton btnrv = new JButton("Rendez-vous");
	//	btnMedec.setIcon(new ImageIcon(home.class.getResource("/images/shopping-1705800_960_720.png")));
		btnrv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCa.dispose();
				Rondezvous r= new Rondezvous();
			}
		});
		btnrv.setBounds(150, 0, 151, 45);
		btnrv.setBackground(new Color(0, 128, 128));
		btnrv.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnrv.setBackground(new Color(0, 139, 139));
		panel.add(btnrv);
		
	
		
		
		JButton btnQuitter = new JButton("Quitter");
		//btnQuitter.setIcon(new ImageIcon(home.class.getResource("/images/ferm.jpg")));
		btnQuitter.setBounds(600, 0, 147, 45);
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmCa.dispose();
			}
		});
		btnQuitter.setBackground(new Color(0, 128, 128));
		btnQuitter.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnQuitter.setBackground(new Color(0, 139, 139));
		panel.add(btnQuitter);
		
		JButton btnMedec = new JButton("Medecines");
		btnMedec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCa.dispose();
		Medecine vv = new Medecine();
		
			}
		});
		btnMedec.setBackground(new Color(0, 128, 128));
		btnMedec.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnMedec.setBackground(new Color(0, 139, 139));
		btnMedec.setBounds(450, 0, 147, 45);
		panel.add(btnMedec);
		
		JButton btnCrenaux = new JButton("Creneaux");
		btnCrenaux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCa.dispose();
				CreneauxSw vb = new CreneauxSw();
			}
		});
		
		btnCrenaux.setBackground(new Color(0, 128, 128));
		btnCrenaux.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnCrenaux.setBackground(new Color(0, 139, 139));
		btnCrenaux.setBounds(302, 0, 147, 45);
		panel.add(btnCrenaux);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(190, 95, 437, 280);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(home.class.getResource("/imag/medical.png")));
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
