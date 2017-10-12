package co.simplon.algo;

public class MathRandomAutoEvalEx4 {

	public static void main(String[] args) {
		int resultat = GenererNombre();
		
		
		for(int i=0; i<resultat; i++) {
			System.out.println("Alex");
		}
		

	}
	
	public static int GenererNombre () {
		int min = 0;
		int max = 50;
		int getRandomArbitrary = (int)(Math.random() * (max - min)) + min;
		
		return getRandomArbitrary; 
	}
}