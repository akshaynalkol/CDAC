package question4;

public class DiscountCalculator {
	private double originalPrice;
	private double discountRate;

	public DiscountCalculator() {
		this.originalPrice = 0;
		this.discountRate = 0;
	}

	public double getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double calculateDiscount() {
		return this.originalPrice * (this.discountRate / 100);
	}

	public double calculateFinalPrice() {
		return this.originalPrice - this.calculateDiscount();
	}

	@Override
	public String toString() {
		return "\n------- Discount Calculator -------" + "\nOriginal Price : Rs" + this.originalPrice + "\nDiscount Rate : "
				+ this.discountRate + "%";
	}
}
