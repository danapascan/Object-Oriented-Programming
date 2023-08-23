public class Matrice {
	
	private static final int DIMENSION = 2;
	Complex[][] matrice;
	
	public Matrice() {
		matrice = new Complex[DIMENSION][DIMENSION];
	}
	
	public void setValue(int i, int j, Complex value) {
		matrice[i][j]= value;
	}
	
	public Complex getValue(int i, int j) {
		return matrice[i][j];
	}

	public static void showMatrix(Matrice m) {
		for(int i=0;i<DIMENSION;i++) {
			for(int j=0;j<DIMENSION;j++) {
				System.out.print(m.getValue(i, j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void adunare(Matrice m1, Matrice m2) {
		Matrice rezultat = new Matrice();
		
		for(int i=0;i<DIMENSION; i++) {
			for(int j=0;j< DIMENSION;j++) {
				
				Complex c1 = m1.getValue(i, j);
				Complex c2 = m2.getValue(i, j);
				
				int intreg = c1.getIntreg() + c2.getIntreg();
				int imaginar = c1.getImaginar() + c2.getImaginar();
				Complex rez = new Complex(intreg,imaginar);
				
				rezultat.setValue(i, j, rez);
				
			}
		}
		
		
		showMatrix(rezultat);
		
		
	}
	
	public static void scadere(Matrice m1, Matrice m2) {
		Matrice rezultat = new Matrice();
		
		for(int i=0;i<DIMENSION; i++) {
			for(int j=0;j< DIMENSION;j++) {
				
				Complex c1 = m1.getValue(i, j);
				Complex c2 = m2.getValue(i, j);
				
				int intreg = c1.getIntreg() - c2.getIntreg();
				int imaginar = c1.getImaginar() - c2.getImaginar();
				Complex rez = new Complex(intreg,imaginar);
				
				rezultat.setValue(i, j, rez);
				
			}
		}
		
		
		showMatrix(rezultat);
		
	}
	
	public static void adunarenr (Complex a, Complex b)
	{
		int intreg = a.getIntreg() + a.getIntreg();
		int imaginar = b.getImaginar() + b.getImaginar();
	
	}
	
	public static void inmultire(Matrice m1, Matrice m2) {
		Matrice rezultat = new Matrice();
		
		//Complex aux = new Complex(0,0);
		
		for(int i=0;i<	DIMENSION;i++){    
			
			for(int j=0;j<DIMENSION;j++){ 
				Complex aux = new Complex(0,0);
				
				for(int k=0;k < DIMENSION;k++)     
					
				{
					
		
				rezultat.setValue(i, j, aux);
				
				Complex c1 = m1.getValue(i, j);
				Complex c2 = m2.getValue(i, j);   
				
				int intrega1=c1.getIntreg();
				int intrega2=c2.getIntreg();
				
				int a1a2=intrega1*intrega2;
				
				int imaginarb1=c1.getIntreg();
				int imaginarb2=c2.getIntreg();
				
				int b1b2=imaginarb1*imaginarb2;
				
				int intreg=a1a2-b1b2;
				
				int a1b2=intrega1*imaginarb2;
				int a2b1=intrega2*imaginarb1;
				
				int imaginar=a1b2+a2b1;
				
				Complex rez = new Complex(intreg,imaginar);	
				

				aux.setIntreg(aux.getIntreg()+rez.getIntreg());
				aux.setImaginar(aux.getImaginar()+rez.getImaginar());
				
				rezultat.setValue(i, j, aux);
			}
				
			}
		}
		
		
		showMatrix(rezultat);
		
	}
	
	
	public static void main(String[] args) {
		
		Complex c1 = new Complex(1,3);
		Complex c2 = new Complex(1,3);
		Complex c3 = new Complex(1,3);
		Complex c4 = new Complex(1,3);
		
		Complex c5 = new Complex(2,1);
		Complex c6 = new Complex(2,1);
		Complex c7 = new Complex(2,1);
		Complex c8 = new Complex(2,1);
		
		Matrice m1= new Matrice();
		m1.setValue(0, 0, c1);
		m1.setValue(0, 1, c2);
		m1.setValue(1, 0, c3);
		m1.setValue(1, 1, c4);
		
		Matrice m2= new Matrice();
		m2.setValue(0, 0, c5);
		m2.setValue(0, 1, c6);
		m2.setValue(1, 0, c7);
		m2.setValue(1, 1, c8);
		
		Matrice.scadere(m1, m2);
		Matrice.adunare(m1,m2);
		Matrice.inmultire(m1, m2);
	}
	

}
