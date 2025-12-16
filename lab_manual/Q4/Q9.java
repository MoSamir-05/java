class IncrementThread extends Thread {

    public void run() {
        int value = 0;

        for (int i = 1; i <= 5; i++) {
            value = value + 1;
            System.out.println("Value : " + value);

            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class Q9 {
    public static void main(String[] args) {

        IncrementThread t = new IncrementThread();
        t.start();
    }
}
