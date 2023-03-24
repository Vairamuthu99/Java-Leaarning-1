package Strings.Learning;

public class BuildBuffer {

	public static void main(String[] args) {

		String str = "Vairam";
		String str2 = str;
		str = str + " Muthu";

		StringBuffer strbuff = new StringBuffer("Muthu Samy");
		StringBuffer strbuff2 = strbuff;

		StringBuilder strbuild = new StringBuilder("Muthu Selvi");
		StringBuilder strbuild2 = strbuild;

		System.out.println("str :" + str);
		System.out.println("str2 :" + str2);
		System.out.println("strbuff :" + strbuff);
		System.out.println("strbuff2 :" + strbuff2);
		System.out.println("strbuild :" + strbuild);
		System.out.println("strbuild2 :" + strbuild2);
	}
}
