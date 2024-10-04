import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class FirstNonReapeatedChar{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str=sc.next();
		
		// Hashset 
		/*HashMap<Character, Integer> map=new HashMap<>();
		for(char ch:str.toCharArray()){
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for(char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
               System.out.println(ch);
			   return;
            }
        }
		System.out.println("null");*/
		
		
		// Without Hashset
		int count[]=new int[256];
		for(char ch:str.toCharArray()){
			count[ch]++;
		}
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)]==1){
				System.out.println(str.charAt(i));
			   return;
			}
		}
		System.out.println("null");
	}
}

// Output-
// Input: "programming"
// Output: ['r', 'g', 'm']
// Input: "hello"
// Output: ['l']


// HashMap
// Time Complexity - O(n)
// Space Complexity - O(k) Where, k is unique character in hashmap

// Without Hashset
// Time Complexity - O(n)
// Space Complexity - O(1)