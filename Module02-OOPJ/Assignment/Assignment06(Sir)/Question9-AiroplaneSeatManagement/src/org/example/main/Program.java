package org.example.main;

import java.util.Scanner;
import org.example.domain.AirplaneSeating;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int column = sc.nextInt();

		AirplaneSeating obj = new AirplaneSeating(row, column);

		int choice;
		do {
			System.out.println("\n----- Airplane Seat Management -----");
			System.out.println("1. Display seating chart");
			System.out.println("2. Book a seat");
			System.out.println("3. Cancel a booking");
			System.out.println("4. Check seat availability");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj .displaySeatingChart();
				break;
			case 2:
				System.out.print("Enter row to book: ");
				int bookRow = sc.nextInt() - 1;
				System.out.print("Enter column to book: ");
				int bookCol = sc.nextInt() - 1;
				obj .bookSeat(bookRow, bookCol);
				break;
			case 3:
				System.out.print("Enter row to cancel booking: ");
				int cancelRow = sc.nextInt() - 1;
				System.out.print("Enter column to cancel booking: ");
				int cancelCol = sc.nextInt() - 1;
				obj .cancelSeat(cancelRow, cancelCol);
				break;
			case 4:
				System.out.print("Enter row to check availability: ");
				int checkRow = sc.nextInt() - 1;
				System.out.print("Enter column to check availability: ");
				int checkCol = sc.nextInt() - 1;
				obj.isSeatAvailable(checkRow, checkCol);
				break;
			case 5:
				System.out.println("Exiting the system.");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 5);

		sc.close();
	}
}
