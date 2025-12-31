package ScannerProblems;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Reading inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in meters: ");
        float height = sc.nextFloat();

        System.out.print("Are you employed? (true/false): ");
        boolean employed = sc.nextBoolean();

        System.out.print("Enter your yearly salary: ");
        double salary = sc.nextDouble();

        // Printing inputs
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Employed: " + employed);
        System.out.println("Salary: $" + salary);

        sc.close();

	}

}
