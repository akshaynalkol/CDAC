package question3;

import java.util.Scanner;

public class BMITrackerUtil {
	private BMITracker obj;
	static Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		obj = new BMITracker();

		System.out.print("\nEnter the weight (in kg): ");
		obj.setWeight(sc.nextDouble());
		System.out.print("Enter the height (in m): ");
		obj.setHeight(sc.nextDouble());
	}

	public void printRecord() {
		if (obj == null) {
			System.out.println("\nNo details available. Please enter details first.");
			return;
		}
		
		System.out.println(obj.toString());
		System.out.printf("BMI : %.2f \n", obj.calculateBMI());
		System.out.println("BMI Category: " + obj.classifyBMI());
	}
	
	public static int menuList() {
		 System.out.println("\n------- BMI Tracker Menu -------");
         System.out.println("1. Enter BMI details");
         System.out.println("2. Calculate and Display BMI Details.");
         System.out.println("3. Exit");
         System.out.print("Choose an option: ");
         return sc.nextInt();
	}
}
