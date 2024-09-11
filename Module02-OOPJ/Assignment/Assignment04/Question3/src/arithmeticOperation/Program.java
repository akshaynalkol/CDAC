package arithmeticOperation;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Ineger Value : ");
		int no1 = sc.nextInt();
		System.out.print("Enter Float Value : ");
		float no2 = sc.nextFloat();
		System.out.print("Enter Double Value : ");
		double no3 = sc.nextFloat();

		double res = no1 + no2 + no3;
		System.out.println("Result : " + res);
	}

}
