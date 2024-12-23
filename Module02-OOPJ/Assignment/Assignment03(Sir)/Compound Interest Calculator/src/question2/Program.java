package question2;

import java.util.Scanner;

class CompoundInterestCalculator {
	private double amount;
	private double annualInterestRate;
	private double numberOfCompounds;
	private double years;

	static Scanner sc = new Scanner(System.in);

	void acceptRecord() {
		System.out.print("Enter the amount (in Rs:) ");
		this.amount = sc.nextDouble();
		System.out.print("Enter the annual interest rate (in %): ");
		this.annualInterestRate = sc.nextDouble();
		System.out.print("Enter the number of times interest is compounded per year:  ");
		this.numberOfCompounds = sc.nextDouble();
		System.out.print("Enter the investment duration (in years): ");
		this.years = sc.nextDouble();
	}

	double calculateFutureValue() {
		double futureValue = amount
				* Math.pow((1 + annualInterestRate / numberOfCompounds), (numberOfCompounds * years));

		return futureValue;
	}

	void printRecord() {
		double futureValue = calculateFutureValue();
		double totalInterest = futureValue - amount;
		System.out.printf("Future Value of the Investment: Rs%.2f%n", futureValue);
		System.out.printf("Total Interest Earned: Rs%.2f%n", totalInterest);
	}
}

public class Program {
	public static void main(String args[]) {
		CompoundInterestCalculator obj = new CompoundInterestCalculator();
		obj.acceptRecord();
		obj.printRecord();

		CompoundInterestCalculator.sc.close();
	}
}
