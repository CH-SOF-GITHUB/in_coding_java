package Switch;

public class SwitchMe {
	enum Color{
		blue, green, red, yellow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color selectedColor = Color.blue;
		
	//TODO: Exécutez le code et regardez le résultat.
		if(selectedColor == Color.blue) {
			System.out.println("The color is blue");
		}else if (selectedColor == Color.red) {
			System.out.println("The color is red");
		}else if (selectedColor == Color.green) {
			System.out.println("The color is green");
		}else if (selectedColor == Color.yellow) {
			System.out.println("The color is yellow");
		}
		else {
			System.out.println("We do not know the color !");
		}
		//TODO: Remplacez les conditions if/else par un switch.
		switch(selectedColor) {
		case blue:
			System.out.println("SWITCH: The color is blue");
			break;
		case red:
			System.out.println("SWITCH: The color is red");
			break;
		case green:
			System.out.println("SWITCH: The color is green");
			break;
		case yellow:
			System.out.println("SWITCH: The color is yellow");
			break;
		default:
			System.out.println("We do not know the color !");
		}
	}

}
