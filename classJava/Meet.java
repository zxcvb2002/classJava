interface Greet {
	void greet();
}

interface Talk {
	void talk();
}

class Morning implements Greet, Talk {
	public void greet() {
		System.out.println("Hello!");
	}
	public void talk() {
		System.out.println("It's a nice day.");
	}
}

public class Meet {

	public static void main(String[] args) {
		Morning mor = new Morning();
		mor.greet();
		mor.talk();

	}

}
