package micro.Dao;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		Client c=new Client(2,"c1","ouchen","hassna");
		ClientImp client1=new ClientImp();
		client1.ajouterClient(c);
		client1.modifierClient(c);

		
	/*	Creneaux cc=new Creneaux(2,1,3,44,3);
		CreneauxImp cr=new CreneauxImp();
		cr.ajouterCreneaux(cc);*/
	}

}
