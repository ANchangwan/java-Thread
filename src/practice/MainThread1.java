package practice;

import static util.MyLogger.log;

public class MainThread1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
    }
    static public class Thread1 extends Thread {

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
