import java.lang.Math;
/*public class Main17 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
}*/
// Error - illegal start of expression
//         int result = a ** b;


public class Main17 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        double result = Math.pow(a,b); 
        System.out.println(result); 
    } 
} 
// Solution - Why is the ** operator not valid in Java?
// The ** operator is not valid in Java because Java does not use it for exponentiation (raising a number to the power of another). 
// Unlike some other programming languages like Python, which uses ** for exponentiation, Java handles exponentiation through its standard library.
// In Java, if you want to perform exponentiation, you should use the Math.pow() method. 

// Note - Math.pow()->Returns->Double value.

// Ans- 100000.0