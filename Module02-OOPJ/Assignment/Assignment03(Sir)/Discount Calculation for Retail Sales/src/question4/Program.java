package question4;

import java.util.Scanner;

class DiscountCalculator {
	private double originalPrice;
	private double discountRate;

	static Scanner sc = new Scanner(System.in);

	void acceptRecord() {
		System.out.print("Enter the price of an item: ");
		this.originalPrice = sc.nextDouble();
		System.out.print("Enter the discount percentage: ");
		this.discountRate = sc.nextDouble();
	}

	double calculateDiscount() {
		return originalPrice * (discountRate / 100);
	}

	void printRecord() {
		double discountAmount = calculateDiscount();
		double finalPrice = originalPrice - discountAmount;

		System.out.printf("Discount Amount: Rs%.2f \n", discountAmount);
		System.out.printf("Final Price Of The Item: Rs%.2f \n", finalPrice);
	}
}

public class Program {
	public static void main(String args[]) {
		DiscountCalculator obj = new DiscountCalculator();
		obj.acceptRecord();
		obj.printRecord();

		DiscountCalculator.sc.close();
	}
}
