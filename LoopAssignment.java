package Loops;

public class LoopAssignment {

	public static void main(String[] args) 
	
	{
		for (int i = 1; i <= 100; i++) 
		    /*int i = 1 → Loop starts at 1
			     i <= 100 → Goes up to 100
			     i++ → Increases i by 1 each time*/		
		  {

		    if (i % 5 == 0) // if this condition is True , go inside Continue statement & it will run and skip multiples of 5.
		                    /* % is the modulus operator, i % 5 gives the remainder when i is divided by 5
                                For multiples of 5, remainder = 0
                                Example: 5, 10, 15, 20…....So this condition becomes true for multiples of 5.*/
		   {
		        continue; // Skip multiples of 5
		   }

		    System.out.print(i + " ");
		}
	}

}
