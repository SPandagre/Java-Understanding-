package StringProblems;

public class VowelConsonants 
{
	    // Method to count and print vowels and consonants
	    public static void countVowelsAndConsonants(String sentence) 
	    {
	        int vowels = 0;
	        int consonants = 0;

	        sentence = sentence.toLowerCase();

	        for (int i = 0; i < sentence.length(); i++) 
	        {
	            char ch = sentence.charAt(i);

	            // Check only alphabet characters
	            if (ch >= 'a' && ch <= 'z')
	            {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	                {
	                    vowels++;
	                }
	                else 
	                	
	                {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }

	    public static void main(String[] args) {
	        String sentence = "Hello World";
	        countVowelsAndConsonants(sentence);
	    }
	}