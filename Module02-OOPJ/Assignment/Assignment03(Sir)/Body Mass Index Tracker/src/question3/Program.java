package question3;

import java.util.Scanner;

class BMITracker {
	private double weight;
	private double height;

	public void acceptRecord(Scanner sc) {
		System.out.print("Enter the weight (in kg): ");
		this.weight = sc.nextDouble();
		System.out.print("Enter the height (in m): ");
		this.height = sc.nextDouble();
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

	public void printRecord() {
		String category = classifyBMI();

		System.out.printf("BMI is: %.2f%n", calculateBMI());
		System.out.print("BMI Category: " + category);
	}
}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BMITracker obj = new BMITracker();
		obj.acceptRecord(sc);
		obj.printRecord();
		
		sc.close();
	}

}
