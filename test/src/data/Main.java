package data;

public class Main {
	public static void main (String[] args) {
		Data data = new Data();
		
		dataGreeting();
		data.display();
	}

	private static void dataGreeting() {
		System.out.println("Salut chef");
	}
}