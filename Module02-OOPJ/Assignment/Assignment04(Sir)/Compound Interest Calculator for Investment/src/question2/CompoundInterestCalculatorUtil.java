package question2;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	private CompoundInterestCalculator obj;
	static Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		obj = new CompoundInterestCalculator();

		System.out.print("\nEnter the amount (in Rs:) ");
		obj.setPrincipalAmount(sc.nextDouble());
		System.out.print("Enter the annual interest rate (in %): ");
		obj.setAnnualInterestRate(sc.nextDouble());
		System.out.print("Enter the number of times interest is compounded per year:  ");
		obj.setPrincipalAmount(sc.nextDouble());
		System.out.print("Enter the investment duration (in years): ");
		obj.setYears(sc.nextDouble());
	}

	public void printRecord() {
		if (obj == null) {
			System.out.println("\nNo investment details available. Please enter investment details first.");
			return;
		}

		System.out.println(obj.toString());

		System.out.printf("Future Value of the Investment: Rs%.2f\n", obj.calculateFutureValue());
		System.out.printf("Total Interest Earned: Rs%.2f\n", obj.calculateTotalInterest());
	}
	
	public static int menuList() {
		System.out.println("\n------- Compound Interest Calculator Menu -------");
		System.out.println("0. Exist.");
		System.out.println("1. Enter Investment Details.");
		System.out.println("2. Calculate and Display Investment Details.");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
}
