abstract class Calc1 {
	int a;
	int b;
	abstract void answer();
	void setData(int m, int n) {
		a = m;
		b = n;
	}}
class Plus extends Calc1 {
	void answer() {
		System.out.println(a + "+" + b + "=" + (a+b));
	}}
public class Calculation1 {
	public static void main(String[] args) {
		Plus plus = new Plus();
		plus.setData(27, 32);
		plus.answer();
	}
}
