package ghiozdanelul;

public class TestGhiozdan {
	
	public static void main (String[] args)
	{
	Ghiozdan ghiozdan= new Ghiozdan();
	Caiet caiet1= new Caiet("bd");
	Caiet caiet2= new Caiet("poo");
	Manual manual1= new Manual("BD");
	Manual manual2 = new Manual("POO");
	Manual manual3= new Manual("AF");
	
	ghiozdan.add(caiet1);
	ghiozdan.add(caiet2);
	ghiozdan.add(manual1);
	ghiozdan.add(manual2);
	ghiozdan.add(manual3);
	
	System.out.println("Rechizite: " + ghiozdan.getNrRechizite());
	System.out.println("Caiete: " + ghiozdan.getNrCaiete());
	System.out.println("Manuale: " + ghiozdan.getNrManuale());
	
	System.out.println("Lista caiete: ");
	ghiozdan.listCaiet();
	
	System.out.println("Lista manuale: ");
	ghiozdan.listManual();
	
	System.out.println("Lista rechizite: ");
	ghiozdan.listItems();
	}
}
