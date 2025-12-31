package StringProblems;

public class PalindromeCheckWithoutMethod
{

	public static void main(String[] args) 
	{

        String input = "madam";
        input = input.toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) 
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome);
    }
}