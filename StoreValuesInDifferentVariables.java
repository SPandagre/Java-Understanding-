package ScannerProblems;

import java.util.Scanner;

public class StoreValuesInDifferentVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Enter your weight: ");
        float weight = sc.nextFloat();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
        System.out.println("Weight: " + weight);

        sc.close();

	}

}
