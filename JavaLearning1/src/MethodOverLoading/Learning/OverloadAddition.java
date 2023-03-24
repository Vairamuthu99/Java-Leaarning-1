package MethodOverLoading.Learning;

public class OverloadAddition {

	public void addTwoNumbers() {
		int a = 25;
		int b = 35;
		System.out.println(a + b);
	}

	public void add(int a, int b, double c) {
		System.out.println(a + b + c);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
