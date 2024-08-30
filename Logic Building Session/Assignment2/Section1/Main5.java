public class Main5 { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
	
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
}
// Solution - From the above program, we can say that Java can have multiple main methods but with the concept of overloading. 
// There should be only one main method with parameter as string[ ] arg. 

// Ans - Main method with String[] args