package catalog_online;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class mediaAritmeticaTest {

	@Test
	void test() {
		Catalog catalog= new Catalog();
		Student student= new Student(9831,"Grigore Adina", 2);
		catalog.notareStudent(student,10);
		catalog.notareStudent(student,10);
		catalog.notareStudent(student,9);
		catalog.notareStudent(student,9);
		double var=catalog.mediaAritmetica(student);
		double model=9.5;
		assertTrue(model==var);
	}

}
