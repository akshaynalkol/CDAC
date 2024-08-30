public class Main15 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
		int result = num1 + num2; 
		System.out.println(result); 
	} 
} 
// Error -  incompatible types: possible lossy conversion from double to int
//          int result = num1 + num2;

// Solution - How should you handle different data types in operations?
// By type casting