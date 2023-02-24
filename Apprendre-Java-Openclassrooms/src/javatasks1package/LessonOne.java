package javatasks1package;

public class LessonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thisYear = 2019;
		String birthdayMonth = "2019";
		int firstDay = 3;
		
		//TODO Etape 1: Créez une variable int nommée daysInWeek et assignez-lui la valeur de 7.
		int daysInWeek = 7;
		
		//TODO Etape 2: Utilisez un opérateur mathématique raccourci pour ajouter la valeur de 
		//              la variable daysInWeek à la variable firstDay.
		firstDay = daysInWeek + firstDay;
		
		//TODO Etape 3: Créez une constante STARTINGDAY avec la valeur résultante de la variable firstDay.
		final int STARTINGDAY = firstDay;
		// Affiche le résultat 
        System.out.println("There are " + daysInWeek + " days in a week.\nYour starting day in the month is: " + STARTINGDAY);
	}

}
