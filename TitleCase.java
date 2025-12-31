package StringProblems;

/* Convert each word’s first letter to uppercase (Title Case) 
 * ➢ Example: Input: "java is fun" Output: "Java Is Fun"*/

public class TitleCase {

	// Method to convert sentence to Title Case
	
    public static String toTitleCase(String sentence) 
    {
        String[] words = sentence.toLowerCase().split(" ");
        String result = "";

        for (String word : words) 
        {
            if (!word.isEmpty()) 
            {
                result += Character.toUpperCase(word.charAt(0))
                        + word.substring(1) + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) 
    {
        String input = "java is fun";
        System.out.println(toTitleCase(input));
    }
}
