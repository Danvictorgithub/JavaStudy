import java.util.*;
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	void playGame() {
		String temp;
		Scanner sc = new Scanner(System.in);
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		p1.name = "Player 1";
		p2.name = "Player 2";
		p3.name = "Player 3";

		p1.score = 0;
		p2.score = 0;
		p3.score = 0;

		int round = 1;
		int secretNumber = 0;
		Player[] rotatePlayer;
		rotatePlayer = new Player[3];
		rotatePlayer[0] = p1;
		rotatePlayer[1] = p2;
		rotatePlayer[2] = p3;
		while(true) {
			secretNumber = (int) (Math.random() * 10);
			System.out.println(String.format("\n\n\nRound %d",round));
			for (int i = 0; i < 3;i++) {
				System.out.println(String.format("%s's Take your Guess!",rotatePlayer[i].name));
				System.out.print("Enter a number: ");
				rotatePlayer[i].guess();
			}
			System.out.println("\n\n\n");
			for (int i = 0; i < 3;i++) {
				if (rotatePlayer[i].number == secretNumber) {
					rotatePlayer[i].score++;
					System.out.println(String.format("%s Got it right!",rotatePlayer[i].name));
				}
			}
			System.out.println("Scores Dashboard:");
			for (int i = 0; i < 3; i++) {
				System.out.println(String.format("%s: %d",rotatePlayer[i].name,rotatePlayer[i].score));
			}
			System.out.println(String.format("The Secret Number was %d",secretNumber));
			// temp = sc.readLine();
			sc.nextLine();
			round++;
		}
	}
}