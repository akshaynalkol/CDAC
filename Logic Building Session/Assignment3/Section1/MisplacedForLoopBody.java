/*public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    } 
}*/
// Error    - {} For Loop


public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) {
            System.out.println(i); 
            System.out.println("Done");
        }			
    } 
} 
// Solution - Use SOP Statement Inside {}
// Ans      - 0
//            Done
//			  1
//			  Done
//			  2
//			  Done
//			  3
//			  Done
//			  4
//			  Done