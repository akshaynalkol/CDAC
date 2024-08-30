/*public class Main6 { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
}*/
// Error - cannot find symbol
//         int x = y + 10;
//               ^
//         symbol:   variable y


public class Main6 { 
    public static void main(String[] args) { 
	    int y = 10;
        int x = y + 10; 
        System.out.println(x); 
    } 
} 
// Solution -  Why must variables be declared?
// Declaration of a variable in Java involves specifying its data type and name. 
// This informs the compiler about the type of data the variable will hold and how much memory to allocate for it.

// Ans - 20