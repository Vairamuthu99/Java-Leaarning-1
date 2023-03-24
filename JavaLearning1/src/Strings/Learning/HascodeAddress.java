package Strings.Learning;

public class HascodeAddress {

	public static void main(String[] args) {

		String s1 = "MUTHU";
		String s2 = new String("MUTHU");
		String s3 = "Vairam";

		System.out.println("S1 address :" + s1.hashCode());
		System.out.println("S2 address :" + s2.hashCode());
		System.out.println("S3 address :" + s3.hashCode());
	}
}
