package basicOOP;

public class Main {

	public static void main(String[] args) {
		Dog tom = new Dog();
		tom.setName("Tom");
		System.out.println(tom.getName());
		tom.digHole();
		tom.setWeight(-2);

		Animal doggy = new Dog();
		Animal kitty = new Cat();
		System.out.println(doggy.getSound());
		System.out.println(kitty.getSound());
	}

}
