package micro.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import micro.mini.projet.MyConnection;

public class ClientImp implements ClientDao{
	
	Connection con;
	public ClientImp()
	{
		
	}
	

	@Override
	
	public void ajouterClient(Client c) {
		con=(Connection) MyConnection.connect();
        String req="INSERT into client(version, titre, nom, prenom) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(req);
            ps.setInt(1, c.getVersion());
            ps.setString(2, c.getTitre());
            ps.setString(3, c.getNom());
            ps.setString(4, c.getPrenom());
            
            ps.executeUpdate();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
		
	}

	public void modifierClient(Client client) {
		con=(Connection) MyConnection.connect();
        String req="UPDATE client SET version=?, titre=? , nom=?, prenom=? where id_client=?";
        try {
            PreparedStatement ps= con.prepareStatement(req);
            ps.setInt(1, client.getVersion());
            ps.setString(2, client.getTitre());
            ps.setString(3, client.getNom());
            ps.setString(4, client.getPrenom());
            ps.setInt(5, client.getid());
            int i=ps.executeUpdate();  
            System.out.println(i+" a modifier");  

        } catch (SQLException e) {
        	e.printStackTrace();
        }
		
	}

	
	
	@Override
	public Client getClient(int id) {
		Client client=null;
		con=(Connection) MyConnection.connect();
        String req="Select version, titre, nom,prenom from Client WHERE id_client=?";
        try {
           PreparedStatement ps= con.prepareStatement(req);
           
			ps.setInt(1,id);
            ResultSet res=(ResultSet) ps.executeQuery();
            if(res.next()) {
            	client=new Client(id,res.getInt("version"),res.getString("titre"),res.getString("nom"),res.getString("prenom"));
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
		return client;
	}


	public List<Client> getClient() {
		Client client=null;
		List<Client> lc=new ArrayList<>();
		con=(Connection) MyConnection.connect();
        String req="Select * From Client";
        try {
            PreparedStatement ps= con.prepareStatement(req);
            ResultSet res=(ResultSet) ps.executeQuery();
            while(res.next()) {
            	Client c=new Client(res.getInt("id_client"),res.getInt("version"),res.getString("titre"),res.getString("nom"),res.getString("prenom"));
            	lc.add(c);
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
		return lc;
	}




	@Override
	public void suprimerClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	

}
