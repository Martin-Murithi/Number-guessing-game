
public class Main {
	public static void main(String[] args) {

		GameLogic logic = new GameLogic();
		
		System.out.println("\tWELCOME TO THE GUESSING GAME");
		System.out.println("  The game will have two players.");
		logic.players();
		System.out.println();
		System.out.println("  Guess a number between 0 and 10");
		logic.game();
	}

}
