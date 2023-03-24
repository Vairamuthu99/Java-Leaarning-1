package Strings.Learning;

public class BreakContinueLn {

	/*
	 * Break: Terminates the block 
	 * Continue: Skips that specific iteration in the block
	 * 
	 */

	public static void main(String[] args) {

		int n = 10;

		for (int i = 0; i <= n; i++) {
			if (i == 5) {
				// System.out.println("I breaking");
				// break;

				System.out.println("I skipping");
				continue;

			}
			System.out.println(i + "Hello world");
		}
	}
}
