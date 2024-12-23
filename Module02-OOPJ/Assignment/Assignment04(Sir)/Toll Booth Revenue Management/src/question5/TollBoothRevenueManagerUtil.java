package question5;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	private static TollBoothRevenueManager obj;
	static Scanner sc = new Scanner(System.in);

	public static void acceptRecord() {
		obj = new TollBoothRevenueManager(0, 0, 0, 0, 0, 0);

		System.out.print("\nEnter the toll rate for Cars (in Rs): ");
		obj.setCarTollRate(sc.nextDouble());
		System.out.print("Enter the toll rate for Cars (in Rs): ");
		obj.setCarTollRate(sc.nextDouble());
		System.out.print("Enter the toll rate for Cars (in Rs): ");
		obj.setMotorcycleTollRate(sc.nextDouble());
		System.out.print("Enter the number of Cars: ");
		obj.setNumCars(sc.nextInt());
		System.out.print("Enter the number of Trucks: ");
		obj.setNumTrucks(sc.nextInt());
		System.out.print("Enter the number of Motorcycles: ");
		obj.setNumMotorcycles(sc.nextInt());
	}

	public static void printRecord() {
		if (obj == null) {
			System.out.println("\nNo details available. Please enter details first.");
			return;
		}

		System.out.println("\n------- Toll Booth Revenue -------");
		System.out.println(obj);
		System.out.println("Total number of vehicles: " + obj.calculateTotalVehicles());
		System.out.printf("Total revenue collected: Rs%.2f%n", obj.calculateRevenue());
	}

	public static void menuList() {
		int choice;

		do {
			System.out.println("\n--- Toll Booth Revenue Manager Menu ---");
			System.out.println("0. Exit");
			System.out.println("1. Enter toll rates and vehicle details");
			System.out.println("2. Calculate and Display Revenue Details");
			System.out.print("Choose an option: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("\nExiting the program...");
				break;
			case 1:
				TollBoothRevenueManagerUtil.acceptRecord();
				break;
			case 2:
				TollBoothRevenueManagerUtil.printRecord();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 0);
	}
}
