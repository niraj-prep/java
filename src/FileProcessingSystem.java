package Assignment;

public class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");

            throw new Exception("File not found");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {

            System.out.println("Closing file resources");
        }
    }
}
