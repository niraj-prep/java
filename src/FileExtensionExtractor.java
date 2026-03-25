package Assignment;

import java.util.Scanner;

public class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name (e.g., report.pdf): ");
        String fileName = sc.nextLine();

        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1) {
            String extension = fileName.substring(dotIndex + 1);
            System.out.println("File Extension: " + extension);
        } else {
            System.out.println("No file extension found.");
        }
        sc.close();
    }
}
