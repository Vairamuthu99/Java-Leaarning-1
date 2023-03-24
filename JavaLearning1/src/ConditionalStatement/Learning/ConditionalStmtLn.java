package ConditionalStatement.Learning;

public class ConditionalStmtLn {

	/*
	 * Conditional Operators <,>,<=,>=,== Statements Conditional if if else else if
	 * nested(condition inside a condition)
	 */

	static int a = 19;
	static int b = 17;

	public static void main(String[] args) {

		if (a > b) {

			System.out.println("a is greater");
		} else if (a == b) {
			System.out.println("Both are equal");
		} else {
			System.out.println("b is greater");
		}
	}
}
