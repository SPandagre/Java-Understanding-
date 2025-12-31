package StringProblems;

public class ReverseString {

	public static void main(String[] args) 
	{
        String str = "Java";
        String reversed = "";

        for (int i = str.length()- 1; i >= 0; i--) 
        {
        	char c = str.charAt(i);
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed  a String: " + reversed);
    }
	
    }


