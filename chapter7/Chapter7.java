class Animal {
	private String picture;
	public enum Food {
		MEAT,
		GRASS
	}
	private Food aFood;
	private int hunger;
	private String boundaries;
	private int location;
	public Animal(String picture, Food aFood, int hunger, String boundaries, int location) {
		this.picture = picture;
		this.aFood = aFood;
		this.hunger = hunger;
		this.boundaries = boundaries;
		this. location = location;
	}
	public Food getFood() {
		return this.aFood;
	}
	public void makeNoise() {
		System.out.println("Makes Noise");
	}
	public void eat() {
		if (this.aFood == Food.MEAT) {
			System.out.println("Eats Meat");
		}
		else {
			System.out.println("Eats Grass");
		}
	}
	public void sleep() {
		System.out.println("Sleeps");
	}
	public void roam() {
		System.out.println("Roams at " + this.location);
	}
}

class Cat extends Animal {
	public Cat(String picture, Food aFood, int hunger, String boundaries, int location) {
		super(picture,aFood,hunger,boundaries,location);
	}
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Meows");
	}
}
class Dog extends Animal {
	public Dog(String picture, Food aFood, int hunger, String boundaries, int location) {
		super(picture,aFood,hunger,boundaries,location);
	}
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Barks");
	}
}
// Student: Dan Victor B. Lofranco
class Calculator {
	// Simple Calculator with Overloading
	// I made these methods so that it has unique return types.
	// It works for (int,int) (int, double) (double, int) and (double, double)
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public double minus(double a, double b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public double multiply(double a, double b) {
		return a*b;
	}

	public int divide(int a, int b){
		return a/b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
}

public class Chapter7 {
	public static void main(String[] args) {
		// Animal[] animals = new Animal[2];
		// animals[0] = new Cat("a",Animal.Food.MEAT,10,"2x2",120);
		// animals[1] = new Dog("a",Animal.Food.GRASS,20,"3x3",140);
		// for (Animal animal: animals) {
		// 	System.out.println(animal.getFood());
		// }
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(5,1));
		System.out.println(calculator.add(6.0,5.0));
	}
}