/*public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}*/
// Error    -  incompatible types: int cannot be converted to boolean
//             while (num = 10) {


public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num == 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}
// Solution - while(num==10)
// Ans      - 0 1 2 3 4   