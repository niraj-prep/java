package Assignment;

import java.util.Scanner;

public class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Case-Sensitive: Names are equal");
        } else {
            System.out.println("Case-Sensitive: Names are not equal");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-Insensitive: Names are equal");
        } else {
            System.out.println("Case-Insensitive: Names are not equal");
        }
        sc.close();
    }
}
