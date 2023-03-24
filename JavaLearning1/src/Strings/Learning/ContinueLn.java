package Strings.Learning;

public class ContinueLn {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i <= n; i++) {
			if (i == 3) {
				System.out.println("We skip here Machan");
				continue;
			}
			System.out.println(i + "Vanakam Machan");
		}
	}
}
