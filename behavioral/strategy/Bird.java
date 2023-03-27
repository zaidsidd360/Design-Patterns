package behavioral.strategy;

public class Bird extends Animal {
	public Bird() {
		super();
		setSound("Tweet!!");

		// Setting the flys interface polymorphically
		flyingType = new CanFly();
	}
}
