package practice;

import static util.MyLogger.log;

public class Main3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
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
        }, "CounterThread");
        thread1.start();
    }
}
