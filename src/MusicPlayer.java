package Assignment;

public class MusicPlayer extends Thread {
    @Override
    public void run() {
        System.out.println("Playing song...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Progress " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.start();
    }
}
