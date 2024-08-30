/*public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}*/
// Error -  incompatible types: int cannot be converted to boolean
//         while (count = 0) {

	
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count == 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}
// Solution - count = 0 is not bool do as count == 0
// Ans      - Blank