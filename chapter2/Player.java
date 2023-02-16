import java.util.*;
public class Player {
	Scanner sc = new Scanner(System.in);
	String name;
	int number;
	int score;
	void guess() {
		number = sc.nextInt();
	}
	void setName(String sName) {
		name = sName;
	}
}