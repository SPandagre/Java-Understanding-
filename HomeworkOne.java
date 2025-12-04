package firstpackage;

public class HomeworkOne {

	public static void main(String[] args) 
	{
		/* Write a Java program to do the following:
			1. Store marks of 3 subjects: Math, Science, and English (use int data type).
			2. Calculate the total marks using arithmetic operators.
			3. Calculate the average marks using a suitable data type.
			4. Print both the total and average.
			5. Change the data type of average variable and note the difference
	    */
		
		// 1. Store marks of 3 subjects (int data type)
        int math = 85;
        int science = 90;
        int english = 80;

        // 2. Calculate total marks
        int total = math + science + english;

        // 3. Calculate average marks (using double for decimal accuracy)
        double average = total / 3.0;

        // 4. Print total and average
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks (double): " + average);

        // 5. Change data type of average to int
        int avgInt = total / 3;

        // Note the difference
        System.out.println("Average Marks (int): " + avgInt);
    }
}