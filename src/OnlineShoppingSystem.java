package Assignment;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Thread paymentThread = new Thread(() -> {
            System.out.println("Processing payment...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Payment successful.");
        });

        Thread orderThread = new Thread(() -> {
            System.out.println("Order confirmed...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Order is being shipped.");
        });

        paymentThread.start();
        orderThread.start();
    }
}
