package question5;

import java.util.Scanner;

class TollBoothRevenueManager {
	private double carTollRate;
	private double truckTollRate;
	private double motorcycleTollRate;

	private int numCars;
	private int numTrucks;
	private int numMotorcycles;

	public void setTollRates(Scanner sc) {
		System.out.print("Enter the toll rate for Cars (in Rs): ");
		this.carTollRate = sc.nextDouble();
		System.out.print("Enter the toll rate for Cars (in Rs): ");
		this.truckTollRate = sc.nextDouble();
		System.out.print("Enter the toll rate for Cars (in Rs): ");
		this.motorcycleTollRate = sc.nextDouble();
	}

	public void acceptRecord(Scanner sc) {
		System.out.print("Enter the number of Cars: ");
		this.numCars = sc.nextInt();
		System.out.print("Enter the number of Trucks: ");
		this.numTrucks = sc.nextInt();
		System.out.print("Enter the number of Motorcycles: ");
		this.numMotorcycles = sc.nextInt();
	}

	public double calculateRevenue() {
		return (carTollRate * numCars) + (truckTollRate * numTrucks) + (motorcycleTollRate * numMotorcycles);
	}

	public void printRecord() {
		System.out.println("Total number of vehicles: " + (numCars + numTrucks + numMotorcycles));
		System.out.printf("Total revenue collected: Rs%.2f", calculateRevenue());
	}
}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TollBoothRevenueManager obj = new TollBoothRevenueManager();
		obj.setTollRates(sc);
		obj.acceptRecord(sc);
		obj.printRecord();

		sc.close();
	}

}
