package co.simplon.algo;

public class AutoEvalEx6 {

	public static void main(String[] args) {
		System.out.println(asterisque("Choisissez un travail que vous aimez et vous n'aurez pas à travailler un seul jour de votre vie." ));
		
			}
	public static String asterisque (String confucius) {
		String resultat="";
		for(int i = 0 ; i < confucius.length() ; i++) {
			if(confucius.charAt(i)=='a'||confucius.charAt(i)=='e'||confucius.charAt(i)=='i'||confucius.charAt(i)=='o'||confucius.charAt(i)=='u'||confucius.charAt(i)=='y') {
				resultat = resultat + "*";
			}
			else {
				resultat = resultat + confucius.charAt(i);
			}
		
		}
		return resultat;
	}
}

	
	
//	"Choisissez un travail que vous aimez et vous n'aurez pas à travailler un seul jour de votre vie.";