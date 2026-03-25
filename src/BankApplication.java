package Assignment;

public class BankApplication {

    static void processTransaction(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Negative transaction amount not allowed");
        }
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        try {
            processTransaction(-500);
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}
