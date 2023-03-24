package Strings.Learning;

public class CallByValueLn {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		changer(x, y);
		System.out.println(x);
		System.out.println(y);
	}

	private static void changer(int x, int y) {

		x = 50;
		y = 100;

		changeagain(x, y);
		System.out.println(x);
		System.out.println(y);
	}

	private static void changeagain(int x, int y) {

		x = 500;
		y = 1000;
		System.out.println(x);
		System.out.println(y);
	}
}
