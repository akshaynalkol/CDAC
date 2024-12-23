package question1;

class LoanAmortizationCalculator {
	private double principalAmount;
	private double annualInterestRate;
	private double loanTerm;

	public LoanAmortizationCalculator() {
		this.principalAmount = 0;
		this.annualInterestRate = 0;
		this.loanTerm = loanTerm = 0;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(double loanTerm) {
		this.loanTerm = loanTerm;
	}

	public double calculateMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / (12 * 100);
		double numberOfMonths = loanTerm * 12;

		double monthlyPayment = principalAmount
				* (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
				/ (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
		return monthlyPayment;
	}

	public double calculateTotalAmountPaid() {
		return calculateMonthlyPayment() * loanTerm * 12;
	}

	public String toString() {
		return "Principal: Rs" + this.principalAmount + "\n" + "Annual Interest Rate: " + annualInterestRate + "%\n"
				+ "Loan Term: " + loanTerm + " years";
	}
}