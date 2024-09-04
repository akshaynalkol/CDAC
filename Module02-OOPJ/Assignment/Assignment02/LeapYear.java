import java.util.Scanner;

class LeapYear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int y=sc.nextInt();

        // Using If Else
        // if((y%4==0 && y%100!=0) || y%400==0){
        //     System.out.println(y +" is a Leap Year."); 
        // }
        // else{
        //     System.out.println(y +" is not a Leap Year."); 
        // }

        // if (y % 4 == 0) {
        //     if (y % 100 == 0) {
        //         if (y % 400 == 0) {
        //             System.out.println(y + " is a Leap Year.");
        //         } else {
        //             System.out.println(y + " is not a Leap Year.");
        //         }
        //     } else {
        //         System.out.println(y + " is a Leap Year.");
        //     }
        // } 
        // else {
        //     System.out.println(y + " is not a Leap Year.");
        // }


        // Using Switch
        switch (y%4) {
            case 0:
                switch (y%100) {
                    case 0:
                        switch (y%400){
                            case 0:
                                System.out.println(y+" is a Leap Year");
                                break;
                            default:
                                System.out.println(y + " is not Leap Year.");
                        }
                        break;
                    default:
                        System.out.println(y + " is a Leap Year.");
                }
                break;
            default:
                System.out.println(y + " is not Leap Year.");
        }

    }
}