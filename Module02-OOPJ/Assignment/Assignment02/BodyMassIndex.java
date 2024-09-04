import java.util.Scanner;

class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height in meter : ");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in kg : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
        if (bmi < 18.5) {
            System.out.print("underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.print("Healthy");
        } else if (bmi >= 24.9 && bmi < 30) {
            System.out.print("overweight");
        } else if (bmi >= 30) {
            System.out.print("Suffering from Obesity");
        }
    }
}
