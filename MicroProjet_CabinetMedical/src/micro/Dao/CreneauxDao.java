package micro.Dao;

import java.util.List;

public interface CreneauxDao {

	
	
	public void ajouterCreneaux(Creneaux c);
	void modifierCreneaux(Creneaux c);
	void suprimerCreneaux(Creneaux c);
	Creneaux getCreneaux(int idc); 
	List<Creneaux>getCreneauxt();
}
