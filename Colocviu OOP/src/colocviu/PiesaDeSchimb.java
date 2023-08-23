package colocviu;

public class PiesaDeSchimb {

	String denumire;
	int cantitate;
	double pretPerUnitate;
	
	public PiesaDeSchimb(String denumire, int cantitate, double pretPerUnitate) {
		super();
		this.denumire = denumire;
		this.cantitate = cantitate;
		this.pretPerUnitate = pretPerUnitate;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public double getPretPerUnitate() {
		return pretPerUnitate;
	}

	public void setPretPerUnitate(double pretPerUnitate) {
		this.pretPerUnitate = pretPerUnitate;
	}

	@Override
	public String toString() {
		return "PiesaDeSchimb [denumire=" + denumire + ", cantitate=" + cantitate + ", pretPerUnitate=" + pretPerUnitate
				+ "]";
	}


	
}
