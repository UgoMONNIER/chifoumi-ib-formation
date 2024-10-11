package chifoumi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> TableauGagnantSelonPartie = new ArrayList<String>();

//		// Déclaration du pays :
		System.out.println("Renseigner votre pays : ");
		Scanner scanner = new Scanner(System.in);
        String PaysJoueurs = scanner.next();
        System.out.println(PaysJoueurs);
           		
		
		// Déclaration nombre de parties jouées
		System.out.println("Combien de parties voulez-vous jouer ?");
		int nombredeParties = scanner.nextInt();
//        System.out.println(nombredeParties);
		for (int i = 1; i <= nombredeParties; i++) {
			System.out.println("Début de la partie " + i + " :");
			// Choix des joueurs
			System.out.println("Joueur 1 : Faites votre choix !");
			String ChoixJoueur1 = scanner.next();

			System.out.println("Joueur 2 : Faites votre choix !");
			String ChoixJoueur2 = scanner.next();

			ArrayList<String> TableauChoix = new ArrayList<String>();
			TableauChoix.add(ChoixJoueur1);
			TableauChoix.add(ChoixJoueur2);

			// Affichage résultat
			if (ChoixJoueur1.equals(ChoixJoueur2)) {
				System.out.println("Les deux joueurs sont en égalité");
				TableauGagnantSelonPartie.add("égalité");
			} else {
				// Cas feuille vs pierre
				if (TableauChoix.contains("feuille") && TableauChoix.contains("pierre")) {
					if (TableauChoix.indexOf("feuille") == 0) {
						System.out.println("Joueur 1 gagne");
						TableauGagnantSelonPartie.add("Joueur 1");
					} else {
						System.out.println("Joueur 2 gagne");
						TableauGagnantSelonPartie.add("Joueur 2");
					}
				}
				// Cas pierre vs ciseaux
				if (TableauChoix.contains("pierre") && TableauChoix.contains("ciseaux")) {
					if (TableauChoix.indexOf("pierre") == 0) {
						System.out.println("Joueur 1 gagne");
						TableauGagnantSelonPartie.add("Joueur 1");
					} else {
						System.out.println("Joueur 2 gagne");
						TableauGagnantSelonPartie.add("Joueur 2");
					}
				}
				// Cas feuille vs ciseaux
				if (TableauChoix.contains("feuille") && TableauChoix.contains("ciseaux")) {
					if (TableauChoix.indexOf("ciseaux") == 0) {
						System.out.println("Joueur 1 gagne");
						TableauGagnantSelonPartie.add("Joueur 1");
					} else {
						System.out.println("Joueur 2 gagne");
						TableauGagnantSelonPartie.add("Joueur 2");
					}
				}
			}
		}
		System.out.println("TableauGagnantSelonPartie");
		System.out.println(TableauGagnantSelonPartie);
		int scoreJoueur1 = 0;
		int scoreJoueur2 = 0;
		for (String resultatPartie : TableauGagnantSelonPartie) {
			if (resultatPartie.equals("égalité")) {
				System.out.println("Résultat : ");
			} else if (resultatPartie.equals("Joueur 1")) {
				scoreJoueur1++;
			} else if (resultatPartie.equals("Joueur 2")) {
				scoreJoueur2++;
			}
		}
		if (scoreJoueur1 > scoreJoueur2)
			System.out.println("Le grand gagnant est le joueur 1");
		else if (scoreJoueur1 < scoreJoueur2)
			System.out.println("Le grand gagnant est le joueur 2");
		else
			System.out.println("Il n'y a pas de grand gagnant :( ");
		scanner.close();
	}

}
