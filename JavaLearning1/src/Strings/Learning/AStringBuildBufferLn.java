package Strings.Learning;

public class AStringBuildBufferLn {

	/*
	 * Garbage Value: Some values staying in your heap memory without having any
	 * reference,we call it as a garbage value
	 * 
	 * String s1 = "Java"
	 * 
	 * s1="Learning"+java
	 * 
	 * String Constant pool Java Learning java > s1 StringBuilder and StringBuffer >
	 * Mutable
	 *
	 * StringBuffer strbuff = new StringBuffer("Selenium"); StringBuilder strbuild =
	 * new StringBuilder("Java")
	 *
	 * StringBuffer Strbu = : "Hello";
	 *
	 * + concat > append()
	 */

	/*
	 * 1. String objects are immutable where StringBuffer and Builder objects are
	 * mutable 2.String Buffer is thread safe as its methods are synchronised.
	 * String builder its not thread safe 3.String builder is faster than String
	 * buffer
	 * 
	 * Single threaded environments > both String buffer and String builder Multi
	 * threaded env > if there is risk in methods accessing the same variable then
	 * you can restrict by declaring the variable as String Buffer Synchronised
	 */

	public static void main(String[] args) {

		String str = "Java ";
		String str2 = str;

		StringBuffer strbuff = new StringBuffer("String Buffer");
		StringBuffer strbuff2 = strbuff;

		StringBuilder strbuild = new StringBuilder("String Builder ");
		StringBuilder strbuild2 = strbuild;

		str = str + "Learning ";
		strbuff = strbuff.append("learning ");
		strbuild = strbuild.append("Learning");

		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("strbuff : " + strbuff);
		System.out.println("strbuff2 : " + strbuff2);
		System.out.println("strbuild : " + strbuild);
		System.out.println("strbuild2 : " + strbuild2);

		// append
		strbuff.append("learning learning ");
		// insert > Insert some value

		System.out.println("strbuff : " + strbuff);
		strbuff.insert(0, "Inserted");
		System.out.println("strbuff : " + strbuff);

		// delete >
		strbuff.delete(6, 10);
		System.out.println("strbuff : " + strbuff);

		// replace
		strbuff.replace(0, 10, "replcaed");
		System.out.println("strbuff : " + strbuff);

		// Reverse
		// strbuff.reverse();
		System.out.println("strbuff : " + strbuff);

		// Replace Character

		// SetChar(index, ch)
		strbuff.setCharAt(0, '7');
		System.out.println("strbuff : " + strbuff);

		String str11 = "Hello";
		StringBuffer strbuff11 = new StringBuffer(str11);

		StringBuffer strbuff12 = new StringBuffer("World");
		String str12 = strbuff12.toString();
	}
}
