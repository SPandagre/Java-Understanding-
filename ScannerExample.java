package ScannerProblems;

import java.util.Scanner;

public class ScannerExample
 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter int value: ");
        int intValue = sc.nextInt();

        System.out.print("Enter float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter double value: ");
        double doubleValue = sc.nextDouble();

        System.out.print("Enter boolean value: ");
        boolean booleanValue = sc.nextBoolean();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter String value: ");
        String stringValue = sc.nextLine();

        System.out.println("\n--- Output ---");
        System.out.println("Int: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("String: " + stringValue);

        sc.close();

	}

}
