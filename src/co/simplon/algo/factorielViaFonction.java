package co.simplon.algo;

public class factorielViaFonction {

	public static void main(String[] args) {
		int valeur= 5;
				
		System.out.println(factoriel(valeur));

	}
	public static int factoriel(int nb) {
		if(nb==1)
			return 1;
			
			return nb*factoriel(nb-1);	
		}
}
