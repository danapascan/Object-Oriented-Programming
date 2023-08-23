package catalog_online;

import java.util.ArrayList;

public class Catalog implements FunctiiCatalog{

	ArrayList <Student> studenti= new ArrayList<>();
	ArrayList <Profesor> profesori= new ArrayList<>();
	
	public void addStudent(Student student)
	{
		studenti.add(student);
		System.out.println("Studentul "+ student.getNumeStudent()+ " a fost adaugat la catalog");
	}
	
	public void stergereStudent(Student student)
	{
		studenti.remove(student);
		System.out.println("Studentul "+ student.getNumeStudent()+ " a fost eliminat din catalog");
	}
	
	public void modificareStudent(Student student)
	{
		System.out.println("Studentul "+ student.getNumeStudent()+ " a fost modificat in catalog");
	}
	
	public void notareStudent(Student student, double nota)
	{
		student.note.add(nota);
		System.out.println("Studentul "+ student.getNumeStudent()+ " a primit nota "+ nota);
	}
	
	public void addProfesor(Profesor profesor)
	{
		profesori.add(profesor);
		System.out.println("Profesorul "+ profesor.getNumeProfesor()+ " a fost adaugat la catalog");
	}
	
	public void showStudentiCVS()
	{
		for(Student student:studenti)
		{
			System.out.println(student.toString());
		}
	}
	
	public void showStudentiXML()
	{
		for(Student student:studenti)
		{
			System.out.println("<StudentData>");
			System.out.println(" <Student id="+ student.idStudent+ ">");
			System.out.println(" <Name>"+ student.numeStudent+ "</Name>");
			System.out.println(" <Anul>"+ student.numeStudent+ "</Anul>");
			System.out.println("</StudentData>");
		}
	}
	
	public void showProfesori()
	{
		for(Profesor profesor:profesori)
		{
			System.out.println(profesor.toString());
		}
	}
	
	public double mediaAritmetica(Student student)
	{
		double media;
		int nrNote=0;
		double sumaNote=0;
		for(Double nota:student.note)
		{
			nrNote++;
			sumaNote+=nota;
		}
		return sumaNote/nrNote;
	}
	
	public void mediaAritmeticaToti()
	{
		for(Student student:studenti)
		{
			System.out.println("Media aritmetica a notelor studentului "+ student.numeStudent+ " este "+ mediaAritmetica(student));
		}
	}

	
}
