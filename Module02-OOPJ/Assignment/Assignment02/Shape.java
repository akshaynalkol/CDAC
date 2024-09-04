import java.util.Scanner;

class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a shape :");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.println("Enter your choice (1-4): ");
        int no = sc.nextInt();

        double res = 0;

        switch (no) {
            case 1:
                System.out.println("Enter the radius of the circle : ");
                int r = sc.nextInt();
                res = Math.PI * r * r;
                break;
            case 2:
                System.out.println("Enter the side length of the square : ");
                int s = sc.nextInt();
                res = s * s;
                break;
            case 3:
                System.out.println("Enter the length of the rectangle : ");
                int l = sc.nextInt();
                System.out.println("Enter the width of the rectangle : ");
                int w = sc.nextInt();
                res = l * w;
                break;
            case 4:
                System.out.println("Enter the base of the rectangle : ");
                int b = sc.nextInt();
                System.out.println("Enter the height of the rectangle : ");
                int h = sc.nextInt();
                res = 0.5 * b * h;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid shape.");
                return;
        }

        System.out.printf("The area is : %.2f" ,res);
    }
}
