package StringProblems;

public class PalindromeCheck 
{

	// Method to check palindrome
    public static boolean isPalindrome(String str) 
    {
        str = str.toLowerCase(); // handle case-insensitive check
        int start = 0;
        int end = str.length() - 1;

        while (start < end) 
        {
            if (str.charAt(start) != str.charAt(end)) 
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        String input = "madam";

        System.out.println(isPalindrome(input));
    }
}