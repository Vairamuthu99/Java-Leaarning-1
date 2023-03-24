package Strings.Learning;

public class StringBldBufOp {

	public static void main(String[] args) {

		String str = "Vairam";
		String str2 = str;
		str = str + " Muthu";

		StringBuffer strbuff = new StringBuffer("MuthuSamy");
		StringBuffer strbuff2 = strbuff;

		StringBuilder strbuild = new StringBuilder("MuthuSelvi");
		StringBuilder strbuild2 = strbuild;

		System.out.println("str :" + str);
		System.out.println("str2 :" + str2);
		System.out.println("strbuff :" + strbuff);
		System.out.println("strbuff2 :" + strbuff2);
		System.out.println("strbuild :" + strbuild);
		System.out.println("strbuild2 :" + strbuild2);

		// Append
		strbuff = strbuff.append(" is his Dad");
		strbuild = strbuild.append(" is his Mom");
		System.out.println("Append1 :" + strbuff);
		System.out.println("Append2 :" + strbuild);

		// Insert>insert some value
		strbuff.insert(10, "So what ");
		strbuild.insert(11, "So what ");
		System.out.println("Insert1 : " + strbuff);
		System.out.println("Insert2 : " + strbuild);

		// Delete>
		strbuff.delete(10, 18);
		strbuild.delete(11, 19);
		System.out.println("Delete1 : " + strbuff);
		System.out.println("Delete2 : " + strbuild);

		// Replace
		strbuff.replace(9, 10, "R ");
		strbuild.replace(10, 11, "M ");
		System.out.println("Replace1 : " + strbuff);
		System.out.println("Replace2 : " + strbuild);

		// Replace character>SetChar(Index,ch)
		strbuff.setCharAt(9, '.');
		strbuild.setCharAt(10, '.');
		System.out.println("Replaced1 :" + strbuff);
		System.out.println("Replaced2 :" + strbuild);

		// Reverse
		strbuff.reverse();
		strbuild.reverse();
		System.out.println("Reverse1 :" + strbuff);
		System.out.println("Reverse2 :" + strbuild);

		// Tostring
		String str11 = "Start";
		StringBuffer strbuff11 = new StringBuffer(str11);

		StringBuffer strbuff12 = new StringBuffer("End");
		String str12 = strbuff12.toString();
	}
}
