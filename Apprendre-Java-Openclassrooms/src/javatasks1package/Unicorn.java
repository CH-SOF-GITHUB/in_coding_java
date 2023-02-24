package javatasks1package;

public class Unicorn {
	//Attributs des classes
	static int height = 70;
	static String power = "Double.infinity";
	
	public static void sleep() {
		//variables
		int minutesToSleep = 120;
		
		//attempt to access
		System.out.println(minutesToSleep);
		// ERROR System.out.println(minutesToRun);
		System.out.println(height);
		System.out.println(power);
	}

	public static void run() {
		//variables
		int minutesToRun = 60;
		
		//attempt to access
		//ERROR System.out.println(minutesToSleep);
		System.out.println(minutesToRun);
		System.out.println(height);
		System.out.println(power);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicorn unicorn = new Unicorn();
		unicorn.run();
	}

}
