package basicOOP;

public class Main {

	public static void main(String[] args) {
		Dog tom = new Dog();
		tom.setName("Tom");
		System.out.println(tom.getName());
		tom.digHole();
		tom.setWeight(-2);
	}

}
