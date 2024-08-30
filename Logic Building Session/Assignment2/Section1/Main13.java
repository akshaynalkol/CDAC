public class Main13 { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
// Error - Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null

// Solution -
// Null means nothing. Its just a literal. Null is the value of reference variable. means that (null) or "no value at all" is assigned 
// But empty string is blank. It gives the length=0.(str=""). Empty string is a blank value, means the string does not have any thing.
// No method can be invoked on a object which is assigned a NULL value