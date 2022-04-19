import java.util.Random;
import java.util.Scanner;

public class GameLogic {

	private String playerOne;
	private String playerTwo;
	
	Scanner scanner = new Scanner(System.in);
	public void players() {

		System.out.println();
		System.out.println("First player, enter your name : ");
		playerOne = scanner.nextLine();
		//System.out.println("Player One : " +playerOne);
		System.out.println();
		System.out.println("Second player, enter your name : ");
		playerTwo = scanner.nextLine();
		//System.out.println("Player Two : " +playerTwo);
		//scanner.close();
	}

	public void game() {

		int playerOneGuess = 0;
		int playerTwoGuess = 0;
		int CorrectGuess;
		int attempts = 10;
		
		System.out.println("You have TEN attempts");
		Scanner scanner = new Scanner(System.in);
			for(int i = 0; i < attempts; i++){
				Random random = new Random();
				CorrectGuess = random.nextInt(10);
				System.out.println();
				System.out.println(playerOne+"'s guess : ");
				playerOneGuess = scanner.nextInt();
					
				System.out.println(playerTwo+"'s guess : ");
				playerTwoGuess = scanner.nextInt();
				scanner.nextLine();
				if(playerOneGuess == CorrectGuess) {
					System.out.println("Congratulations! " +playerOne+" won!");
					System.exit(0);
				}
				else if(playerTwoGuess == CorrectGuess) {
					System.out.println("Congratulations!"+playerTwo+" Won!");
					System.exit(0);
				}
				else if(playerOneGuess != CorrectGuess && playerTwoGuess != CorrectGuess) {
					System.out.println("\tIncorrect, Try again!");
					System.out.println("Correct guess was : "+CorrectGuess);
				}
				
			}
			while(attempts == 10) {
				System.out.println("You both LOST!");
				System.exit(0);
			}
			//scanner.close();
		}
		
	}
	
	
	
	
	
	
	
/*
	public void attempts() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println();
			System.out.println("Guess a number : ");
			//UserNumber = scanner.nextInt();
			for(int i = 0; i < 100; i++ ) {
				Random RandomNumber = new Random();
				CorrectGuess = RandomNumber.nextInt(100);
				UserNumber = scanner.nextInt();
				if(UserNumber == CorrectGuess) {
					System.out.println("You guessed the correct number");
					System.out.println("YOU WIN 20 DOLLARS");
					System.out.println("\tTotal attempts : " +attempts);
					System.exit(0);
				}
				else if(UserNumber > 100 || UserNumber < 0 ) {
					System.out.println("Enter a number between 0 and 100");
				}
				else {
					System.out.println("Incorrect");
					System.out.println("Correct guess : " +CorrectGuess);
					System.out.println();
					System.out.println("Try again : ");
				}
				attempts++;
				while(attempts >= 100) {
					System.out.println("Really! It's just guessing a number.");
				}
			}
		
			
		}
		*/
		
	


