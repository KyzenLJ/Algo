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
	  
public static String controleDuSigneDuNombre(int varNb) { //Arguments entre parenth�ses
	String result=""; //D�claration pas de parenth�ses
	    if(varNb==0){
	    	result="Z�ro";
	}
	else if(varNb>0){
		result="Positif"; // = parcequ'on donne la valeur de r�sult... m�me pour une cha�ne de caract�res
	}
	else{
		result="N�gatif";
	}
	    return result;
	}}
	
