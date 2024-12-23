package question1;

import java.util.Scanner;

class LoanAmortizationCalculator {
	private double annualInterestRate;
	private double principalAmount;
	private double loanTerm;

	public void acceptRecord(Scanner sc) {
		System.out.print("Enter the principal amount (in Rs): ");
		this.principalAmount = sc.nextDouble();
		System.out.print("Enter the annual interest rate (in %): ");
		this.annualInterestRate = sc.nextDouble();
		System.out.print("Enter the loan term (in years): ");
		this.loanTerm = sc.nextDouble();
	}

	public double calculateMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / (12 * 100);
		double numberOfMonths = loanTerm * 12;

		double monthlyPayment = principalAmount
				* (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
				/ (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
		return monthlyPayment;
	}

	public void printRecord() {
		double monthlyPayment = calculateMonthlyPayment();
		double totalPayment = monthlyPayment * loanTerm * 12;

		System.out.printf("Monthly Payment: Rs%.2f\n", monthlyPayment);
		System.out.printf("Total Payment over the life of the loan: ₹%.2f", totalPayment);
	}

}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LoanAmortizationCalculator obj = new LoanAmortizationCalculator();
		obj.acceptRecord(sc);
		obj.printRecord();

		sc.close();
	}

}
