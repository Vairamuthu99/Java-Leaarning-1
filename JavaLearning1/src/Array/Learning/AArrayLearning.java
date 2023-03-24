package Array.Learning;

public class AArrayLearning {

	public static void main(String[] args) {

		/*
		 * DataType[] variables names; DataType arrayname[]:
		 * 
		 */

		int[] intArray;
		int arrayinteger[];
		String[] words;

		int[] marks = new int[5];

		marks[0] = 27;
		marks[1] = 35;
		marks[2] = 32;
		marks[3] = 44;
		marks[4] = 50;
		// int[] score = {27,35,32,44,50};

		for (int i = 2; i < marks.length; i++) {
			// System.out.println(marks[3]);
			System.out.println(marks[i]);
		}
	}
}
