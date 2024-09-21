import java.util.Scanner;

class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. : ");
        int no = sc.nextInt();
        int n = no / 2;
        for (int i = 1; i <= no; i++) {
            if (i <= n + 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i * j + " ");
                }
            } else {
                for (int j = 1; j <= no-i+1; j++) {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }
}