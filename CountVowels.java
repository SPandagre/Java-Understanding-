package StringProblems;

public class CountVowels {

	 public static void main(String[] args) {
	        // check how many vowels are there
	        String str = "Eello how are you";
	        int count = 0;

	        // Convert string to lowercase to handle both cases
	        str = str.toLowerCase();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch == 'a' || ch == 'e' || ch == 'i' || 
	                ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	        System.out.println("Number of vowels: " + count);
	 }
}
/*Convert the string to lowercase to avoid checking both uppercase and lowercase vowels.
Loop through each character.
Increase the counter when a vowel is found.*/