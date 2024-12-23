package org.example;

public class SavingsAccount extends BankAccount {
	private double withdrawalLimit;

	public SavingsAccount() {
		this("", 0, 0);
	}

	public SavingsAccount(String accountHolder, double initialBalance, double withdrawalLimit) {
		super(accountHolder, initialBalance);
		this.withdrawalLimit = withdrawalLimit;
	}

	public void withdraw(double amount) {
		if (amount > this.withdrawalLimit) {
			System.out.println("Withdrawal amount exceeds the limit of Rs" + this.withdrawalLimit);
		} else {
			super.withdraw(amount);
		}
	}
}
