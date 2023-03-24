package Array.Learning;

public class ArrayIncDecMul {

	public static void main(String[] args) {

		int[][] coor = new int[3][4];
		coor[0][1] = 10;
		coor[0][2] = 1;
		coor[0][3] = 43;

		coor[1][1] = 20;
		coor[1][2] = 18;
		coor[1][3] = 33;

		System.out.println((coor[1][3]));

		/*
		 * You have iterate rows and columns U will need two for loops
		 */

		int a = 100;
		int b = 100;
		System.out.println("a++ : " + a++);
		System.out.println(a);
		System.out.println("++b	 : " + ++b);
		System.out.println(b);
	}
}
