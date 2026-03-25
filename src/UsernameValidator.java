package Assignment;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        username = username.trim();

        username = username.toLowerCase();

        System.out.println("Cleaned username: " + username);
        sc.close();
    }
}
