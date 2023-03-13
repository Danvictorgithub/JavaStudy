import java.util.*;
public class Player {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int number;
	private int score;
	void guess() {
		this.number = sc.nextInt();
	}
	void setName(String sName) {
		this.name = sName;
	}
	void setScore(int newScore) {
		this.score = newScore;
	}
	void incrementScore() {
		this.score++;
	}
	int getNumber() {
		return this.number;
	}
	String getName() {
		return this.name;
	}
	int getScore() {
		return this.score;
	}
}