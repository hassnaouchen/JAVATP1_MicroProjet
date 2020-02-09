package micro.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import micro.mini.projet.MyConnection;

public class CreneauxImp implements CreneauxDao {

	Connection con;
	@Override
	public void ajouterCreneaux(Creneaux c) {
		/*con=(Connection) MyConnection.connect();
        String req="INSERT into creneaux (version, Hdebut, Mdebut, Hfin,Mfin) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(req);
            ps.setInt(1, c.getVersion());
            ps.setInt(2, c.getHdebut());
            ps.setInt(3, c.getMdebut());
            ps.setInt(4, c.getHfin());
            ps.setInt(5, c.geMfin());	
            ps.executeUpdate();
        }catch(SQLException e) {
        	e.printStackTrace();
        }*/
            
         
		
	}

	@Override
	public void modifierCreneaux(Creneaux c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suprimerCreneaux(Creneaux c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Creneaux getCreneaux(int idc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Creneaux> getCreneauxt() {
		// TODO Auto-generated method stub
		return null;
	}

}
