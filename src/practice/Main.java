package practice;

import static util.MyLogger.log;

public class Main {
    public static void main(String[] args) {
        CounterThread thread = new CounterThread();
        thread.start();

    }
    static public class CounterThread extends Thread {
        public String contents;
        public int counter;
        @Override
        public void run() {
            for(int i =0; i < 5; i++){
                log("value: " + (i+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }
    }
}
