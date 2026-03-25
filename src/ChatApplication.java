package Assignment;

public class ChatApplication {
    public static void main(String[] args) {

        Thread sender = new Thread(() -> {
            String[] messages = {"Hello!", "How are you?", "Goodbye!"};
            for (String msg : messages) {
                System.out.println("Sending: " + msg);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread receiver = new Thread(() -> {
            String[] messages = {"Hi!", "I'm fine, thanks!", "See you!"};
            for (String msg : messages) {
                System.out.println("Received: " + msg);
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        System.out.println("Sender state: " + sender.getState());
        sender.start();
        receiver.start();
        System.out.println("Sender state: " + sender.getState());
        System.out.println("Receiver state: " + receiver.getState());
    }
}
