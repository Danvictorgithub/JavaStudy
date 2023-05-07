import java.util.Scanner;
// class testSimpleStartupClass {
// 	SimpleStartup dot = new SimpleStartup();
// 		int[] locations = {2,3,4};
// 		dot.setLocation(locations);
// 		int userGuess = 5;
// 		String result = dot.checkYourself(userGuess);
// 		String testResult = "failed";

// 		if (result.equals("hit")) {
// 			testResult = "passed";
// 		}
// 		System.out.println(testResult);
// }

public class SimpleStartupGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int guess;
		int numGuesses = 0;
		Integer randomLocation = Integer.valueOf((int)(Math.random() * 5.0));
		String result;
		Integer[] location = {randomLocation++,randomLocation++,randomLocation++};
		// System.out.println(location.length);
		SimpleStartup dot = new SimpleStartup();
		dot.setLocation(location);
	

		while (true) {
			System.out.print("Enter your guess: ");
			guess = sc.nextInt();
			result = dot.checkYourself(guess);
			numGuesses++;
			System.out.println(result);
			if (result.equals("kill")) {
				System.out.printf("You killed a startup in %d guesses!",numGuesses);
				break;
			}
		}
	}
}