package org.example;

public class BankAccount {
	private String accountHolder;
	private double balance;

	public BankAccount() {
		this("", 0);
	}

	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposited: Rs" + amount);
		} else {
			System.out.println("Please Enter Valid Amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Withdraw : Rs" + amount);
		}
	}

	@Override
	public String toString() {
		return "Account Holder: " + this.accountHolder + "\nBalance : " + this.balance;
	}
}
