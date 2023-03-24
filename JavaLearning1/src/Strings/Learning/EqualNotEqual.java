package Strings.Learning;

public class EqualNotEqual {

	public static void main(String[] args) {

		String s1 = "MUTHU";
		String s2 = new String("MUTHU");
		String s3 = "Vairam";

		if (s1.contentEquals(s3)) {
			System.out.println("Equal");
		} else
			System.out.println("Not equal");
	}
}
