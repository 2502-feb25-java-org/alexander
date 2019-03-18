import java.util.ArrayList;

/**
 * This program stores the following strings in an ArrayList and saves all the
 * palindromes in another ArrayList. 
 * 
 * "karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john",
 * "refer", "billy", "did"
 * 
 *
 */

public class JavaCodingChallenge {
	
    public static void main(String[] args) {      
    	
    	// create the list of strings
    	ArrayList<String> originalList = new ArrayList<>();
    	
    	// populate the list of strings
    	originalList.add("karan");
    	originalList.add("madam");
    	originalList.add("tom");
    	originalList.add("civic");
    	originalList.add("radar");
    	originalList.add("sexes");
    	originalList.add("jimmy");
    	originalList.add("kayak");
    	originalList.add("john");
    	originalList.add("refer");
    	originalList.add("billy");
    	originalList.add("did");
    	
    	// create the list of palindromes
    	ArrayList<String> palindromeList = new ArrayList<>();
    	
    	// for each string in the list, reverse the string and add to the palindrome test
    	for (int i = 0; i < originalList.size(); i++) {
    		palindromeList.add(reverseString(originalList.get(i)));
    	}
    	
    	//System.out.println(originalList.toString()); // print the original list
    	//System.out.println(palindromeList.toString()); // print palindrome list
    	
    }
    
    // Reverse each string (i.e., obtain a palindrome
    public static String reverseString(String str) {
    	
    	StringBuilder palindrome = new StringBuilder();
    	
    	for (int i = 0; i < str.length(); i++) {
    		palindrome.append(str.charAt(str.length() - i - 1)); // copy from the end
    	}
    	
    	return palindrome.toString();
    }
    
}
