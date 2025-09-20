package Thread.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        PrintWork a = new PrintWork(1000, "A");
        PrintWork b = new PrintWork(500, "B");

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        threadA.start();
        threadB.start();



    }

    static public class PrintWork implements Runnable {
        public String contents;
        public int sleepMs;

        public PrintWork(int sleepMs, String contetn) {
            this.sleepMs = sleepMs;
            this.contents = contetn;
        }

        @Override
        public void run() {
            while (true) {
                log(contents);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
