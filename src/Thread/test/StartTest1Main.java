package Thread.test;

import static util.MyLogger.log;

public class StartTest1Main {
    public static void main(String[] args) {
        CounterThread tread = new CounterThread();
        tread.start();




    }
    static public class CounterThread extends Thread{

        @Override
        public void run() {
            for(int i=0; i < 5; i++){
                log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
