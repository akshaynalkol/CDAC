package question4;

import java.util.Scanner;

public class DiscountCalculatorUtil {
	private DiscountCalculator obj;
	static Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		obj = new DiscountCalculator();

		System.out.print("\nEnter the price of an item: ");
		obj.setOriginalPrice(sc.nextDouble());
		System.out.print("Enter the discount percentage: ");
		obj.setDiscountRate(sc.nextDouble());
	}

	public void printRecord() {
		if (obj == null) {
			System.out.println("No details available. Please enter details first.\n");
			return;
		}

		System.out.println(obj.toString());
		System.out.printf("Discount Amount: Rs%.2f \n", obj.calculateDiscount());
		System.out.printf("Final Price Of The Item: Rs%.2f \n", obj.calculateFinalPrice());
	}

	public static int menuList() {
		System.out.println("\n------- Discount Calculator Menu -------");
		System.out.println("1. Enter Details");
		System.out.println("2. Calculate and Display Discount Details");
		System.out.println("3. Exit");
		System.out.print("Choose an option: ");
		return sc.nextInt();
	}
}
