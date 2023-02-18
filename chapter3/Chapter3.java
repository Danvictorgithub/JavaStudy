public class Chapter3 {
	String name;
	public static void main(String[] args) {
		// int[] arrayNums = {1,2,3,4,5}; instant array declaration with values
		// Initializing Array the hard way
		int[] arrayNums;
		arrayNums = new int[5];
		arrayNums[0] = 1;
		arrayNums[1] = 2;
		arrayNums[2] = 3;
		arrayNums[3] = 4;
		arrayNums[4] = 5;
		for (int i = 0; i < 5;i++) 
			System.out.println(arrayNums[i]);
		Dog Dan = new Dog();
		Dan.name = "Dan";
		System.out.println(Dan.name);
		String[] someStringArray = {"Dan","Dan","Dan"};
		someFunction(someStringArray);
		Chapter3 chapter3 = new Chapter3();
		chapter3.name = "Dan";
		// chapter3.main(someStringArray);
	}
	public static void someFunction(String[] string) {
		for (int i = 0; i < string.length;i++)
			System.out.println(string[i]);
	}
}
class Dog {
	String name;
}