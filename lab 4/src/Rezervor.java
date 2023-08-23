
public class Rezervor {
	int capacitateMax;
	int nivelCurent;
	
	public int umplere(int combustibil)
	{
		if(this.nivelCurent<this.capacitateMax)
		{
			nivelCurent+=combustibil;
		}
		return nivelCurent;
	}
	
	public int golire(int combustibil)
	{
		if(this.nivelCurent>combustibil)
		{
			nivelCurent-=combustibil;
		}
		return nivelCurent;
	}
	
}
