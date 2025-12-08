package ConditionalStatement;

public class ConditionalExample {

	public static void main(String[] args)
	{
		// 1. Given subject marks
		int math = 100;
		int science = 32;
		int english = 46;
		
		// 2. Calculate average
		int total = math+science+english;
		
		float average = total/3.0f;
		
		// Print result
		System.out.println("Math marks = "+ math);
		System.out.println("Science marks = "+ science);
		System.out.println("English marks = "+ english);
		System.out.println("Total Marks = "+ total);
		System.out.println("Average Marks = "+ average);
		
		// Determine
		if(average>=90 && average <= 100) 
		{
			System.out.println("Grade = A+");
			System.out.println("Excellent performance!");
		}
		else if(average>=75) {
			System.out.println("Grade = A");
			System.out.println("Excellent performance!");
		}
		else if(average>=60) {
			System.out.println("Grade = B");
			System.out.println("Keep improving");
		}
		else if(average>=40) {
			System.out.println("Grade = C "  +  "Keep improving");
			//System.out.println("Keep improving");
		}
		else {
			System.out.println("Grade = Fail");
			System.out.println("Please work harder next time");
		}
		
		if(math<35 || science<35 || english<35) {
			System.out.println("Failed due to low score in at least one subject");
		}
	}

}
