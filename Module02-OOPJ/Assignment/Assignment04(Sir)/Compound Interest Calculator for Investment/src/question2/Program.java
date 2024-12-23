package question2;

public class Program {
	public static void main(String[] args) {
		CompoundInterestCalculatorUtil utilObj = new CompoundInterestCalculatorUtil();

		int choice;
		while ((choice = CompoundInterestCalculatorUtil.menuList()) != 0) {
			switch (choice) {
			case 1:
				utilObj.acceptRecord();
				break;
			case 2:
				utilObj.printRecord();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
		System.out.println("\nExiting the program...");

		CompoundInterestCalculatorUtil.sc.close();
	}
}
