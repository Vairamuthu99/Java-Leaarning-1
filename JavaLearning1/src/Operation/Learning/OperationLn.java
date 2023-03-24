package Operation.Learning;

public class OperationLn {

	int x = 2;
	int y = 5;
	// Global / Class / Instance variables

	public void add() {
		int z = 3; // Local variables

		System.out.println("addition is:" + (x + y + z));
	}

	public void sub() {

		System.out.println("subration is:" + (x - y));
	}

	public void mul() {

		System.out.println("multipication is:" + (x * y));
	}

	public void div() {

		System.out.println("division is:" + (x / y));
	}
}
