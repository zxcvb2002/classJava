interface Greet2 {
	void greet();
}
interface Bye extends Greet {
	void bye();
}
class Greeting implements Bye {
	public void greet() {
		System.out.println("Hello!");
	}
	public void bye() {
		System.out.println("Good bye.");
	}
}
public class Meet2 {
	public static void main(String[] args) {
		Greeting grt = new Greeting();
		grt.greet();
		grt.bye();
	}
}
