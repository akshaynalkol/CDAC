package question1;

public class Program {
	public static void main(String[] args) {
		LoanAmortizationCalculatorUtil utilObj = new LoanAmortizationCalculatorUtil();

		int choice;
		while ((choice = LoanAmortizationCalculatorUtil.menuList()) != 0) {
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

		LoanAmortizationCalculatorUtil.sc.close();
	}
}
