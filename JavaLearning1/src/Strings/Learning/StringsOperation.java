package Strings.Learning;

public class StringsOperation {

	public static void main(String[] args) {

		String name = "MUTHU";
		String place = new String("Kadayanallur");

		System.out.println(name);
		System.out.println(place);

		String s1 = "MUTHU";
		String s2 = new String("MUTHU");
		String s3 = "MUTHU";

		/*
		 * System.out.println("S1 address :" +s1); 
		 * System.out.println("S2 address :" +s2); 
		 * System.out.println("S3 address :" +s3);
		 */

		System.out.println("S1 address :" + s1.hashCode());
		System.out.println("S2 address :" + s2.hashCode());
		System.out.println("S3 address :" + s3.hashCode());

		if (s1.contentEquals(s3)) {
			System.out.println("Equal");
		} else
			System.out.println("Not equal");

		String sub = "Selenium java";
		String trend = "Automation";
		String ct = "automatioN";

		System.out.println(sub.length()); // Total number of characters in string including space
		System.out.println(sub.equals(trend)); // Compare two strings
		System.out.println(trend.equalsIgnoreCase(ct)); // This will compare two strings ignoring
	}
}
