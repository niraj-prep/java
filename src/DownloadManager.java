package Assignment;

public class DownloadManager implements Runnable {
    private String fileName;

    DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + "...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(fileName + " download complete.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager("File1.pdf"));
        Thread t2 = new Thread(new DownloadManager("File2.mp3"));
        Thread t3 = new Thread(new DownloadManager("File3.zip"));

        t1.start();
        t2.start();
        t3.start();
    }
}
