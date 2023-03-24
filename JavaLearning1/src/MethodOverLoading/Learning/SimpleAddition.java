package MethodOverLoading.Learning;

public class SimpleAddition {

	public void addTwoNumbers() {
		int a = 25;
		int b = 35;
		System.out.println(a + b);
	}

	public void addThreeNumbers(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void addFourNumbers(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public void addFiveNumbers(int a, int b, int c, int d, int e) {
		System.out.println(a + b + c + d + e);
	}
}
