package co.simplon.algo;

public class factoriel {
	public static void main (String[]args) {
		int valeur=5;
		int resultat=1;
		
		for(int nb=1;nb<=valeur;nb++) {
			resultat=resultat*nb;
			}
		System.out.println("Votre résultat est " + resultat);
	}
	
}
