package Method.Learning;

public class ArgsMainOp {

	public static void main(String[] args) {

		ArgsMethods obj = new ArgsMethods();
		obj.add();
		obj.addwitharg(7, 11);
		int rsult = obj.addwithret(3, 33);

		System.out.println(rsult);

		int rslt2 = obj.addwithret(6, 12);

		System.out.println(rslt2);
	}
}
