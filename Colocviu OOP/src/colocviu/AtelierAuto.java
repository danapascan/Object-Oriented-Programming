package colocviu;

import java.util.ArrayList;

public class AtelierAuto implements Interfata{

	ArrayList<Automobil> automobile= new ArrayList<>();
	ArrayList<PiesaDeSchimb> piesecomandate= new ArrayList<>();
	
	
	void addAutomobil(Automobil automobil)
	{
		automobile.add(automobil);
		System.out.println("Un automobil a fost adaugat in atelier");
	}
	
	void addPiesa(PiesaDeSchimb piesa)
	{
		piesecomandate.add(piesa);
		System.out.println("O piesa a fost comandata in atelier");
	}
	
	//aici scot piesa daca am ramas fara
	public void folosirePiesa(PiesaDeSchimb piesa)
	{
		if(piesa.cantitate>0)
		{
			piesa.cantitate--;
		}
		else if(piesa.cantitate==0)
			piesecomandate.remove(piesa);
	}
	
	Chitanta reparatie(ArrayList<PiesaDeSchimb> reparatie, Automobil automobil)
	{
		double totalDePlata=0;
		for(PiesaDeSchimb piesa:reparatie)
		{
			folosirePiesa(piesa);
			totalDePlata+=piesa.pretPerUnitate;
		}
		Chitanta chitanta=new Chitanta(automobil.toString(),totalDePlata,piesecomandate);
		return chitanta;
		
	}
	
	void afisareAutomobile()
	{
		System.out.println("Automobilele mai vechi de 2010 sunt:");
		for(Automobil automobil:automobile)
		{
			if (automobil.anFabricatie<2010)
			{
				System.out.println(automobil.toString());
			}
		}
	}
	
	
	
	public void showPiese()
	{
		for(PiesaDeSchimb piesa:piesecomandate)
		{
			System.out.println(piesa.toString());
		}
	}
	
	void returnarePiese(int nrPiese) throws PieseMulte 
	{
		if(nrPiese>piesecomandate.size())
		{
			throw new PieseMulte("Vreti sa returnati mai multe piese decat ati comandat!");
		}
		
	}

	@Override
	public int vinde(Automobil automobil) {
		// TODO Auto-generated method stub
		int pretVanzare;
		int vechime=2023-automobil.anFabricatie;
		
		if(vechime>10 && automobil.nrKm>2000)
		
		{
			if(automobil instanceof Masina)
			{
				if( ((Masina)automobil).tipCaroserie=="SUV")
				{
					pretVanzare=2000;
					
				}
				else 
				{
					pretVanzare=1000;
				}
			
			}
			else 
				if(((Camion)automobil).greutateaMaximaTractata>200)
				{
					pretVanzare=5980;
				}
				else 
				{
					pretVanzare=4700;
				}
		}
		else
		{
			pretVanzare=1;
		}
		return pretVanzare;
		
	}
	
}
