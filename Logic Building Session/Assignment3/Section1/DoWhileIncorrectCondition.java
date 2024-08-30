/*public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
    } 
}*/ 
// Error    - Infinite Loop --> i--


public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <10); 
    } 
}
// Solution - while(num<10)
// Ans      - 0 1 2 3 4 5 6 7 8 9
