package question3;

public class Program {
	public static void main(String[] args) {
		BMITrackerUtil utilObj = new BMITrackerUtil();

		int choice;
		while ((choice = BMITrackerUtil.menuList()) != 3) {
			switch (choice) {
			case 1:
				utilObj.acceptRecord();
				break;
			case 2:
				utilObj.printRecord();
				break;
			default:
				System.out.println("\nInvalid choice. Please try again.");
			}
		}
		System.out.println("\nExiting the program...");

		BMITrackerUtil.sc.close();
	}

}
