package Strings.Learning;

public class LengthTrueFalse {

	public static void main(String[] args) {

		String sub = "Vairam1Muthu";
		String trend = "RajKamal";
		String ct = "rajkamal";

		System.out.println(sub.length()); // Total number of characters in string including space
		System.out.println(sub.equals(trend)); // Compare two strings
		System.out.println(trend.equalsIgnoreCase(ct)); // This will compare two strings ignoring
	}
}
