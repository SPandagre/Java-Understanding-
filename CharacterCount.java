package StringProblems;

/*Count how many times a character appears 
 * ➢ Example: Input: "banana", char = 'a' Output: 3*/

public class CharacterCount 
{
	public static void main(String[] args) 
	{
        String input = "banana";
        char target = 'a';
        int count = 0;

        input = input.toLowerCase();
        target = Character.toLowerCase(target);

        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == target) 
            {
                count++;
            }
        }

        System.out.println(count);
    }
}