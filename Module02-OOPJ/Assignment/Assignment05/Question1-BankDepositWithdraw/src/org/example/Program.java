package org.example;

public class Program {
	public static void main(String[] args) {
//		BankAccount bank=new BankAccount("Akshay Nalkol",5000);
//		System.out.println(bank.toString());
//		
//		bank.deposit(500);
//		System.out.println("Balance : "+bank.getBalance());
//		
//		bank.withdraw(2000);
//		System.out.println("Balance : "+bank.getBalance());
		
		/////////////////////////////////////////////////////////////
		SavingsAccount saving=new SavingsAccount("Akshay Nalkol",5000,1000);
		System.out.println(saving.toString());
		
		saving.deposit(1000);
		System.out.println("Balance : "+saving.getBalance());
		
		saving.withdraw(15000);
		System.out.println("Balance : "+saving.getBalance());
	}
}