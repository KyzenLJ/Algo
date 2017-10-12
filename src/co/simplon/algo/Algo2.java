/**
 * 
 */
package co.simplon.algo;

/**
 * @author Utilisateur
 *
 */
public class Algo2 {
	
	public static void main(String[] args) {
	System.out.println(appreciation(-5));
	System.out.println(appreciation(0));
	System.out.println(appreciation(3));
	System.out.println(appreciation(8));
	System.out.println(appreciation(11));
	System.out.println(appreciation(13));
	System.out.println(appreciation(16));
	System.out.println(appreciation(20));
}
	public static String appreciation(int note) {
		String result="";
				if(note>20||note<0) {
					result="Erreur";
				}
				else if(note<5) {
					result="Null";
				}
				else if(note<10) {
					result="A refaire";
				}
				else if(note<13) {
					result="Passable";
				}
				else if(note<15) {
					result="Bien";
				}
				else {
					result="Très bien";
				}
		return result;
	}
}