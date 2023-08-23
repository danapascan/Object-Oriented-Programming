package catalog_online;

import java.util.ArrayList;

public class Profesor {

	ArrayList< String> materii= new ArrayList<>();
	String numeProfesor;
	
	public Profesor(String nume) {
		super();
		this.numeProfesor = nume;
	}
	
	public String getNumeProfesor() {
		return numeProfesor;
	}
	
	public void setNumeProfesor(String nume) {
		this.numeProfesor = nume;
	}
	
	public ArrayList<String> getMaterii() {
		return materii;
	}
	
	public void addMaterie(String materie)
	{
		materii.add(materie);
	}
	@Override
	public String toString() {
		return "Profesor [materii=" + materii + ", nume=" + numeProfesor + "]";
	}
	
	
}
