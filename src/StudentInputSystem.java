package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new ArithmeticException("Age must be positive");
            }

            System.out.println("Student age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        sc.close();
    }
}
