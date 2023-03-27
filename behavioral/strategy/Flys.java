package behavioral.strategy;

public interface Flys {
	String fly();
}

class CanFly implements Flys {
	public String fly() {
		return "I'm flying high!";
	}
}

class CannotFly implements Flys {
	public String fly() {
		return "I can't fly :( ";
	}
}
