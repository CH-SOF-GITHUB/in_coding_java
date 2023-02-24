
public class Arrays {

	public static void main(String[] args) {
		// TODO, déclarez un tableau de chaînes de caractères avec cinq éléments appelé
		// colors
		String[] colors = new String[5];
		// TODO, remplissez les couleurs du tableau avec 5 éléments. Ces éléments
		// devraient être
		// les couleurs red, yellow, orange, green, blue.
		colors[0] = "red";
		colors[1] = "yellow";
		colors[2] = "orange";
		colors[3] = "green";
		colors[4] = "blue";
		// TODO, remplacez la couleur green par emerald en utilisant l'index du tableau
		colors[3] = "emerald";

		// Exécutez le code pour afficher le contenu du tableau
		for (String color : colors) {
			System.out.println(color);
		}
	}

}
