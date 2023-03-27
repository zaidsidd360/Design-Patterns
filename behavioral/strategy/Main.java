package behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();

		System.out.println("Sparky says: " + sparky.tryToFly());
		System.out.println("Tweety says: " + tweety.tryToFly());

		// Dynamically changing flyingType
		sparky.setFlyingAbility(new CanFly());
		System.out.println("Sparky says: " + sparky.tryToFly());
	}

}
