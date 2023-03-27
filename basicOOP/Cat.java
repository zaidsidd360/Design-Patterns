package basicOOP;

public class Cat extends Animal {
	public void scratchSofa() {
		System.out.println("Screech scratch");
	}

	public Cat() {
		super();
		setSound("Meow!!");
	}
}
