package question2;

public class CompoundInterestCalculator {
	private double principalAmount;
	private double annulaInterestRate;
	private double numberOfCompounds;
	private double years;

	public CompoundInterestCalculator() {
		this(0, 0, 0, 0);
	}

	public CompoundInterestCalculator(double principalAmount, double annulaInterestRate, double numberOfCompounds,
			double years) {
		this.principalAmount = principalAmount;
		this.annulaInterestRate = annulaInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
	}

	public double getPrincipalAmount() {
		return this.principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public double getAnnualInterestRate() {
		return this.annulaInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annulaInterestRate = annualInterestRate;
	}

	public double getNumberOfCompounds() {
		return this.numberOfCompounds;
	}

	public void setNumberOfCompounds(double numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public double getYears() {
		return this.years;
	}

	public void setYears(double years) {
		this.years = years;
	}

	public double calculateFutureValue() {
		return principalAmount * Math.pow((1 + annulaInterestRate / numberOfCompounds), (numberOfCompounds * years));
	}

	public double calculateTotalInterest() {
		return calculateFutureValue() - principalAmount;
	}

	public String toString() {
		return "\n------- Investment Details -------\n" + "Principal Amount : Rs" + this.principalAmount + "\n"
				+ "Annual Interest Rate : Rs" + this.annulaInterestRate + "%\n" + "Number Of Compounds Per Year : Rs"
				+ this.numberOfCompounds + "\n" + "Years : " + this.years + "years";
	}
}
