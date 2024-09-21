import java.util.Scanner;

class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. : ");
        int no = sc.nextInt();

        for (int i = no; i >= 1; i--) {
            if (i == no) {
                System.out.println(0);
            }
            for (int j = i; j <= no; j++) {
                System.out.print(j);
            }
            System.out.print(0);
            for (int j = no; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}