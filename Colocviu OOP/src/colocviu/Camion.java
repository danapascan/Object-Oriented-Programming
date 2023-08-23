package colocviu;

public class Camion extends Automobil{

	int nrRoti;
	double greutateaMaximaTractata;
	public Camion(String marca, String model, int nrKm, int anFabricatie, int nrRoti, double greutateaMaximaTractata) {
		super(marca, model, nrKm, anFabricatie);
		this.nrRoti = nrRoti;
		this.greutateaMaximaTractata = greutateaMaximaTractata;
	}
	public int getNrRoti() {
		return nrRoti;
	}
	public void setNrRoti(int nrRoti) {
		this.nrRoti = nrRoti;
	}
	public double getGreutateaMaximaTractata() {
		return greutateaMaximaTractata;
	}
	public void setGreutateaMaximaTractata(double greutateaMaximaTractata) {
		this.greutateaMaximaTractata = greutateaMaximaTractata;
	}
	
	
}
