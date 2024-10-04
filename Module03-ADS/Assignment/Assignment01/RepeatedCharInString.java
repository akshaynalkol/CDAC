import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class RepeatedCharInString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str=sc.next();
		
		// Hashset 
		/*HashSet<Character> set=new HashSet<Character>();
		ArrayList<Character> list=new ArrayList<>();
		// char ch[]=str.tocCharArray()
		for(char ch:str.toCharArray()){
			if(set.contains(ch))
			   list.add(ch);
			set.add(ch);   
		}
		char ch[]=new char[list.size()];
		for(int i=0;i<list.size();i++){
			ch[i]=list.get(i);
		}
		System.out.println(Arrays.toString(ch));*/
		
		
		// Without Hashset
		boolean[] charSeen = new boolean[256]; // For ASCII characters
        boolean[] charRepeated = new boolean[256]; // To track repeated characters
        for (char ch : str.toCharArray()) {
            if (charSeen[ch]) {
                charRepeated[ch] = true;
            } else {
                charSeen[ch] = true;
            }
        }
        ArrayList<Character> repeatedChars = new ArrayList<>();
        for (char ch = 0; ch < charRepeated.length; ch++) {
            if (charRepeated[ch]) {
                repeatedChars.add(ch);
            }
        }
        char[] result = new char[repeatedChars.size()];
        for (int i = 0; i < repeatedChars.size(); i++) {
            result[i] = repeatedChars.get(i);
        }
		System.out.println(Arrays.toString(result));
	}
}

// Output-
// Input: "programming"
// Output: ['r', 'g', 'm']
// Input: "hello"
// Output: ['l']


// Hashset
// Time Complexity - O(n)
// Space Complexity - O(k) Where, k is unique character in hashset

// Without Hashset
// Time Complexity - O(n)
// Space Complexity - O(1)

// Hashmap & Count


