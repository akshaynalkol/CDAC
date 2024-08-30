/*public class Main9 { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
}*/
/* Error - error: not a statement
 int class = 10;
 ^
error: ';' expected
 int class = 10;
    ^
error: <identifier> expected
 int class = 10;
          ^
error: illegal start of expression
 System.out.println(class);
                    ^
error: <identifier> expected
 System.out.println(class);*/
 

public class Main9 { 
    public static void main(String[] args) { 
        int no = 10; 
        System.out.println(no); 
    } 
}  
// Solution - Why can't reserved keywords be used as identifiers?
// No, reserved words in Java, such as int, class, static, etc. cannot be used as identifiers.
// Reserved words have predefined meanings in the language's syntax and using them as identifiers would lead to confusion and syntax errors.

// Ans - 10