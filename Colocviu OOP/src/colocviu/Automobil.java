package colocviu;

public class Automobil {

	String marca;
	String model;
	int nrKm;
	int anFabricatie;
	public Automobil(String marca, String model, int nrKm, int anFabricatie) {
		super();
		this.marca = marca;
		this.model = model;
		this.nrKm = nrKm;
		this.anFabricatie = anFabricatie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNrKm() {
		return nrKm;
	}
	public void setNrKm(int nrKm) {
		this.nrKm = nrKm;
	}
	public int getAnFabricatie() {
		return anFabricatie;
	}
	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}
	@Override
	public String toString() {
		return "Automobil [marca=" + marca + ", model=" + model + ", nrKm=" + nrKm + ", anFabricatie=" + anFabricatie
				+ "]";
	}
	
	
}
