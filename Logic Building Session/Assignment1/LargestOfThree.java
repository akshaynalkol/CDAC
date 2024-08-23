import java.util.Scanner;

class LargestOfThree{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter No1 : ");
         int no1=sc.nextInt();
         System.out.println("Enter No2 : ");
         int no2=sc.nextInt();
         System.out.println("Enter No3 : ");
         int no3=sc.nextInt();

         if(no1>no2){
            if(no1>no3){
               System.out.println("Largest Number Is : "+no1);
            }
            else{
               System.out.println("Largest Number Is : "+no3);
            }
         }
         else if(no2>no3){
            System.out.println("Largest Number Is : "+no2);
         }
         else{
            System.out.println("Largest Number Is : "+no3);
         }
    }
}