package micro.Dao;

public class Creneaux {

	private int id;
	private int version;
	private int Hdebut ;
	private int Mdebut ;
	private int Mfin ;
	private int Hfin;
	
	public Creneaux( int id,int version,int Hdebut,int Mdebut, int Mfin,int Hfin )
	{
		this.id=id;
		this.Hdebut=Hdebut;
		this.Mdebut=Mdebut;
		this.Mfin=Mfin;
		this.Hfin=Hfin;
		this.version=version;
	}
	public Creneaux(int version,int Hdebut,int Mdebut, int Mfin,int Hfin )
	{
		
		this.Hdebut=Hdebut;
		this.Mdebut=Mdebut;
		this.Mfin=Mfin;
		this.Hfin=Hfin;
		this.version=version;
	}
	public Creneaux( Creneaux cr)
	{
		
		setid(cr.getid());
		setHdebut(cr.getHdebut());
		setMdebut(cr.getMdebut());
		setVersion(cr.getVersion());
		setHfin(cr.getHfin());
		setMfin(cr.geMfin());
	
	}
	
	public int getMdebut()
	{
		return Mdebut;
	}

	public int getid()
	{
		return id;
	}
	public int getVersion()
	{
		return version;
	}

	public int getHdebut()
	{
		return Hdebut;
	}

	public void setid(int id)
	{
		 this.id=id;
	}
	public int getHfin()
	{
		return Hfin;
	}
	public int geMfin()
	{
		return Mfin;
	}
	
	public void setHdebut(int Hdebut)
	{
	 this.Hdebut=Hdebut;
	}
	public void setMdebut(int Mdebut)
	{
		this.Mdebut=Mdebut;
	}
	public void setMfin(int Mfin)
	{
		 this.Mfin=Mfin;
	}
	public void setHfin(int Hfin)
	{
		 this.Hfin=Hfin;
	}
	public void setVersion(int version)
	{
	 this.version=version;
	}
}
