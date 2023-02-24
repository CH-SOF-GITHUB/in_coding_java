package Boucles;

public class Rectangle {

	public int width = 4;
	private int borderWidth = 1;

	public static void main(String[] args) {
		int mainWidth = 28;
	}

	public void printValues() {
		final int newWidth = 12;

		if (true) {
			int pixelSize = 5;
		}
		// Quelle variable pourrait être utilisé ici ?
		// System.out.println(mainWidth);
		System.out.println(newWidth);
		// System.out.println(pixelSize);
		System.out.println(width);
		System.out.println(borderWidth);
	}

}
