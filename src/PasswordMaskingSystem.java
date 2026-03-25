package Assignment;

import java.util.Scanner;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() <= 2) {
            System.out.println("Masked password: " + password);
        } else {

            String lastTwo = password.substring(password.length() - 2);
            String masked = "*".repeat(password.length() - 2) + lastTwo;
            System.out.println("Masked password: " + masked);
        }
        sc.close();
    }
}
