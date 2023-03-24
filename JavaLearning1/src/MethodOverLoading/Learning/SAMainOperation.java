package MethodOverLoading.Learning;

public class SAMainOperation {

	public static void main(String[] args) {
		SimpleAddition obj = new SimpleAddition();
		obj.addTwoNumbers();
		obj.addThreeNumbers(1, 20, 30);
		obj.addFourNumbers(2, 90, 80, 70);
		obj.addFiveNumbers(3, 50, 60, 70, 30);
	}
}
