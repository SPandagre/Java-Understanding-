package StringProblems;

public class ConvertfirstlettertoUppercase 
{
	public static void main(String[] args) 
	{
		String input = "java is fun";
        String result = "";

        input = input.toLowerCase();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) 
        {
            if (!words[i].isEmpty()) 
            {
                result += Character.toUpperCase(words[i].charAt(0))
                        + words[i].substring(1) + " ";
            }
        }

        System.out.println(result.trim());

	}

}
