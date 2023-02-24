package Boucles;

public class MyLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TODO: Créez une boucle "for" qui affiche la phrase "I am having so much fun!" 5 fois
        int x = 0;
		String la_phrase = "I am having so much fun!";
        for(int i = 0; i < 5; i++){
            System.out.println(la_phrase);
        }
        System.out.println("\n");
        //TODO: Changez votre boucle "for" par une boucle "while". Etait-ce une bonne idée ?
        while(x < 5) {
        	x++;
        	System.out.println(la_phrase);
        }
        System.out.println("\n");
        //TODO: Sautez l'affichage de la quatrième boucle
        for(int i = 0; i < 5; i++){
        	if(i == 4) {
        		continue;
        	}
            System.out.println(la_phrase);
        }
	}

}
