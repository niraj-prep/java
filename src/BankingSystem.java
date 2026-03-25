package Assignment;

public class BankingSystem {
    private double balance = 1000;

    void withdraw(String threadName, double amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(threadName + " withdrawing: " + amount);
                balance -= amount;
                System.out.println(threadName + " remaining balance: " + balance);
            } else {
                System.out.println(threadName + ": Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        Thread t1 = new Thread(() -> bank.withdraw("Thread-1", 400));
        Thread t2 = new Thread(() -> bank.withdraw("Thread-2", 500));
        Thread t3 = new Thread(() -> bank.withdraw("Thread-3", 300));

        t1.start();
        t2.start();
        t3.start();
    }
}
