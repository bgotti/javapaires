import java.util.ArrayList;
import java.util.Scanner;

class Main {
	
	 /**
    * Fonction Main qui accepte juste des nombres positifs.
    * @param args Demande l'utilisateur de rentrer un nombre positive. Si un nombre negatif est entrer on redemande utilisateur de redemande de rentrer un nombre positif.
    * 
    */

	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entrer une valeur positive: ");
	
		int n = clavier.nextInt();
		
		//Demande saisi positive
		while(n<0) {
			  System.out.print("Erreur. Rentrer une valeur positive SVP: ");
			  n = clavier.nextInt();
			}
		
		//Generation des valeurs aleatoires

		System.out.println("Votre nombre est " + n);
		
		//Appelle la fonction aleatore
		aleatoire();
	
		}
	
		//Fonction aleatoire() qui genere des valeurs aleatoires entre 0 et 10 qui sont rentrer dans un tableau statique.
		public static void aleatoire() {
			
			//Tableau dynamiques originales
			ArrayList<Integer> nombres = new ArrayList<Integer>();
			
			for (int i=0 ; i<10 ; i++) {
				int valeur = (int) (Math.random()*10);	
				nombres.add(valeur);
				
			}
			
			//Tableau dynamiques sans les valeurs paires 
			
			ArrayList<Integer> nombres_v = new ArrayList<Integer>();
			for (int i=0 ; i<nombres.size() ; i++) {
				Integer valeur_courante = nombres.get(i);
				if(valeur_courante%2==1) nombres_v.add(valeur_courante);
				
			}
			

			System.out.println("Vos valeurs sont " +  nombres);
			System.out.println("Vos valeurs sans les paires sont " +  nombres_v);
		}
	
		
					
}
