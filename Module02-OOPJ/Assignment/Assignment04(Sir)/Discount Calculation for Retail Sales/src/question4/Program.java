package question4;

public class Program {

	public static void main(String[] args) {
		DiscountCalculatorUtil utilObj = new DiscountCalculatorUtil();

		while (true) {
			int choice = DiscountCalculatorUtil.menuList();
			switch (choice) {
			case 1:
				utilObj.acceptRecord();
				break;
			case 2:
				utilObj.printRecord();
				break;
			case 3:
				System.out.println("\nExiting the program...");
				DiscountCalculatorUtil.sc.close();
				return;
			default:
				System.out.println("\nInvalid choice. Please try again.");
			}
		}
	}

}
