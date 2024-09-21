import java.util.Scanner;

class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. : ");
        int no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int m = i; m > 1; m--) {
                System.out.print(m - 1);
            }
            System.out.println();
        }
        for (int i = no; i >= 1; i--) {
            for (int j = 1; j <= no - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int m = i; m > 1; m--) {
                System.out.print(m - 1);
            }
            System.out.println();
        }
    }
}
