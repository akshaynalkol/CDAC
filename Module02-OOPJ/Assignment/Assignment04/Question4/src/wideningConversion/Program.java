package wideningConversion;

public class Program {
	public static void main(String[] args) {
		int no1 = 100;
		System.out.println("Intger : " + no1);

		double no2 = no1;
		System.out.println("Double : " + no2);

		float no3 = no1;
		System.out.println("Float : " + no3);

		// boolean bool = (boolean) no1; // Cannot cast from int to boolean
		boolean bool = (no1 != 0);
		System.out.println("Boolean : " + bool);

		String str = String.valueOf(no1);
		System.out.println("String : " + str);
		System.out.println("String : " + Integer.toString(no1));
	}
}
