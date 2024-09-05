import java.util.Scanner;

class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. : ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            String temp = "";
            for (int j = 1; j <= no - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
                temp += k;
            }
            System.out.print(" x " + 8 + " + " + i + " = ");
            System.out.print(Integer.parseInt(temp) * 8 + i);
            System.out.println();
        }
    }
}
