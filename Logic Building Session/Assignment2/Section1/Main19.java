/*public class Main19 { 
    public static void main(String[] args) { 
		int a = 10; 
		int b = 0.0f; 
		int  result = a / b; 
		System.out.println(result); 
	} 
}*/ 
// Error - Exception in thread "main" java.lang.ArithmeticException: / by zero


public class Main19 { 
    public static void main(String[] args) { 
		double a = 10; 
		double b = 0; 
		double  result = a / b; 
		System.out.println(result); 
	} 
} 
// Solution - Why does division by zero cause an issue in Java?
// As a result, we consider dividing by zero to be undefinable or undefined on computers. 
// Values like INFINITY and NaN are available for floating-point numbers but not for integers.
// As a result, dividing an integer by zero will result in an arithmetic exception. 
// However, for a float or double, Java allows the operation.(Returns Infinity as an answer)

// Ans -Infinity