/*public class Main3 { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    } 
}*/
// Error - 'main' method is not declared with a return type of 'void'


public class Main3 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 
// Solution - Main method must return a value of type void in class
//            public static void main(String[] args)
//////        Why is void used in the main method?
//            It signifies that the method does not return any value. 
//            This is because once the main method finishes execution, the program ends, and there is no further action that can be taken with a return value.
// Ans      - Hello, World!