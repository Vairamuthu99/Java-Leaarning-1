package Switch.Learning;

public class SwitchLn {

	/*
	 * Test the condition if particular case condition is met Rest of the cases will
	 * be ignored once the case is executed the switch will break the loop
	 */

	public static void main(String[] args) {
		int day = 3;
		switch (day) {

		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Vera day illa");
		}
	}
}
