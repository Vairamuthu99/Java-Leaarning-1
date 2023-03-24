package Debug.Learning;

public class DoSummationDebugLn {

	static int result = 6;

	public static void main(String[] args) {

		System.out.println("Good");
		Dosummation();
		System.out.println("Good");

	}

	public static void Dosummation() {

		for (int i = 0; i <= 10; i++) {
			result = result + i;
			System.out.println(result);
		}
	}
}
