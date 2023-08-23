package ghiozdanelul;

import java.util.ArrayList;

public class Ghiozdan {
	
	ArrayList<Rechizita> rechizite = new ArrayList<>();
	
	public void add(Caiet caiet)
	{
		System.out.println("Am adaugat un caiet in ghiozdan");
		rechizite.add(caiet);
	}

	public void add(Manual manual)
	{
		System.out.println("Am adaugat un manual in ghiozdan");
		rechizite.add(manual);
	}
	
	public void listItems()
	{
		for(Rechizita rechizita: rechizite)
		{
			System.out.println(rechizita.getNume());
		}
	}
	
	public void listCaiet()
	{
		for(Rechizita rechizita: rechizite)
		{
			if(rechizita instanceof Caiet)
				System.out.println(rechizita.getNume());
				
		}
	}
	
	public void listManual()
	{
		for(Rechizita rechizita: rechizite)
			if(rechizita instanceof Manual)
				System.out.println(rechizita.getNume());
	}
	
	public int getNrRechizite()
	{
		return rechizite.size();
	}
	
	public int getNrCaiete()
	{
		int nrCaiete=0;
		for(Rechizita rechizita: rechizite)
		{
			if (rechizita instanceof Caiet  )
			{
				nrCaiete++;
			}
		}
		return nrCaiete;
	}
	
	public int getNrManuale()
	{
		int nrManuale=0;
		for(Rechizita rechizita: rechizite)
		{
			if (rechizita instanceof Manual  )
			{
				nrManuale++;
			}
		}
		return nrManuale;
	}
	
}
