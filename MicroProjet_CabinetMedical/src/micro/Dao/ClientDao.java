package micro.Dao;

import java.util.List;

import micro.mini.projet.ClientSW;

public interface ClientDao {
	
	
	public void ajouterClient(Client c);
	void modifierClient(Client c);
	void suprimerClient(Client c);
	Client getClient(int idc); 
	List<Client>getClient();
	
}
