package Method.Learning;

public class ArgsMethods {

	// Method without argument and return type

	public void add() {

		int x = 5;
		int y = 10;

		System.out.println(x + y);
	}

	// Method with argument and without return type

	public void addwitharg(int x, int y) {

		System.out.println(x + y);
	}

	// Method without argument and with return type

	public int addwithret() {

		int x = 3;
		int y = 9;

		return x + y;
	}

	// Method with argument and with return type

	public int addwithret(int x, int y) {

		return x + y;
	}
}
