package org.example.domain;

public class AirplaneSeating {
	private char seat[][];

	public AirplaneSeating(int r, int c) {
		seat = new char[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				seat[i][j] = 'O';
			}
		}
	}

	public void bookSeat(int r, int c) {
		if (isSeatValid(r, c)) {
			if (seat[r][c] == 'O') {
				seat[r][c] = 'X';
				System.out.println("Seat (" + (r + 1) + "," + (c + 1) + ") successfully booked.");
			} else {
				System.out.println("Seat (" + (r + 1) + "," + (c + 1) + ") is already occupied.");
			}
		} else {
			System.out.println("Invalid seat position.");
		}
	}

	public void cancelSeat(int r, int c) {
		if (isSeatValid(r, c)) {
			if (seat[r][c] == 'X') {
				seat[r][c] = 'O';
				System.out.println("Booking for seat (" + (r + 1) + "," + (c + 1) + ") has been canceled.");
			} else {
				System.out.println("Seat (" + (r + 1) + "," + (c + 1) + ") is already available.");
			}
		} else {
			System.out.println("Invalid seat position.");
		}
	}

	public void isSeatAvailable(int r, int c) {
		if (isSeatValid(r, c)) {
			if (seat[r][c] == 'O') {
				System.out.println("Seat (" + (r + 1) + "," + (c + 1) + ") is available.");
			} else {
				System.out.println("Seat (" + (r + 1) + "," + (c+ 1) + ") is occupied.");
			}
		} else {
			System.out.println("Invalid seat position.");
		}
	}

	public void displaySeatingChart() {
		System.out.println("\nCurrent Seating Chart:");
		System.out.print("  ");
		for (int j = 0; j < seat[0].length; j++) {
			System.out.print(" " + (j + 1));
		}
		System.out.println();
		for (int i = 0; i < seat.length; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(" " + seat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	private boolean isSeatValid(int r, int c) {
		return r >= 0 && r < seat.length && c >= 0 && c < seat[0].length;
	}
}