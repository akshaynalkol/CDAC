package question1;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	private LoanAmortizationCalculator obj;
	static Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		obj = new LoanAmortizationCalculator();

		System.out.print("\nEnter the principal amount (in Rs): ");
		obj.setPrincipalAmount(sc.nextDouble());
		System.out.print("Enter the annual interest rate (in %): ");
		obj.setAnnualInterestRate(sc.nextDouble());
		System.out.print("Enter the loan term (in years): ");
		obj.setLoanTerm(sc.nextDouble());
	}

	public void printRecord() {
		if (obj == null) {
			System.out.println("\nNo loan data available. Please enter loan details first.");
			return;
		}

		System.out.println("\n------- Loan Details -------");
		System.out.println(obj.toString());

		double monthlyPayment = obj.calculateMonthlyPayment();
		double totalPayment = obj.calculateTotalAmountPaid();

		System.out.printf("Monthly Payment: Rs%.2f\n", monthlyPayment);
		System.out.printf("Total Payment over the life of the loan: Rs%.2f%n", totalPayment);
	}

	public static int menuList() {
		System.out.println("\n------- Loan Amortization Calculator Menu -------");
		System.out.println("0. Exit.");
		System.out.println("1. Enter Loan Details.");
		System.out.println("2. Calculate and Display Loan Details.");
		System.out.print("Enter choice : ");
		int choice = sc.nextInt();
		return choice;
	}
}
