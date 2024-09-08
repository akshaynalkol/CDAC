package question3;

public class BMITracker {
	private double weight;
	private double height;

	public BMITracker() {
		this.weight = 0;
		this.height = 0;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateBMI() {
		return weight / (height * height);
	}

	public String classifyBMI() {
		double BMI = calculateBMI();
		if (BMI < 18.5) {
			return "Underweight";
		} else if (BMI >= 18.5 && BMI < 24.9) {
			return "Normal weight";
		} else if (BMI >= 25 && BMI < 29.9) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

	@Override
	public String toString() {
		return "\n------- BMI Tracker -------\n" + "Weight : " + this.weight + "kg\n" + "Height : " + this.height + "meter";
	}

}
