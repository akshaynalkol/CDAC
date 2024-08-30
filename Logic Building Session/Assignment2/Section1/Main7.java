/*public class Main7 { 
    public static void main(String[] args) { 
        int x = "Hello"; 
        System.out.println(x); 
    } 
}*/
// Error - incompatible types: String cannot be converted to int
//         int x = "Hello";


public class Main7 { 
    public static void main(String[] args) { 
        String x = "Hello"; 
        System.out.println(x); 
    } 
}
// Solution - Why does Java enforce type safety?
// Java enforces type safety to prevent inappropriate memory access.

// Ans - Hello