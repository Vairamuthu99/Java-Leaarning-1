package Inheritance.Learning;

public class BasicMain {

	public static void main(String[] args) {

		BasicCalculator obj = new BasicCalculator();

		obj.add(5, 10);
		obj.add(3, 7, 9);
		obj.sub(2, 5);
		obj.sub(4, 8, 12);
		obj.mul(3, 7);
		obj.mul(5, 8, 9);
		obj.div(5, 90);
		obj.div(10, 40, 70);
	}
}
