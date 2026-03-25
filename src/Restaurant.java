package Assignment;

public class Restaurant {
    private boolean foodPrepared = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodPrepared = true;
        notify();
    }

    synchronized void serveFood() {
        while (!foodPrepared) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Thread waiterThread = new Thread(() -> restaurant.serveFood());

        Thread chefThread = new Thread(() -> restaurant.prepareFood());

        waiterThread.start();
        chefThread.start();
    }
}
