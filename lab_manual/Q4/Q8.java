class JoinThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Q8 {
    public static void main(String[] args) {

        JoinThread t = new JoinThread();
        t.start();

        try {
            t.join();   // main thread waits here
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}
