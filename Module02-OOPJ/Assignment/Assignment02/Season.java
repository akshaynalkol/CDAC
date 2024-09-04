import java.util.Scanner;

class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month (1-12) : ");
        int month = sc.nextInt();
        
        String season;

        switch (month) {
            case 12,1,2:
                season = "Winter";
                break;
            case 3,4,5:
                season = "Spring";
                break;
            case 6,7,8:
                season = "Summer";
                break;
            case 9:
            case 10: 
            case 11:
                season = "Autumn";  
                break;
            default:
                season = "Invalid month";
                break;
        }
        System.out.println("The season is: " + season);
    }
}
