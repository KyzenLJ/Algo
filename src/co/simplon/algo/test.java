/**
 * 
 */
package co.simplon.algo;


public class test {
 public static void main(String[]args) {
 //if (condition){
	// 	code si condition vrai
	//}
	 //else{
	 //		code si condition fausse
	 //}
	 long debutProgramme = System.currentTimeMillis();
	 System.out.println(System.currentTimeMillis());
	 
	 String temps="pluvieux";
	 testIf(temps);
 
	/* String temps = "pluvieux";
 	//beau, pluvieux, neigeux
	 if(temps.equals("beau"))
		 System.out.println("Prendre un chapeau");
	 else if(temps.equalsIgnoreCase("pluvieux"))
		 System.out.println("Prendre un parapluie");*/
	 
	 // Test for
	 int[] tab= {1,12,3,4,5,12};
	 int valCherchee = 12;
	 
	 testFor(tab,valCherchee);
	 
	 System.out.println("delta : " + (System.currentTimeMillis() - debutProgramme));
 
 }
 	public static void testIf(String temps) {
 		System.out.println("appel de la fonction avec " + temps);
 		if(temps.equals("beau"))
 		 System.out.println("Prendre un chapeau");
 		 else if(temps.equalsIgnoreCase("pluvieux"))
 			 System.out.println("Prendre un parapluie");
 		 else
 			 System.out.println("Essai encore");
 	}
 	
 	public static void testFor(int[] tabDeValeur, int recherche) {
 		System.out.println("Appel de la fonction testFor avec " + tabDeValeur + "&" + recherche);
 		
 		System.out.println("Parcours du tableau");
 		for(int i=0; i<tabDeValeur.length; i++) {
 			if(tabDeValeur[i] == recherche) {
 			System.out.println(" - element " + i + " : " +tabDeValeur[i]);
 			//break;
 			}
 			else
 				continue;
 			
 			System.out.println("Suite d'instruction...");
 		}
 	}
 	
 }

