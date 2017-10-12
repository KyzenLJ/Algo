package co.simplon.algo;

public class AutoEvalEx3 {

	public static void main(String[] args) {
		int resultat = GenererNombre();
		System.out.println("Nb aleatoire : " + resultat);
		
		if (resultat<25) {	
			System.out.println("Votre résultat est inférieur à 25");
		}
		else if (resultat>25) {
			System.out.println("Votre résultat est supérieur à 25");
		}
		else {
			System.out.println("Votre résultat est 25");
		}

	}
	
	public static int GenererNombre () {
		int min = 0;
		int max = 50;
		int getRandomArbitrary = (int)(Math.random() * (max - min)) + min;
		
		return getRandomArbitrary; 
	}
}