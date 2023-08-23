package catalog_online;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Catalog catalog=new Catalog();
		
		Student s1= new Student(7361,"Pop Georgiana",1);
		Student s2=new Student(7919,"Ionescu Cristi",4);
		Student s3= new Student (8901,"Adam Cristina", 3);
		Student s4= new Student(9831,"Grigore Adina", 2);
		
		Profesor p1=new Profesor("Ion Giosan");
		Profesor p2 =new Profesor("Grigore Costin");
		
		p1.addMaterie("PC");
		p1.addMaterie("POO");
		p2.addMaterie("CAN");
		
		catalog.addProfesor(p1);
		catalog.addProfesor(p2);
		catalog.addStudent(s1);
		catalog.addStudent(s2);
		catalog.addStudent(s3);
		catalog.addStudent(s4);
		
		catalog.showStudentiCVS();
		
		catalog.stergereStudent(s4);
		
		catalog.showStudentiXML();
	
		catalog.notareStudent(s2,4);
		catalog.notareStudent(s2,10);
		catalog.notareStudent(s2,7);
		catalog.notareStudent(s2,6);
		
		catalog.notareStudent(s1,10);
		catalog.notareStudent(s1,8);
		
		catalog.notareStudent(s3,7);
		catalog.notareStudent(s3,8);
		catalog.notareStudent(s3,9);
		
		s2.showNote();
		
		catalog.mediaAritmeticaToti();
		
		
	
	}

}
