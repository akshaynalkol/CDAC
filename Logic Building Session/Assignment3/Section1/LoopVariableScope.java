/*public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
}*/
// Error    -  cannot find symbol
//             System.out.println(x); // Error: 'x' is not accessible here
//                    ^
//             symbol:   variable x
//             location: class LoopVariableScope


/*
int x;
variable x might not have been initialized
System.out.println(x); // Error: 'x' is not accessible here
*/


public class LoopVariableScope { 
    public static void main(String[] args) {
        int x=1;		
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); 
    } 
}  
// Solution - int x=1;
// Ans      - 8