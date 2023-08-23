package colocviu;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) throws PieseMulte{
		// TODO Auto-generated method stub

		
		AtelierAuto atelier= new AtelierAuto();
		
		Automobil a1=new Masina("BMW","frumos",1002,2002,200,"SUV");
		Automobil a2=new Masina("WW","lung",2222,20011,150,"SUV");
		Automobil a3=new Camion("Pasat","idk",1402,2006,5,163);
		Automobil a4=new Camion("Daacia","3600",1192,2010,8,183);
		
		
		atelier.addAutomobil(a1);
		atelier.addAutomobil(a2);
		atelier.addAutomobil(a3);
		atelier.addAutomobil(a4);
		
		PiesaDeSchimb p1= new PiesaDeSchimb("surub",2,2);
		PiesaDeSchimb p2= new PiesaDeSchimb("fire",50,11);
		PiesaDeSchimb p3= new PiesaDeSchimb("bujie",60,70);
		PiesaDeSchimb p4= new PiesaDeSchimb("motor",80,84);
		
		atelier.addPiesa(p1);
		atelier.addPiesa(p2);
		atelier.addPiesa(p3);
		atelier.addPiesa(p4);
		
		//aici im fac un vector cu piesele ce trebuuie comandate pentru o reparatie
		ArrayList <PiesaDeSchimb> reparatie1= new ArrayList<>();
		reparatie1.add(p1);
		reparatie1.add(p2);
	
		ArrayList <PiesaDeSchimb> reparatie2= new ArrayList<>();
		reparatie2.add(p1);
		reparatie2.add(p3);
		reparatie2.add(p4);
	
		System.out.println("");
		Chitanta chitanta1=atelier.reparatie(reparatie1,a2);
		Chitanta chitanta2=atelier.reparatie(reparatie2, a4);

		
		System.out.println(chitanta1.toString());
		System.out.println(chitanta2.toString());
		
		System.out.println("");
		
		atelier.afisareAutomobile();
		
		System.out.println("");
		
		atelier.showPiese();
		
		System.out.println("");
		
		int rez=atelier.vinde(a1);
		
		System.out.println("Pretul de vanzare al automobilului " +a1.marca + " este "  + rez + " lei");
		atelier.returnarePiese(1000);
		
	}

}
