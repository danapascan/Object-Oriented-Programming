package colocviu;

import java.util.ArrayList;

public class Chitanta {

	String detaliiAutomobil;
	private double totalPlata;
	
	ArrayList<PiesaDeSchimb> pieseComandate= new ArrayList<>();

	public Chitanta(String detaliiAutomobil, double totalPlata, ArrayList<PiesaDeSchimb> piesecomandate2) {
		super();
		this.detaliiAutomobil = detaliiAutomobil;
		this.totalPlata = totalPlata;
	}

	public String getDetaliiAutomobil() {
		return detaliiAutomobil;
	}

	public void setDetaliiAutomobil(String detaliiAutomobil) {
		this.detaliiAutomobil = detaliiAutomobil;
	}

	public double getTotalPlata() {
		return totalPlata;
	}

	public void setTotalPlata(double totalPlata) {
		this.totalPlata = totalPlata;
	}

	public ArrayList<PiesaDeSchimb> getPieseComandate() {
		return pieseComandate;
	}

	@Override
	public String toString() {
		return "Chitanta [detaliiAutomobil=" + detaliiAutomobil + ", totalPlata=" + totalPlata + ", pieseComandate="
				+ pieseComandate + "]";
	}
	
	
}
