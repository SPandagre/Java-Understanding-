package ScannerProblems;

import java.util.Scanner;

public class PrintVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Reading values
        System.out.print("Enter integer value: ");
        int i = sc.nextInt();

        System.out.print("Enter float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter boolean value: ");
        boolean b = sc.nextBoolean();

        sc.nextLine(); // clear buffer

        System.out.print("Enter string value: ");
        String s = sc.nextLine();

        // Printing values
        System.out.println("\n--- Printed Values ---");
        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
        System.out.println("String: " + s);

        sc.close();

	}

}
