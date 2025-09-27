package practice;

import static util.MyLogger.log;

public class MainThread2 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        new Thread(thread1, "counter").start();
    }
    static public class Thread1 implements Runnable {

        @Override
        public void run() {
            for(int i =1; i <= 5; i++){
                log("values: "+ i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
