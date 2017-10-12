/**
 * 
 */
package co.simplon.algo;

/**
 * @author Utilisateur
 *
 */
public class Algo1 {
	/**
	 * @param args
	 * @param varNb 
	 */
	public static void main(String[] args) {
		System.out.println(controleDuSigneDuNombre(0));
		System.out.println(controleDuSigneDuNombre(-1));
		System.out.println(controleDuSigneDuNombre(5));		
	}
	  
public static String controleDuSigneDuNombre(int varNb) { //Arguments entre parenthèses
	String result=""; //Déclaration pas de parenthèses
	    if(varNb==0){
	    	result="Zéro";
	}
	else if(varNb>0){
		result="Positif"; // = parcequ'on donne la valeur de résult... même pour une chaîne de caractères
	}
	else{
		result="Négatif";
	}
	    return result;
	}}
	
