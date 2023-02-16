public class Chapter2 {
	public static void main(String[] args) {
		DogTestDrive tester = new DogTestDrive();
		tester.main();
	}
}
class Dog {
	int size;
	String breed;
	String name;

	void bark() {
		System.out.println("Bruh");
	}
}
class DogTestDrive {
	void main() {
		Dog d = new Dog();
		d.bark();
		d.size = 25;
		d.breed = "Dog";
		d.name = "Doggy";
		System.out.println(String.format("%s %s %d",d.breed,d.name,d.size));
	}
}