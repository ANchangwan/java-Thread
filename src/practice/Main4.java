package practice;

import static util.MyLogger.log;

public class Main4 {
    public static void main(String[] args) {
        MyThread a = new MyThread("A", 1000);
        MyThread b = new MyThread("B", 500);
        Thread threadA = new Thread(a, "Thread-A");
        Thread threadB = new Thread(b, "Thread-B");
        threadA.start();
        threadB.start();

    }

    static class MyThread implements Runnable {
        public String contents;
        public int sleepMs;

        public MyThread(String contents, int sleepMs) {
            this.contents = contents;
            this.sleepMs = sleepMs;

        }

        @Override
        public void run() {
            while (true) {
                log(this.contents);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
