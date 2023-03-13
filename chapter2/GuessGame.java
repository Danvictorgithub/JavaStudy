import java.util.*;
public class GuessGame {
	// Player p1;
	// Player p2;
	// Player p3;
	void playGame() {
		String temp;
		int numOfP; // Number of Players
		int round = 1; 
		int secretNumber = 0; // Holds value of Random digit
		Player[] playerList;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of players: ");
		numOfP = sc.nextInt();

		playerList = new Player[numOfP];
		//Player Initialization;
		for (int i = 0 ; i < numOfP;i++) {
			String name = String.format("Player %d",i+1);
			Player newPlayer = new Player();
			newPlayer.setName(name);
			newPlayer.setScore(0);
			playerList[i] = newPlayer;
		}

		// p1 = new Player();
		// p2 = new Player();
		// p3 = new Player();

		// p1.name = "Player 1";
		// p2.name = "Player 2";
		// p3.name = "Player 3";

		// p1.score = 0;
		// p2.score = 0;
		// p3.score = 0;

		
		// Player[] playerList = {p1,p2,p3};
		// playerList = new Player[3];
		// playerList[0] = p1;
		// playerList[1] = p2;
		// playerList[2] = p3;
		while(true) {
			secretNumber = (int) (Math.random() * 10);
			System.out.println(String.format("\n\n\nRound %d",round));
			for (int i = 0; i < numOfP;i++) {
				System.out.println(String.format("%s's Take your Guess!",playerList[i].getName()));
				System.out.print("Enter a number: ");
				playerList[i].guess();
			}
			System.out.println("\n\n\n");
			for (int i = 0; i < numOfP;i++) {
				if (playerList[i].getNumber() == secretNumber) {
					playerList[i].incrementScore();
					System.out.println(String.format("%s Got it right!",playerList[i].getName()));
				}
			}
			System.out.println("Scores Dashboard:");
			for (int i = 0; i < numOfP; i++) {
				System.out.println(String.format("%s: %d",playerList[i].getName(),playerList[i].getScore()));
			}
			System.out.println(String.format("The Secret Number was %d",secretNumber));
			sc.nextLine();
			round++;
		}
	}
}