class OddThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println("Odd : " + i);
            try {
                Thread.sleep(500); // 500 ms delay
            } catch (InterruptedException e) {
                System.out.println("Odd thread interrupted");
            }
        }
    }
}

class EvenThread extends Thread {

    public void run() {
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println("Even : " + i);
            try {
                Thread.sleep(500); // 500 ms delay
            } catch (InterruptedException e) {
                System.out.println("Even thread interrupted");
            }
        }
    }
}

public class Q10 {
    public static void main(String[] args) {

        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();

        t1.start();   // start odd thread
        t2.start();   // start even thread
    }
}
