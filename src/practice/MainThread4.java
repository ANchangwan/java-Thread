package practice;

import static util.MyLogger.log;

public class MainThread4 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadMain("A", 1000), "Thread-A");
        Thread threadB = new Thread(new ThreadMain("B", 500), "Thread-B");
        threadA.start();
        threadB.start();


    }
    static class ThreadMain implements Runnable {
        private String Contents;
        private int sleepMs;

        public ThreadMain(String contents, int sleepMs) {
            Contents = contents;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while(true) {
                log(Contents);
                try{
                    Thread.sleep(sleepMs);
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
