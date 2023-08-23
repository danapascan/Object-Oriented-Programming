package catalog_online;

import java.util.ArrayList;

public class Student {

	int idStudent;
	String numeStudent;
	int anul;
	ArrayList <Double> note= new ArrayList<>();
	
	public Student(int idStudent, String numeStudent, int anul) {
		super();
		this.idStudent = idStudent;
		this.numeStudent = numeStudent;
		this.anul = anul;
	}
	
	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getNumeStudent() {
		return numeStudent;
	}

	public void setNumeStudent(String numeStudent) {
		this.numeStudent = numeStudent;
	}

	public int getAnul() {
		return anul;
	}

	public void setAnul(int clasa) {
		this.anul = anul;
	}

	
	public ArrayList<Double> getNote() {
		return note;
	}

	public void showNote()
	{
		System.out.println("Studentul "+this.getNumeStudent()+ " are notele: ");
		for(Double nota:note)
		{
			System.out.println(nota);
		}
	}
	@Override
	public String toString() {
		return "Student:" + idStudent +"," + numeStudent + "," + anul ;
	}
	
	
}
