package practice;

import static util.MyLogger.log;

public class Main2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new CounterThread(), "CounterThread");
        thread1.start();
    }
    static public class CounterThread implements Runnable {
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
