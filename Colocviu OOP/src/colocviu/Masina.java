package colocviu;

public class Masina extends Automobil{

	int vitezaMaxima;
	String tipCaroserie;
	
	public Masina(String marca, String model, int nrKm, int anFabricatie, int vitezaMaxima, String tipCaroserie) {
		super(marca, model, nrKm, anFabricatie);
		this.vitezaMaxima = vitezaMaxima;
		this.tipCaroserie = tipCaroserie;
	}

	public int getVitezaMaxima() {
		return vitezaMaxima;
	}

	public void setVitezaMaxima(int vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}

	public String getTipCaroserie() {
		return tipCaroserie;
	}

	public void setTipCaroserie(String tipCaroserie) {
		this.tipCaroserie = tipCaroserie;
	}
	
	
}
