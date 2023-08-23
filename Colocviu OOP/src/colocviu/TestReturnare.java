package colocviu;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReturnare {

	@Test
	void test() throws PieseMulte {
		AtelierAuto atelier=new AtelierAuto();
		Automobil a1=new Masina("BMW","djaac",1002,2002,200,"SUV");
		
		atelier.addAutomobil(a1);
		
		int rez=atelier.vinde(a1);
		assertEquals(rez,1); 
		
	}

}
