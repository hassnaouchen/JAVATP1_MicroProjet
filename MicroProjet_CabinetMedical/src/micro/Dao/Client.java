package micro.Dao;

public class Client {
	
	
	public int id;
	public int version;
	public String titre ;
	public String prenom ;
	public String nom ;
	
	public Client( int id,int version,String titre,String prenom, String nom )
	{
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.titre=titre;
		this.version=version;
	}
	public Client(int version,String titre,String prenom, String nom )
	{
		
		this.nom=nom;
		this.prenom=prenom;
		this.titre=titre;
		this.version=version;
	}
	public Client( Client client)
	{
		
		setid(client.getid());
		setNom(client.getNom());
		setPrenom(client.getPrenom());
		setVersion(client.getVersion());
		setTitre(client.getTitre());
	
	}
	
	public String getTitre()
	{
		return titre;
	}

	public int getid()
	{
		return id;
	}
	public int getVersion()
	{
		return version;
	}

	public String getNom()
	{
		return nom;
	}

	public void setid(int id)
	{
		 this.id=id;
	}
	public String getPrenom()
	{
		return prenom;
	}
	
	public void setTitre(String titre)
	{
	 this.titre=titre;
	}
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	public void setPrenom(String prenom)
	{
		 this.prenom=prenom;
	}
	public void setVersion(int version)
	{
	 this.version=version;
	}
}
