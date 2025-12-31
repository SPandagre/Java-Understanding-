package StringProblems;

public class ReverseWithoutUsingExtraVariable {

	// Method to reverse string without extra variable
    
	public static void reverseString(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            // swap characters
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed String: " + String.valueOf(ch));
    }

    public static void main(String[] args) {
        String input = "Java";
        reverseString(input);
    }
}